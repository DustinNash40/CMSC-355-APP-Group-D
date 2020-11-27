package com.example.cmsc355app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class help extends AppCompatActivity {
    private Button findGym;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        ConstraintLayout constraintLayout = findViewById(R.id.layout);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(3900);
        animationDrawable.setExitFadeDuration(3900);
        animationDrawable.start();

        findGym = findViewById(R.id.findGym);

        findGym.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveToGymFinder();
            }
        });

    }

    private void moveToGymFinder(){
        Intent intentfg = new Intent(help.this, gymFinder.class);
        startActivity(intentfg);
    }
}