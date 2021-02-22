package com.cool.arouter.jump;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.launcher.ARouter;
import com.cool.arouter.R;

public class SrcActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_src);
    }

    public void jump(View v) {

        startActivity(new Intent(this,DestActivity.class));

        //发起路由跳转
//        ARouter.getInstance().build("/mygroup/destactivity").navigation();


        //startActivityForResult
//        ARouter.getInstance().build("/mygroup/destactivity").navigation(this,0);




        ARouter.getInstance()
                .build("/mygroup/destactivity")
                .withString( "key" , "123")  //参数：键：key 值：123
                .navigation();
    }

}
