package com.mcgearybros.androidtoapplevectorlogo;

import android.app.Activity;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView animatorImageView = (ImageView) findViewById(R.id.head_leaf_animated_vector);
        final AnimatedVectorDrawable headToLeaf = (AnimatedVectorDrawable) getResources().getDrawable(R.drawable.consolidated_animated_vector);
        animatorImageView.setImageDrawable(headToLeaf);
        headToLeaf.start();
        animatorImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                headToLeaf.start();
            }
        });
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
