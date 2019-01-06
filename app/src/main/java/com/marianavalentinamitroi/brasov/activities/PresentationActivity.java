package com.marianavalentinamitroi.brasov.activities;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.marianavalentinamitroi.brasov.R;
import com.marianavalentinamitroi.brasov.utils.PreferenceUtils;

public class PresentationActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private ActionBarDrawerToggle actionBarDrawerToggle;
    private DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_presentation);

        View header = ((NavigationView) findViewById(R.id.navigation_view)).getHeaderView(0);

        Intent intent = getIntent();
        if (intent.hasExtra("EMAIL")) {
            String nameFromIntent = getIntent().getStringExtra("EMAIL");
            ((TextView) header.findViewById(R.id.username_email)).setText(nameFromIntent);
        } else {
            String email = PreferenceUtils.getEmail(this);
            ((TextView) header.findViewById(R.id.username_email)).setText(email);

        }

        Toolbar toolbar = findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        drawer = findViewById(R.id.drawer_layout);

        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawer, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);

        drawer.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        @SuppressLint("CutPasteId") NavigationView navigationView = findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
        // TODO cand apas back inchide drawer-ul, dar daca nu e drawer ul deschis ma duce inapoi la login page -- NU VREAU SA MA DUCA LA LOGIN PAGE
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        /** Inflate the menu; this adds items to the action bar if it is present.*/
        getMenuInflater().inflate(R.menu.drawer_menu, menu);
        /** because I returned false the three dots from the right side of the toolbar will not be displayed */
        return false;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (actionBarDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    //@SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.restaurants:
                // Create a new intent to open the {@link RestaurantActivity}
                Intent restaurantsIntent = new Intent(this, RestaurantActivity.class);

                // Start the new activity
                startActivity(restaurantsIntent);
                return  true;
            case R.id.trips:
                // Create a new intent to open the {@link TripsActivity}
                Intent tripsIntent = new Intent(this, TripsActivity.class);

                // Start the new activity
                startActivity(tripsIntent);
                return  true;
            case R.id.log_out:
                PreferenceUtils.savePassword(null, this);
                PreferenceUtils.saveEmail(null, this);
                Intent intent = new Intent(this, LoginActivity.class);
                startActivity(intent);
                finish();
                return true;
        }

        return false;
    }
}
