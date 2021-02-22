package com.cool.arouter.service.user;

import android.content.Context;

import com.alibaba.android.arouter.facade.template.IProvider;

public interface ILogin extends IProvider {
    void login(Context context, String name, String password);
}




