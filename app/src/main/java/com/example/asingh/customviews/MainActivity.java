package com.example.asingh.customviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MyTextView yellowView = (MyTextView) findViewById(R.id.viewYellow);
        yellowView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                yellowView.incrementAndUpdate();
            }
        });

        final MyTextView greenView = (MyTextView) findViewById(R.id.viewGreen);
        greenView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                greenView.incrementAndUpdate();
            }
        });

        final MyTextView redView = (MyTextView) findViewById(R.id.viewRed);
        redView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                redView.incrementAndUpdate();
            }
        });

        final MyTextView blueView = (MyTextView) findViewById(R.id.viewBlue);
        blueView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blueView.incrementAndUpdate();
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
