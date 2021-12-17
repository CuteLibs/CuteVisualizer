package com.rejowan.cutevisaulizerlib;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.rejowan.cutevisualizer.CuteVisualizer;


public class Home extends AppCompatActivity {

    CuteVisualizer cuteVisualizer;
    TextView playButton;
    boolean isPlaying = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        cuteVisualizer = findViewById(R.id.equalizerView);
        playButton = findViewById(R.id.playButton);

        cuteVisualizer.stopBars();

        playButton.setOnClickListener(v -> {
            if (isPlaying) {
                isPlaying = false;
                playButton.setText("Play");
                cuteVisualizer.stopBars();

            } else {
                isPlaying = true;
                playButton.setText("Pause");
                cuteVisualizer.animateBars();
            }

        });

    }
}