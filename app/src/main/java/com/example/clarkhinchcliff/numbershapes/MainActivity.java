package com.example.clarkhinchcliff.numbershapes;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade(View view) {

        ImageView morty = (ImageView) findViewById(R.id.morty);
        ImageView rick = (ImageView) findViewById(R.id.rick);


        morty.animate().alpha(0f).setDuration(500);
        rick.animate().alpha(1f).setDuration(500);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
