package com.rejowan.cutevisaulizerlib;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.rejowan.cutevisualizer.CuteVisualizer;


public class Home extends AppCompatActivity {

    CuteVisualizer cuteVisualizer, cuteVisualizer2, cuteVisualizer3, cuteVisualizer4;
    TextView playButton;
    boolean isPlaying = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        cuteVisualizer = findViewById(R.id.equalizerView);
        cuteVisualizer2 = findViewById(R.id.equalizerView2);
        cuteVisualizer3 = findViewById(R.id.equalizerView3);
        cuteVisualizer4 = findViewById(R.id.equalizerView4);

        playButton = findViewById(R.id.playButton);

        cuteVisualizer.stopBars();
        cuteVisualizer2.stopBars();
        cuteVisualizer3.stopBars();
        cuteVisualizer4.stopBars();

        playButton.setOnClickListener(v -> {
            if (isPlaying) {
                isPlaying = false;
                playButton.setText("Play");
                cuteVisualizer.stopBars();
                cuteVisualizer2.stopBars();
                cuteVisualizer3.stopBars();
                cuteVisualizer4.stopBars();
            } else {
                isPlaying = true;
                playButton.setText("Pause");
                cuteVisualizer.animateBars();
                cuteVisualizer2.animateBars();
                cuteVisualizer3.animateBars();
                cuteVisualizer4.animateBars();
            }

        });

    }
}