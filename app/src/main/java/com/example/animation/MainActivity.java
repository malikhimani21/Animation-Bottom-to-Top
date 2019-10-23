package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements Animation.AnimationListener {

    ImageView imageView;
    Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // full screen activity
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.imageViewAnimation);
        animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.animation_top_to_bottom);
        imageView.startAnimation(animation);

        animation.setAnimationListener(this);

    }


    @Override

    public void onAnimationStart(Animation animation) {
        Toast.makeText(getApplicationContext(), "Animation Start", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onAnimationEnd(Animation animation) {
        Toast.makeText(getApplicationContext(), "Animation Finished", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}
