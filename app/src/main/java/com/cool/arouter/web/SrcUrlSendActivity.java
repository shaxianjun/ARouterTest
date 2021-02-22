package com.cool.arouter.web;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.cool.arouter.R;

public class SrcUrlSendActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_src_url_send);
    }


    public void jump(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("arouter://shaxj/"));
        startActivity(intent);
    }


    public void jumpWithParam(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("arouter://shaxj?url=https://www.baidu.com/"));
        startActivity(intent);
    }


}
