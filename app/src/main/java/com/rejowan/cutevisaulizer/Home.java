package com.rejowan.cutevisaulizer;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.rejowan.cutevisualizer.EqualizerView;

public class Home extends AppCompatActivity {

    EqualizerView equalizerView;
    TextView playButton;
    boolean isPlaying = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        equalizerView = findViewById(R.id.equalizerView);
        playButton = findViewById(R.id.playButton);

        equalizerView.stopBars();

        playButton.setOnClickListener(v -> {
            if (isPlaying) {
                isPlaying = false;
                playButton.setText("Play");
                equalizerView.stopBars();

            } else {
                isPlaying = true;
                playButton.setText("Pause");
                equalizerView.animateBars();
            }

        });

    }
}