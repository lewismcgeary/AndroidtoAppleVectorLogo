package com.mcgearybros.androidtoapplevectorlogo;

import android.app.Activity;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity {

    AnimatedVectorDrawable mightyMorphinAnimatedVectorDrawable;
    AnimatedVectorDrawable mightyMorphinAnimatedVectorDrawableReversed;
    ImageView animatorImageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        animatorImageView = (ImageView) findViewById(R.id.path_morph_animated_vector);
        mightyMorphinAnimatedVectorDrawable = (AnimatedVectorDrawable) getDrawable(R.drawable.consolidated_animated_vector);
        mightyMorphinAnimatedVectorDrawableReversed = (AnimatedVectorDrawable) getDrawable(R.drawable.consolidated_animated_vector_reverse);
        animatorImageView.setImageDrawable(getDrawable(R.drawable.android_logo_vector_morphable));

        final ImageView toAppleButton = (ImageView) findViewById(R.id.to_apple_button);
        final ImageView toAndroidButton = (ImageView) findViewById(R.id.to_android_button);
        toAndroidButton.setEnabled(false);
        toAppleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toAndroidButton.setEnabled(true);
                toAppleButton.setEnabled(false);
                animateToApple();
            }
        });
        toAndroidButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toAppleButton.setEnabled(true);
                toAndroidButton.setEnabled(false);
                animateToAndroid();
            }
        });
    }

    public void animateToApple(){
        mightyMorphinAnimatedVectorDrawable.stop();
        animatorImageView.setImageDrawable(mightyMorphinAnimatedVectorDrawable);
        mightyMorphinAnimatedVectorDrawable.start();
    }

    public void animateToAndroid(){
        mightyMorphinAnimatedVectorDrawableReversed.stop();
        animatorImageView.setImageDrawable(mightyMorphinAnimatedVectorDrawableReversed);
        mightyMorphinAnimatedVectorDrawableReversed.start();
    }

}
