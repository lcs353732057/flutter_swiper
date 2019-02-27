package com.example.lcs.flutterapp;

import android.app.Activity;
import android.os.Bundle;
import com.example.lcs.flutterapp.R;

public class SplashActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        TextView tv=new TextView(this);
//        tv.setText("启动页。。。。");
        setContentView(R.layout.splash_activity);
    }
}
