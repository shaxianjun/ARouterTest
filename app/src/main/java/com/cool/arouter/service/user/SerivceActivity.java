package com.cool.arouter.service.user;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.launcher.ARouter;
import com.cool.arouter.R;
import com.cool.arouter.service.provider.ILogin;


public class SerivceActivity extends AppCompatActivity {


    @Autowired(name = "/service/login1")
    ILogin login1;

    @Autowired(name = "/service/login2")
    ILogin login2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serivce);



        //暴露服务
        ARouter.getInstance().inject(this);
        login1.login(this,"shaxj","123465");

        login2.login(this,"shaxj","123465");

    }
}
