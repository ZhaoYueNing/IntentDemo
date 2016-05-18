package com.zhao.intentdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class OtherActivity extends AppCompatActivity  {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        //从intent中获取bundle
        Bundle bundle = getIntent().getExtras();
        //从bundle中获取传输对应的key为info的字符串
        String info = bundle.getString("info");
        //设置textview为传递过来的信息
        ((TextView)findViewById(R.id.tv_showContent)).setText(bundle.getString("info"));

    }

}
