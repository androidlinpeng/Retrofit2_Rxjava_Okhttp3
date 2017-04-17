package msgcopy.com.retrofit2;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Environment;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import msgcopy.com.retrofit2.model.InfoEntity;
import msgcopy.com.retrofit2.model.ProfileEntity;
import msgcopy.com.retrofit2.model.SignEntity;
import msgcopy.com.retrofit2.model.UserEntity;
import msgcopy.com.retrofit2.service.UserService;
import okhttp3.Cache;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by liang on 2017/4/17.
 */

public class HttpUser {
    private static final String TAG = "HttpUser";
    public static final int HTTP_CACHE_SIZE = 100 * 1024 * 1024;
    public static final int HTTP_READ_TIMEOUT = 15 * 1000;
    public static final int HTTP_WRITE_TIMEOUT = 10 * 1000;
    public static final int HTTP_CONNECT_TIMEOUT = 10 * 1000;
    private static final String HTTP_CACHE_DIR = "http";

    private Retrofit retrofit;
    private UserService userService;

    public void putWithCookie(Subscriber<SignEntity> subscriber,String first_name) {
        userService = getRetrofit().create(UserService.class);
        userService.putWithCookie(first_name)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    public void getGetWithData(Subscriber<ProfileEntity> subscriber) {
        userService = getRetrofit().create(UserService.class);
        userService.getGetWithData()
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);

    }

    public void getGetData(Subscriber<InfoEntity> subscriber) {
        userService = getRetrofit().create(UserService.class);
        userService.getGetData()
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);

    }

    public void getLogin(Subscriber<UserEntity> subscriber, String username, String password, String imei) {
        userService = getRetrofit().create(UserService.class);
        userService.login(username, password, imei)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);

    }

    public Retrofit getRetrofit() {
        //
        Gson gson = new GsonBuilder().create();
        GsonConverterFactory gsonConverterFactory = GsonConverterFactory.create(gson);
        //
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        //
        OkHttpClient.Builder okbuilder = new OkHttpClient.Builder();
        okbuilder.readTimeout(HTTP_READ_TIMEOUT, TimeUnit.SECONDS);
        okbuilder.writeTimeout(HTTP_WRITE_TIMEOUT, TimeUnit.SECONDS);
        okbuilder.connectTimeout(HTTP_CONNECT_TIMEOUT, TimeUnit.SECONDS);
        okbuilder.cache(new Cache(getHttpCacheDir(MyApplication.getContext()), HTTP_CACHE_SIZE));
        okbuilder.interceptors().add(new ReceivedCookiesInterceptor(MyApplication.getContext()));
        okbuilder.interceptors().add(new AddCookiesInterceptor(MyApplication.getContext()));

        // 适配器
        retrofit = new Retrofit.Builder()
                .client(okbuilder.build())
                .addConverterFactory(gsonConverterFactory)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .baseUrl(APIUrl.URL_DOMAIN)
                .build();
        return retrofit;
    }

    public class AddCookiesInterceptor implements Interceptor {
        private Context context;

        public AddCookiesInterceptor(Context context) {
            super();
            this.context = context;
        }
        @Override
        public Response intercept(Chain chain) throws IOException {
            final Request.Builder builder = chain.request().newBuilder();
            builder.addHeader("cookie",getCookie(context));
            Log.i(TAG,"cookie:"+getCookie(context));
            return chain.proceed(builder.build());
        }
    }

    public class ReceivedCookiesInterceptor implements Interceptor {

        private Context context;

        public ReceivedCookiesInterceptor(Context context) {
            super();
            this.context = context;
        }
        @Override
        public Response intercept(Chain chain) throws IOException {
            Response originalResponse = chain.proceed(chain.request());
            //这里获取请求返回的cookie
            if (!originalResponse.headers("Set-Cookie").isEmpty()) {
                setCookie(context,String.valueOf(originalResponse.headers("Set-Cookie")));
            }
            return originalResponse;
        }
    }

    private static final String COOKIE = "cookie";

    public String getCookie(Context context){
        SharedPreferences sharedPreferences = context.getSharedPreferences(COOKIE, Context.MODE_PRIVATE);
        return sharedPreferences.getString(COOKIE, "");
    }
    public String setCookie(Context context,String cookie){
        SharedPreferences sharedPreferences = context.getSharedPreferences(COOKIE, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(COOKIE, cookie);
        editor.commit();
        return null;
    }

    //缓存
    public static File getHttpCacheDir(Context context) {
        if (Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)) {
            return new File(context.getExternalCacheDir(), HTTP_CACHE_DIR);
        }
        return new File(context.getCacheDir(), HTTP_CACHE_DIR);
    }
}

































