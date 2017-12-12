package com.example.anaadelrosario.texttospeech;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new DotProgressBarBuilder(this)
                .setDotAmount(5)
                .setStartColor(Color.BLACK)
                .setAnimationDirection(DotProgressBar.LEFT_DIRECTION)
                .build();


    }
}
