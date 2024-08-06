package com.example.petcarehealthapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.ImageView;

public class DentalCare extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dental_care);

        ImageView dentalToothpasteImage = findViewById(R.id.dental_toothpaste_image);
        dentalToothpasteImage.setImageResource(R.drawable.dental_toothpaste); // Ensure this matches the image name in res/drawable

        ImageView dentalChewsImage = findViewById(R.id.dental_chews_image);
        dentalChewsImage.setImageResource(R.drawable.dental_chews); // Ensure this matches the image name in res/drawable

        ImageView dentalWipesImage = findViewById(R.id.dental_wipes_image);
        dentalWipesImage.setImageResource(R.drawable.dental_wipes); // Ensure this matches the image name in res/drawable

        ImageView dentalFoodImage = findViewById(R.id.dental_food_image);
        dentalFoodImage.setImageResource(R.drawable.dental_food); // Ensure this matches the image name in res/drawable
    }
}
