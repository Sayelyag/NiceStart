package com.example.nicestart;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;

public class Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.principal);
        openApp();
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }


        ImageView logo = findViewById(R.id.logosplash);
        Animation blink = AnimationUtils.loadAnimation(this, R.anim.blink);
        logo.startAnimation(blink);

        ImageView mSea = findViewById(R.id.backView);

        Glide.with(this)
                .load(R.drawable.merry)
                .transition(DrawableTransitionOptions.withCrossFade(100))
                .centerCrop()
                //.diskCacheStrategy(DiskCacheStrategy.ALL)
                //.placeholder(new ColorDrawable(this.getResources().getColor(R.color.gradient)))
                //.circleCrop()
                .into(mSea);

    }
    private void openApp() {

        Handler handler = new Handler();
        handler.postDelayed(new Runnable()
        {
            @Override
            public void run() {
                Intent intent = new Intent(Principal.this, Login.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
            }
        }, 5000);

    }
}
