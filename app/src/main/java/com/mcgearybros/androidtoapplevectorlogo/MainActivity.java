package com.mcgearybros.androidtoapplevectorlogo;

import android.app.Activity;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
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
        animatorImageView.setImageDrawable(mightyMorphinAnimatedVectorDrawable);
        final Button toAppleButton = (Button) findViewById(R.id.to_apple_button);
        final Button toAndroidButton = (Button) findViewById(R.id.to_android_button);
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
        mightyMorphinAnimatedVectorDrawable= (AnimatedVectorDrawable) getDrawable(R.drawable.consolidated_animated_vector);
        animatorImageView.setImageDrawable(mightyMorphinAnimatedVectorDrawable);
        mightyMorphinAnimatedVectorDrawable.start();
    }

    public void animateToAndroid(){
        mightyMorphinAnimatedVectorDrawableReversed= (AnimatedVectorDrawable) getDrawable(R.drawable.consolidated_animated_vector_reverse);
        animatorImageView.setImageDrawable(mightyMorphinAnimatedVectorDrawableReversed);
        mightyMorphinAnimatedVectorDrawableReversed.start();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
