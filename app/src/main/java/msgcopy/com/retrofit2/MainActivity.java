package msgcopy.com.retrofit2;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import msgcopy.com.retrofit2.model.InfoEntity;
import msgcopy.com.retrofit2.model.ProfileEntity;
import msgcopy.com.retrofit2.model.SignEntity;
import msgcopy.com.retrofit2.model.UserEntity;
import rx.Subscriber;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private TextView mTv;

    private Subscriber<UserEntity> subscriberPost;
    private Subscriber<InfoEntity> subscriberGet;
    private Subscriber<ProfileEntity> sGetWithCookie;
    private Subscriber<SignEntity> sPutWithCookie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTv = (TextView) findViewById(R.id.mTv);


    }


    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.postSetCookie:
                loginSetCookie();
                break;
            case R.id.get:
                getHttp();
                break;
            case R.id.getCookie:
                getWithCookie();
                break;
            case R.id.post:
//                APIHttp.post();
                break;
            case R.id.postCookie:
//                APIHttp.postCookie();
                break;
            case R.id.put:
                putWithCookie();
                break;
            case R.id.deleteCookie:
//                deleteWithCookie();
                break;
            case R.id.image:
//                imageHttp();
                break;
            case R.id.imageCache:
//                imageCache();
                break;
        }

    }

    private void putWithCookie() {
        View view = getLayoutInflater().inflate(R.layout.layout_edit_input_dialog, null);
        final EditText editText = (EditText) view.findViewById(R.id.input);
        AlertDialog alertDialog = new AlertDialog.Builder(this)
                .setTitle("请输入要修改的昵称")
                .setView(view)
                .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String niname = editText.getText().toString();
                        sPutWithCookie = new Subscriber<SignEntity>() {
                            @Override
                            public void onCompleted() {
                                Toast.makeText(MainActivity.this, "请求成功", Toast.LENGTH_SHORT).show();
                                Log.i(TAG, "onCompleted:");
                            }

                            @Override
                            public void onError(Throwable onError) {
                                mTv.setText("" + onError.getMessage());
                                Log.i(TAG, "onError" + onError.getMessage());
                            }

                            @Override
                            public void onNext(SignEntity sign) {
                                mTv.setText("getCookie:" + sign.getMaster().getFirst_name());
                                Log.i(TAG, "onNext:");

                            }
                        };
                        new HttpUser().putWithCookie(sPutWithCookie,niname);
                    }
                })
                .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .create();
        alertDialog.show();
    }

    private void getWithCookie() {
        //git请求
        sGetWithCookie = new Subscriber<ProfileEntity>() {
            @Override
            public void onCompleted() {
                Toast.makeText(MainActivity.this, "请求成功", Toast.LENGTH_SHORT).show();
                Log.i(TAG, "onCompleted:");
            }

            @Override
            public void onError(Throwable onError) {
                mTv.setText("" + onError.getMessage());
                Log.i(TAG, "onError" + onError.getMessage());
            }

            @Override
            public void onNext(ProfileEntity pro) {
                mTv.setText("getCookie:" + pro.getFirst_name());
                Log.i(TAG, "onNext:");

            }
        };
        new HttpUser().getGetWithData(sGetWithCookie);
    }

    private void loginSetCookie() {
        //post请求
        subscriberPost = new Subscriber<UserEntity>() {
            @Override
            public void onCompleted() {
                Toast.makeText(MainActivity.this, "请求成功", Toast.LENGTH_SHORT).show();
                Log.i(TAG, "onCompleted:");
            }

            @Override
            public void onError(Throwable onError) {
                mTv.setText("" + onError.getMessage());
                Log.i(TAG, "onError" + onError.getMessage());
            }

            @Override
            public void onNext(UserEntity userEntity) {
                mTv.setText("login:" + userEntity.getFirst_name());
                Log.i(TAG, "onNext:");

            }
        };
        new HttpUser().getLogin(subscriberPost, "Android", "1234", "00000000");
    }

    public void getHttp() {
        //git请求
        subscriberGet = new Subscriber<InfoEntity>() {
            @Override
            public void onCompleted() {
                Toast.makeText(MainActivity.this, "请求成功", Toast.LENGTH_SHORT).show();
                Log.i(TAG, "onCompleted:");
            }

            @Override
            public void onError(Throwable onError) {
                mTv.setText("" + onError.getMessage());
                Log.i(TAG, "onError" + onError.getMessage());
            }

            @Override
            public void onNext(InfoEntity info) {
                mTv.setText("get:" + info.getTitle());
                Log.i(TAG, "onNext:");

            }
        };
        new HttpUser().getGetData(subscriberGet);
    }
}
