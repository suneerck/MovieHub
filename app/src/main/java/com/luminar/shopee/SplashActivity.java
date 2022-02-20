package com.luminar.shopee;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

/**
 *
 * Created by Suneer CK
 * On February 15 2022
 *
 * http://snrck.in/
 *
 */

@SuppressLint("CustomSplashScreen")
public class SplashActivity extends AppCompatActivity {

    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        init();

        Glide.with(this)
                .asGif()
                .load("https://gifimage.net/wp-content/uploads/2018/06/video-camera-gif-10.gif")
                .into(iv);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
                finish();
            }
        },4000);

    }


    private void init(){
        iv = findViewById(R.id.iv);
    }
}