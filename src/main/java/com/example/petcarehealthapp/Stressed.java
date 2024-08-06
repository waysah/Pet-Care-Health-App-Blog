package com.example.petcarehealthapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Stressed extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stressed);

        // Initialize TextViews
        TextView articleTitle = findViewById(R.id.article_title);
        TextView introParagraph = findViewById(R.id.intro_paragraph);
        TextView signsOfStressTitle = findViewById(R.id.signs_of_stress_title);
        TextView signsOfStressContent = findViewById(R.id.signs_of_stress_content);
        TextView causesOfStressTitle = findViewById(R.id.causes_of_stress_title);
        TextView causesOfStressContent = findViewById(R.id.causes_of_stress_content);
        TextView helpingYourPetTitle = findViewById(R.id.helping_your_pet_title);
        TextView helpingYourPetContent = findViewById(R.id.helping_your_pet_content);
        TextView whenToSeeVetTitle = findViewById(R.id.when_to_see_vet_title);
        TextView whenToSeeVetContent = findViewById(R.id.when_to_see_vet_content);

        // Initialize ImageViews
        ImageView stressImage = findViewById(R.id.stress_image);
        ImageView stressImage1 = findViewById(R.id.stress_image1);
        ImageView stressImage2 = findViewById(R.id.stress_image2);
        ImageView stressImage3 = findViewById(R.id.stress_image3);
        ImageView stressImage4 = findViewById(R.id.stress_image4);

        // Set content for TextViews
        articleTitle.setText("Feeling the Strain: How Stress Affects Your Pet");
        introParagraph.setText("Just like us humans, our furry (or feathery, or scaly!) companions can experience stress too. While a little stress here and there is normal, chronic stress can take a toll on their physical and mental well-being. Understanding the signs of stress in your pet and ways to manage it can help them live a happier, healthier life.");
        signsOfStressTitle.setText("Signs of Stress in Pets:");
        signsOfStressContent.setText("Pets can't tell us verbally when they're feeling stressed, so it's important to be observant. Here are some common signs to watch out for:\n\nBehavioral Changes: Increased hiding, pacing, vocalization (whining, barking, meowing), destructive behavior, or changes in litter box or bathroom habits.\n\nPhysical Changes: Excessive shedding, licking, or scratching, changes in appetite (eating more or less), lethargy, or difficulty sleeping.\n\nDigestive Issues: Vomiting, diarrhea, or constipation.\nWeakened Immune System: Pets under stress are more susceptible to illnesses.");
        causesOfStressTitle.setText("Causes of Stress in Pets:");
        causesOfStressContent.setText("Changes in Routine: New pet in the house, moving to a new home, changes in work schedules, or even a new piece of furniture can all be stressors for pets.\n\nSeparation Anxiety: Some pets struggle when left alone for extended periods.\n\nLoud Noises: Thunderstorms, fireworks, or loud traffic can be frightening for pets.\n\nVeterinary Visits: While necessary for their health, vet visits can be stressful for some pets.\n\nLack of Exercise or Mental Stimulation: Boredom can lead to stress-related behaviors.");
        helpingYourPetTitle.setText("Helping Your Pet De-Stress:");
        helpingYourPetContent.setText("There are many things you can do to help your pet manage stress:\n\nProvide a Safe Space: Create a quiet, comfortable area where your pet can retreat and feel secure.\n\nMaintain a Routine: Regular feeding times, walks, and playtime can provide a sense of comfort and predictability.\n\nPositive Reinforcement: Reward calm behavior and use positive training techniques.\n\nDesensitization: Gradually introduce your pet to triggers in a controlled way, pairing them with positive experiences.\n\nExercise and Play: Physical activity helps release endorphins, which have mood-boosting effects. Engage your pet in games and mental stimulation activities.\n\nCalming Aids: Talk to your veterinarian about pheromone diffusers, calming supplements, or anxiety vests that might be helpful.");
        whenToSeeVetTitle.setText("When to See Your Veterinarian:");
        whenToSeeVetContent.setText("If your pet's stress is severe or doesn't improve with home management strategies, consult your veterinarian. They can rule out underlying medical conditions and recommend medication or additional treatment plans.");
    }
}
