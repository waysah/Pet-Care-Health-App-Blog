package com.example.petcarehealthapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.SearchView;
import androidx.appcompat.app.AppCompatActivity;

public class Blog extends AppCompatActivity {

    public SearchView searchView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.blog);

        searchView = findViewById(R.id.searchView);


        searchView.setQueryHint("Search Blogs on Google..."); // Setting the hinted text for the search bar

        // Setting up the SearchView listener for Google search
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                performGoogleSearch(query);
                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                // Handle query text change if needed
                return false;
            }
        });

        // Setup click listeners for each section
        findViewById(R.id.ticks_section).setOnClickListener(this::onTicksSectionClick);
        findViewById(R.id.my_pets_section).setOnClickListener(this::onMyPetsSectionClick);
        findViewById(R.id.dog_breath_section).setOnClickListener(this::onDogBreathSectionClick);
        findViewById(R.id.cough_section).setOnClickListener(this::onCoughSectionClick);
        findViewById(R.id.stressed_section).setOnClickListener(this::onStressedSectionClick);
        findViewById(R.id.dental_care).setOnClickListener(this::onDentalCareSectionClick);
    }

    private void performGoogleSearch(String query) {
        Uri uri = Uri.parse("https://www.google.com/search?q=" + Uri.encode(query));
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void onMyPetsSectionClick(View view) {
        Intent intent = new Intent(this, AboutUs.class);
        startActivity(intent);
    }

    public void onTicksSectionClick(View view) {
        Intent intent = new Intent(this, TicksRemoval.class);
        startActivity(intent);
    }

    public void onDogBreathSectionClick(View view) {
        Intent intent = new Intent(this, BadBreath.class);
        startActivity(intent);
    }

    public void onCoughSectionClick(View view) {
        Intent intent = new Intent(this, Cough.class);
        startActivity(intent);
    }

    public void onStressedSectionClick(View view) {
        Intent intent = new Intent(this, Stressed.class);
        startActivity(intent);
    }

    public void onDentalCareSectionClick(View view) {
        Intent intent = new Intent(this, DentalCare.class);
        startActivity(intent);
    }
}
