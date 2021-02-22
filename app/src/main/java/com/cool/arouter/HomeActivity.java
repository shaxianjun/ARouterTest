package com.cool.arouter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.cool.arouter.jump.SrcActivity;
import com.cool.arouter.service.user.SerivceActivity;
import com.cool.arouter.web.SrcUrlSendActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

    }

    public void test1(View view) {
        Intent intent = new Intent(this, SrcActivity.class);
        startActivity(intent);
    }

    public void test2(View view) {
        Intent intent = new Intent(this, SerivceActivity.class);
        startActivity(intent);
    }

    public void test3(View view) {
        Intent intent = new Intent(this, SrcUrlSendActivity.class);
        startActivity(intent);
    }

    public void test4(View view) {
        Intent intent = new Intent(this, SrcActivity.class);
        startActivity(intent);
    }



}
