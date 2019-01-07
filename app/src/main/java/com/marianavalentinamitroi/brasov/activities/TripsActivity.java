package com.marianavalentinamitroi.brasov.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.marianavalentinamitroi.brasov.R;
import com.marianavalentinamitroi.brasov.adapter.PlacesAndTripsAdapter;
import com.marianavalentinamitroi.brasov.model.PlacesAndTrips;

import java.util.ArrayList;

public class TripsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        /** create a new ArrayList<PlacesAndTrips> and populate it */
        ArrayList<PlacesAndTrips> trips = new ArrayList<>();

        /** add trips to the list */
        trips.add(new PlacesAndTrips("Aventura Parc", R.drawable.aventura_parc, getString(R.string.geo_aventura_parc)));
        trips.add(new PlacesAndTrips("Bran Castle", R.drawable.castelul_bran, getString(R.string.geo_castelul_bran)));
        trips.add(new PlacesAndTrips("Cantacuzino Castle", R.drawable.castelul_cantacuzino, getString(R.string.geo_castelul_cantacuzino)));
        trips.add(new PlacesAndTrips("Dino Park", R.drawable.dino_parc, getString(R.string.geo_dino_parc)));
        trips.add(new PlacesAndTrips("Peles Castle", R.drawable.castelul_peles, getString(R.string.geo_castelul_peles)));
        trips.add(new PlacesAndTrips("Rasnov Citadel", R.drawable.cetatea_rasnov, getString(R.string.geo_cetatea_rasnov)));
        trips.add(new PlacesAndTrips("The Zoo", R.drawable.gradina_zoologica, getString(R.string.geo_gradina_zoo)));
        trips.add(new PlacesAndTrips("Bear Sanctuary", R.drawable.sanctuarul_ursilor, getString(R.string.geo_sanctuarul_ursilor)));

        PlacesAndTripsAdapter placesAndTripsAdapter =  new PlacesAndTripsAdapter(this, trips);
        ListView listView =  findViewById(R.id.listView);
        listView.setAdapter(placesAndTripsAdapter);
    }
}
