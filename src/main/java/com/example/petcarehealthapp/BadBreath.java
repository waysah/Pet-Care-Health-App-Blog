package com.example.petcarehealthapp;

import android.os.Bundle;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class BadBreath extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.badbreath);

        // Initialize ImageViews with IDs from XML
        ImageView badBreathImage = findViewById(R.id.Badbreath);
        ImageView badBreathImage1 = findViewById(R.id.Badbreath1);
        ImageView badBreathImage2 = findViewById(R.id.Badbreath2);
        ImageView badBreathImage3 = findViewById(R.id.Badbreath3);
    }
}
