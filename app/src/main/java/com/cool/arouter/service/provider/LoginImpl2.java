package com.cool.arouter.service.provider;

import android.content.Context;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;

@Route(path = "/service/login2",name = "登录服务2")
public class LoginImpl2 implements ILogin{
    @Override
    public void login(Context context, String name, String password) {
        Toast.makeText(context , "正在登录2", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void init(Context context) {

    }
}
