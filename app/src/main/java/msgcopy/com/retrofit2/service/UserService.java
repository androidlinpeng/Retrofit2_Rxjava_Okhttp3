package msgcopy.com.retrofit2.service;

import msgcopy.com.retrofit2.APIUrl;
import msgcopy.com.retrofit2.model.InfoEntity;
import msgcopy.com.retrofit2.model.ProfileEntity;
import msgcopy.com.retrofit2.model.SignEntity;
import msgcopy.com.retrofit2.model.UserEntity;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import rx.Observable;

/**
 * Created by liang on 2017/4/17.
 */

public interface UserService {
    @FormUrlEncoded
    @POST(APIUrl.path_login_post)
    Observable<UserEntity> login(@Field("username") String username, @Field("password") String password, @Field("imei") String imei);

    @GET(APIUrl.path_info_get)
    Observable<InfoEntity> getGetData();

    @GET(APIUrl.path_info_get_cookie)
    Observable<ProfileEntity> getGetWithData();

    @FormUrlEncoded
    @PUT(APIUrl.path_info_put)
    Observable<SignEntity> putWithCookie(@Field("first_name") String first_name);
}











