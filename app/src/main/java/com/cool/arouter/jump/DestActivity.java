package com.cool.arouter.jump;

import android.os.Bundle;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.cool.arouter.R;

import androidx.appcompat.app.AppCompatActivity;


// 在支持路由的页面上添加注解(必选)
// 这里的路径需要注意的是至少需要有两级，/xx/xx
@Route(path = "/mygroup/destactivity")
public class DestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dest);

        TextView tv = (TextView)findViewById(R.id.text);
        tv.setText(getIntent().getStringExtra("key"));

    }
}
