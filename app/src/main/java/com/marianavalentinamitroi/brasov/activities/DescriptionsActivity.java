package com.marianavalentinamitroi.brasov.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.widget.TextView;

import com.marianavalentinamitroi.brasov.R;

public class DescriptionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        /*
          set the new dimensions for our pop-up
         */
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;
        /*
          height and width to be 60% and 80% of the screen, that's why we multily by .6 and .8
         */
        getWindow().setLayout((int) (width * .9), (int) (height * .8));

        Bundle bundle = getIntent().getExtras();
        String title = bundle.getString("title");
        String description = bundle.getString("description");

        TextView text = findViewById(R.id.description);
        setTitle(title);
        text.setText(description);

    }
}