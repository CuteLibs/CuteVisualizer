package com.rejowan.cutevisualizer;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;


public class EqualizerView extends LinearLayout {

    View musicBar1;
    View musicBar2;
    View musicBar3;
    View musicBar4;
    View musicBar5;
    View musicBar6;
    View musicBar7;
    View musicBar8;
    View musicBar9;
    View musicBar10;
    View musicBar11;


    AnimatorSet playingSet;
    AnimatorSet stopSet;
    Boolean animating = false;

    int foregroundColor;
    int duration;


    public EqualizerView(Context context) {
        super(context);
        initViews();
    }

    public EqualizerView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setAttrs(context, attrs);
        initViews();
    }

    public EqualizerView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        setAttrs(context, attrs);
        initViews();
    }

    private void setAttrs(Context context, AttributeSet attrs) {
        TypedArray a = context.getTheme().obtainStyledAttributes(
                attrs,
                R.styleable.EqualizerView,
                0, 0);

        try {
            foregroundColor = a.getInt(R.styleable.EqualizerView_foregroundColor, Color.WHITE);
            duration = a.getInt(R.styleable.EqualizerView_animDuration, 3000);

        } finally {
            a.recycle();
        }
    }

    private void initViews() {
        LayoutInflater.from(getContext()).inflate(R.layout.equalizer_view, this, true);
        musicBar1 = findViewById(R.id.music_bar1);
        musicBar2 = findViewById(R.id.music_bar2);
        musicBar3 = findViewById(R.id.music_bar3);
        musicBar4 = findViewById(R.id.music_bar4);
        musicBar5 = findViewById(R.id.music_bar5);
        musicBar6 = findViewById(R.id.music_bar6);
        musicBar7 = findViewById(R.id.music_bar7);
        musicBar8 = findViewById(R.id.music_bar8);
        musicBar9 = findViewById(R.id.music_bar9);
        musicBar10 = findViewById(R.id.music_bar10);
        musicBar11 = findViewById(R.id.music_bar11);

        musicBar1.setBackgroundColor(foregroundColor);
        musicBar2.setBackgroundColor(foregroundColor);
        musicBar3.setBackgroundColor(foregroundColor);
        musicBar4.setBackgroundColor(foregroundColor);
        musicBar5.setBackgroundColor(foregroundColor);
        musicBar6.setBackgroundColor(foregroundColor);
        musicBar7.setBackgroundColor(foregroundColor);
        musicBar8.setBackgroundColor(foregroundColor);
        musicBar9.setBackgroundColor(foregroundColor);
        musicBar10.setBackgroundColor(foregroundColor);
        musicBar11.setBackgroundColor(foregroundColor);

        setPivots();
    }


    private void setPivots() {
        musicBar1.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                if (musicBar1.getHeight() > 0) {
                    musicBar1.setPivotY(musicBar1.getHeight());
                    musicBar1.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }

            }
        });
        musicBar2.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                if (musicBar2.getHeight() > 0) {
                    musicBar2.setPivotY(musicBar2.getHeight());
                    musicBar2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }

            }
        });
        musicBar3.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                if (musicBar3.getHeight() > 0) {
                    musicBar3.setPivotY(musicBar3.getHeight());
                    musicBar3.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }

            }
        });

        musicBar4.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                if (musicBar4.getHeight() > 0) {
                    musicBar4.setPivotY(musicBar4.getHeight());
                    musicBar4.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }

            }
        });

        musicBar5.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                if (musicBar5.getHeight() > 0) {
                    musicBar5.setPivotY(musicBar5.getHeight());
                    musicBar5.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }

            }
        });
        musicBar6.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                if (musicBar6.getHeight() > 0) {
                    musicBar6.setPivotY(musicBar6.getHeight());
                    musicBar6.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }

            }
        });

        musicBar7.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                if (musicBar7.getHeight() > 0) {
                    musicBar7.setPivotY(musicBar7.getHeight());
                    musicBar7.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }

            }
        });

        musicBar8.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                if (musicBar8.getHeight() > 0) {
                    musicBar8.setPivotY(musicBar8.getHeight());
                    musicBar8.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }

            }
        });

        musicBar9.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                if (musicBar9.getHeight() > 0) {
                    musicBar9.setPivotY(musicBar9.getHeight());
                    musicBar9.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }

            }
        });

        musicBar10.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                if (musicBar10.getHeight() > 0) {
                    musicBar10.setPivotY(musicBar10.getHeight());
                    musicBar10.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }

            }
        });

        musicBar11.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                if (musicBar11.getHeight() > 0) {
                    musicBar11.setPivotY(musicBar11.getHeight());
                    musicBar11.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }

            }
        });

    }

    public void animateBars() {
        animating = true;
        if (playingSet == null) {
            ObjectAnimator scaleYbar1 = ObjectAnimator.ofFloat(musicBar1, "scaleY", 0.2f, 0.8f, 0.1f, 0.1f, 0.3f, 0.1f, 0.2f, 0.8f, 0.7f, 0.2f, 0.4f, 0.9f, 0.7f, 0.6f, 0.1f, 0.3f, 0.1f, 0.4f, 0.1f, 0.8f, 0.7f, 0.9f, 0.5f, 0.6f, 0.3f, 0.1f);
            scaleYbar1.setRepeatCount(ValueAnimator.INFINITE);
            ObjectAnimator scaleYbar2 = ObjectAnimator.ofFloat(musicBar2, "scaleY", 0.2f, 0.5f, 1.0f, 0.5f, 0.3f, 0.1f, 0.2f, 0.3f, 0.5f, 0.1f, 0.6f, 0.5f, 0.3f, 0.7f, 0.8f, 0.9f, 0.3f, 0.1f, 0.5f, 0.3f, 0.6f, 1.0f, 0.6f, 0.7f, 0.4f, 0.1f);
            scaleYbar2.setRepeatCount(ValueAnimator.INFINITE);
            ObjectAnimator scaleYbar3 = ObjectAnimator.ofFloat(musicBar3, "scaleY", 0.6f, 0.5f, 1.0f, 0.6f, 0.5f, 1.0f, 0.6f, 0.5f, 1.0f, 0.5f, 0.6f, 0.7f, 0.2f, 0.3f, 0.1f, 0.5f, 0.4f, 0.6f, 0.7f, 0.1f, 0.4f, 0.3f, 0.1f, 0.4f, 0.3f, 0.7f);
            scaleYbar3.setRepeatCount(ValueAnimator.INFINITE);
            ObjectAnimator scaleYbar4 = ObjectAnimator.ofFloat(musicBar4, "scaleY", 0.2f, 0.8f, 0.1f, 0.1f, 0.3f, 0.1f, 0.2f, 0.8f, 0.7f, 0.2f, 0.4f, 0.9f, 0.7f, 0.6f, 0.1f, 0.3f, 0.1f, 0.4f, 0.1f, 0.8f, 0.7f, 0.9f, 0.5f, 0.6f, 0.3f, 0.1f);
            scaleYbar4.setRepeatCount(ValueAnimator.INFINITE);
            ObjectAnimator scaleYbar5 = ObjectAnimator.ofFloat(musicBar5, "scaleY", 0.2f, 0.5f, 1.0f, 0.5f, 0.3f, 0.1f, 0.2f, 0.3f, 0.5f, 0.1f, 0.6f, 0.5f, 0.3f, 0.7f, 0.8f, 0.9f, 0.3f, 0.1f, 0.5f, 0.3f, 0.6f, 1.0f, 0.6f, 0.7f, 0.4f, 0.1f);
            scaleYbar5.setRepeatCount(ValueAnimator.INFINITE);
            ObjectAnimator scaleYbar6 = ObjectAnimator.ofFloat(musicBar6, "scaleY", 0.6f, 0.5f, 1.0f, 0.6f, 0.5f, 1.0f, 0.6f, 0.5f, 1.0f, 0.5f, 0.6f, 0.7f, 0.2f, 0.3f, 0.1f, 0.5f, 0.4f, 0.6f, 0.7f, 0.1f, 0.4f, 0.3f, 0.1f, 0.4f, 0.3f, 0.7f);
            scaleYbar6.setRepeatCount(ValueAnimator.INFINITE);
            ObjectAnimator scaleYbar7 = ObjectAnimator.ofFloat(musicBar7, "scaleY", 0.2f, 0.8f, 0.1f, 0.1f, 0.3f, 0.1f, 0.2f, 0.8f, 0.7f, 0.2f, 0.4f, 0.9f, 0.7f, 0.6f, 0.1f, 0.3f, 0.1f, 0.4f, 0.1f, 0.8f, 0.7f, 0.9f, 0.5f, 0.6f, 0.3f, 0.1f);
            scaleYbar7.setRepeatCount(ValueAnimator.INFINITE);
            ObjectAnimator scaleYbar8 = ObjectAnimator.ofFloat(musicBar8, "scaleY", 0.2f, 0.5f, 1.0f, 0.5f, 0.3f, 0.1f, 0.2f, 0.3f, 0.5f, 0.1f, 0.6f, 0.5f, 0.3f, 0.7f, 0.8f, 0.9f, 0.3f, 0.1f, 0.5f, 0.3f, 0.6f, 1.0f, 0.6f, 0.7f, 0.4f, 0.1f);
            scaleYbar8.setRepeatCount(ValueAnimator.INFINITE);
            ObjectAnimator scaleYbar9 = ObjectAnimator.ofFloat(musicBar9, "scaleY", 0.6f, 0.5f, 1.0f, 0.6f, 0.5f, 1.0f, 0.6f, 0.5f, 1.0f, 0.5f, 0.6f, 0.7f, 0.2f, 0.3f, 0.1f, 0.5f, 0.4f, 0.6f, 0.7f, 0.1f, 0.4f, 0.3f, 0.1f, 0.4f, 0.3f, 0.7f);
            scaleYbar9.setRepeatCount(ValueAnimator.INFINITE);
            ObjectAnimator scaleYbar10 = ObjectAnimator.ofFloat(musicBar10, "scaleY", 0.2f, 0.8f, 0.1f, 0.1f, 0.3f, 0.1f, 0.2f, 0.8f, 0.7f, 0.2f, 0.4f, 0.9f, 0.7f, 0.6f, 0.1f, 0.3f, 0.1f, 0.4f, 0.1f, 0.8f, 0.7f, 0.9f, 0.5f, 0.6f, 0.3f, 0.1f);
            scaleYbar10.setRepeatCount(ValueAnimator.INFINITE);
            ObjectAnimator scaleYbar11 = ObjectAnimator.ofFloat(musicBar11, "scaleY", 0.2f, 0.5f, 1.0f, 0.5f, 0.3f, 0.1f, 0.2f, 0.3f, 0.5f, 0.1f, 0.6f, 0.5f, 0.3f, 0.7f, 0.8f, 0.9f, 0.3f, 0.1f, 0.5f, 0.3f, 0.6f, 1.0f, 0.6f, 0.7f, 0.4f, 0.1f);
            scaleYbar11.setRepeatCount(ValueAnimator.INFINITE);


            playingSet = new AnimatorSet();
            playingSet.playTogether(scaleYbar2, scaleYbar3, scaleYbar1, scaleYbar5, scaleYbar6, scaleYbar4, scaleYbar9, scaleYbar11, scaleYbar10, scaleYbar8, scaleYbar7);
            playingSet.setDuration(duration);
            playingSet.setInterpolator(new LinearInterpolator());
            playingSet.start();

        } else {
            if (playingSet.isPaused()) {
                playingSet.resume();
            }
        }

    }

    public void stopBars() {
        animating = false;
        if (playingSet != null && playingSet.isRunning() && playingSet.isStarted()) {
            playingSet.pause();
        }

        if (stopSet == null) {
            // Animate stopping bars
            ObjectAnimator scaleY1 = ObjectAnimator.ofFloat(musicBar1, "scaleY", 0.1f);
            ObjectAnimator scaleY2 = ObjectAnimator.ofFloat(musicBar2, "scaleY", 0.1f);
            ObjectAnimator scaleY3 = ObjectAnimator.ofFloat(musicBar3, "scaleY", 0.1f);
            ObjectAnimator scaleY4 = ObjectAnimator.ofFloat(musicBar4, "scaleY", 0.1f);
            ObjectAnimator scaleY5 = ObjectAnimator.ofFloat(musicBar5, "scaleY", 0.1f);
            ObjectAnimator scaleY6 = ObjectAnimator.ofFloat(musicBar6, "scaleY", 0.1f);
            ObjectAnimator scaleY7 = ObjectAnimator.ofFloat(musicBar7, "scaleY", 0.1f);
            ObjectAnimator scaleY8 = ObjectAnimator.ofFloat(musicBar8, "scaleY", 0.1f);
            ObjectAnimator scaleY9 = ObjectAnimator.ofFloat(musicBar9, "scaleY", 0.1f);
            ObjectAnimator scaleY10 = ObjectAnimator.ofFloat(musicBar10, "scaleY", 0.1f);
            ObjectAnimator scaleY11 = ObjectAnimator.ofFloat(musicBar11, "scaleY", 0.1f);


            stopSet = new AnimatorSet();
            stopSet.playTogether(scaleY2, scaleY3, scaleY1, scaleY5, scaleY6, scaleY4, scaleY9, scaleY11, scaleY10, scaleY8, scaleY7);
            stopSet.setDuration(200);
            stopSet.start();
        } else if (!stopSet.isStarted()) {
            stopSet.start();
        }
    }

    public Boolean isAnimating() {
        return animating;
    }


}