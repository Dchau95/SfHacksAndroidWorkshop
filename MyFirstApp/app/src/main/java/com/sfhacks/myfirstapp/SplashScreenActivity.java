package com.sfhacks.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Animation rotation = AnimationUtils.loadAnimation(this, R.anim.rotate);
        ImageView pikachuImage = (ImageView) findViewById(R.id.pikachu);
        pikachuImage.setAnimation(rotation);
        pikachuImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SplashScreenActivity.this, "I clicked Pikachu", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(SplashScreenActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
