package com.example.gobook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class splashScreen extends AppCompatActivity {
    private final String TAG = splashScreen.this.getClass().getSimpleName();
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        initView();
        initListeners();
        doSplashLoading();
        //check if content or not
        //check certain time
    }
    private void initView() {
        imageView = findViewById(R.id.logo_img);
        //load img from
        Glide.with(splashScreen.this).load(R.drawable.ic_logo).into(imageView);
    }

    private void initListeners() {

    }
    private void doSplashLoading() {
        //this handler
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                openMainActivity();
            }
        },1000);

//        //or do this
//        new Handler(.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        }))
//    }
}
    private void openMainActivity() {
        Log.e(TAG,"called After");


        Intent intent = new Intent(splashScreen.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}