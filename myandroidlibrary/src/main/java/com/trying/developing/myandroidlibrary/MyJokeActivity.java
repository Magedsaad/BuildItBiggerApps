package com.trying.developing.myandroidlibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class MyJokeActivity extends AppCompatActivity {

    String jokes;
    public static String joke = "joke";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_joke);
        Intent intentFromButtonClick = getIntent();
        if (intentFromButtonClick.hasExtra(joke)) {
            jokes = intentFromButtonClick.getStringExtra(joke);
        }
        TextView jokeTextView = (TextView)findViewById(R.id.jokeId);
        jokeTextView.setText(jokes);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
