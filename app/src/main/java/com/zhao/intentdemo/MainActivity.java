package com.zhao.intentdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText et_input;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //init
        et_input = (EditText) findViewById(R.id.et_input);
        findViewById(R.id.bt_display_one).setOnClickListener(this);
        findViewById(R.id.bt_display_two).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case   R.id.bt_display_one:
                transfer_one();
                break;
            case    R.id.bt_display_two:
                transfer_two();
                break;
        }
    }
    //显示intent
    private void transfer_one(){
        Intent intent = new Intent(MainActivity.this,OtherActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("info",getString());
        intent.putExtras(bundle);
        startActivity(intent);
    }

    //隐式数据传输
    private void transfer_two() {
        Intent intent = new Intent(MainActivity.this,OtherActivity.class);
        intent.setAction("com.zhao.START_OTHER_ACTIVITY");
        intent.addCategory("com.zhao.MY_CATEGORY");
        Bundle bundle = new Bundle();
        bundle.putString("info",getString());
        intent.putExtras(bundle);
        startActivity(intent);
    }

    //返回输入框内的字符串
    private String getString(){
        return et_input.getText().toString();
    }
}
