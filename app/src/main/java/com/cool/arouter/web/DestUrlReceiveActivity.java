package com.cool.arouter.web;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.facade.callback.NavCallback;
import com.alibaba.android.arouter.launcher.ARouter;
import com.cool.arouter.R;

public class DestUrlReceiveActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dest_url_receive);
        ARouter.getInstance().inject(this);


        String scheme = getIntent().getData().getScheme();
        int port = getIntent().getData().getPort();
        String query = getIntent().getData().getQuery();
        String host = getIntent().getData().getHost();
        String url = getIntent().getData().getQueryParameter("url");
        Log.i("shaxj"," scheme:"+scheme +
                " port: "+ port+
                " query: "+ query+
                " host: "+ host+
                " url: "+ url
        );


        //对URI 数据分发
        Uri uri = getIntent().getData();
        ARouter.getInstance().build(uri).navigation(this, new NavCallback() {
            @Override
            public void onArrival(Postcard postcard) {
                finish();
            }
        });
    }
}
