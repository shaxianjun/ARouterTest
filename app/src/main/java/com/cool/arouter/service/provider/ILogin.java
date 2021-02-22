package com.cool.arouter.service.provider;

import android.content.Context;

import com.alibaba.android.arouter.facade.template.IProvider;

public interface ILogin extends IProvider {
    void login(Context context, String name, String password);
}
