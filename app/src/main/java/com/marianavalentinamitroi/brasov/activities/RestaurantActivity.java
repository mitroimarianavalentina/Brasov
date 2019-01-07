package com.marianavalentinamitroi.brasov.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.marianavalentinamitroi.brasov.R;
import com.marianavalentinamitroi.brasov.adapter.RestaurantAdapter;
import com.marianavalentinamitroi.brasov.model.Restaurant;

import java.util.ArrayList;

public class RestaurantActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        /** create a new ArrayList<Restaurant> and populate it */
        ArrayList<Restaurant> restaurants = new ArrayList<>();

        /** add restaurants to the list */
        restaurants.add(new Restaurant("Dei Frati", R.drawable.dei_frati,
                getString(R.string.geo_dei_frati),"0040766584689", "description"));

        restaurants.add(new Restaurant("Tratorian", R.drawable.trattorian,
                getString(R.string.geo_tratorian),"0040766584511", "description"));

        restaurants.add(new Restaurant("La Ceaun", R.drawable.la_ceaun,
                getString(R.string.geo_la_ceaun),"0040766584689", "description"));

        restaurants.add(new Restaurant("Tratoria Pocol", R.drawable.pocol,
                getString(R.string.geo_tratoria_pocol),"0040766584689", "description"));

        restaurants.add(new Restaurant("Sergiana", R.drawable.sergiana,
                getString(R.string.geo_sergiana),"0040766584689", "description"));

        restaurants.add(new Restaurant("Athanasios", R.drawable.athanasios,
                getString(R.string.geo_athanasios),"+040766584689", "description"));

        restaurants.add(new Restaurant("Belvedere", R.drawable.belvedere,
                getString(R.string.geo_belvedere),"+040766584689", "description"));

        restaurants.add(new Restaurant("Gott", R.drawable.gott,
                getString(R.string.geo_gott),"+040766584689", "description"));

        restaurants.add(new Restaurant("Hopaa", R.drawable.hopaa,
                getString(R.string.geo_hopaa),"+040766584689", "description"));

        restaurants.add(new Restaurant("Mamaboa", R.drawable.mamboa,
                getString(R.string.geo_mamboa),"+040766584689", "description"));

        restaurants.add(new Restaurant("Sub Tampa", R.drawable.sub_tampa,
                getString(R.string.geo_sub_tampa),"+040766584689", "description"));


        RestaurantAdapter restaurantAdapter =  new RestaurantAdapter(this, restaurants);
        ListView listView =  findViewById(R.id.listView);
        listView.setAdapter(restaurantAdapter);
    }
}