package com.example.petcarehealthapp;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class AboutUs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_us);

        // Initialize TextViews
        TextView aboutUsText = findViewById(R.id.about_us);
        TextView introParagraph = findViewById(R.id.intro_paragraph);
        TextView expertSolutionsSectionTitle = findViewById(R.id.expert_solutions_section_title);
        TextView expertSolutionsSectionContent = findViewById(R.id.expert_solutions_section_content);
        TextView chatbotSectionTitle = findViewById(R.id.chatbot_section_title);
        TextView chatbotSectionContent = findViewById(R.id.chatbot_section_content);
        TextView explorePageSectionTitle = findViewById(R.id.explore_page_section_title);
        TextView explorePageSectionContent = findViewById(R.id.explore_page_section_content);
        TextView remindersSectionTitle = findViewById(R.id.reminders_section_title);
        TextView remindersSectionContent = findViewById(R.id.reminders_section_content);
        TextView contactUsSection = findViewById(R.id.contact_us_section);

        // Initialize ImageViews
        ImageView chatbotImage = findViewById(R.id.chatbot_image);
        ImageView explorePageImage = findViewById(R.id.explore_page_image);
        ImageView chatBot = findViewById(R.id.chatBot);
        ImageView blogs = findViewById(R.id.blogs);
        ImageView remindersImage = findViewById(R.id.reminders_image);
        ImageView contactUsImage = findViewById(R.id.contact_us_image);

        // Set content for TextViews
        aboutUsText.setText("About PetCare Health App: Your One-Stop App for Happy and Healthy Pets");
        introParagraph.setText("At PetCare Health App, we understand the deep bond between you and your furry (or feathery, or scaly!) friend. They bring so much joy into our lives, and we want to make sure they live long, healthy, and happy lives too. That's why we created this innovative app, designed to empower pet owners like you to take control of your pet's health and well-being.");
        expertSolutionsSectionTitle.setText("Expert Solutions When You Need Them:");
        expertSolutionsSectionContent.setText("For in-depth assistance with your pet's health, you can access our expert AI chatbot service by making a secure payment via M-Pesa. This service provides personalized advice and detailed information, ensuring you get the support you need, when you need it.");
        chatbotSectionTitle.setText("AI-powered Chatbot for Convenient Pet Care Advice:");
        chatbotSectionContent.setText("Sometimes, a quick question about your pet's behavior or a minor concern can arise. Our friendly AI chatbot is available 24/7 to answer your questions and offer solutions. Simply describe your pet's issue, and the chatbot will provide helpful information and recommendations.");
        explorePageSectionTitle.setText("Explore Page for Pet Health Knowledge:");
        explorePageSectionContent.setText("Never stop learning! Our Explore page is a treasure trove of valuable information on various pet health topics, breed-specific care guides, training tips, and even fun activities to keep your furry friend engaged. Stay updated on the latest advancements in pet care and ensure you're providing the best possible life for your pet.");
        remindersSectionTitle.setText("Stay on Top of Pet Care with Reminders:");
        remindersSectionContent.setText("Life gets busy, but your pet's health shouldn't suffer. With our user-friendly reminder system, you can set alerts for vet appointments, medication schedules, deworming, nail trimming, and anything else you need to keep track of. No more missed appointments or forgotten essentials!");
        contactUsSection.setText("0740629899   0759403255   0725216754");
    }
}
