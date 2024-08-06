package com.example.petcarehealthapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class Welcome extends AppCompatActivity {
    public TextView petCare;
    public ImageView imageView;

    @SuppressLint("MissingInflatedId")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);

        int delayMillis = 5000;

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                startActivity(new Intent(Welcome.this, Blog.class));

                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

                finish();
            }
        }, delayMillis);

        petCare = findViewById(R.id.petCare);
        imageView = findViewById(R.id.imageView);

    }
}
