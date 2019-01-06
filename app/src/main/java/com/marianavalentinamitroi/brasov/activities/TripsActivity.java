package com.marianavalentinamitroi.brasov.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.marianavalentinamitroi.brasov.R;
import com.marianavalentinamitroi.brasov.adapter.TripsAdapter;
import com.marianavalentinamitroi.brasov.model.Trips;

import java.util.ArrayList;

public class TripsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        /** create a new ArrayList<Trips> and populate it */
        ArrayList<Trips> trips = new ArrayList<>();

        /** add trips to the list */
        trips.add(new Trips("Aventura Parc", R.drawable.aventura_parc, getString(R.string.geo_aventura_parc)));
        trips.add(new Trips("Bran Castle", R.drawable.castelul_bran, getString(R.string.geo_castelul_bran)));
        trips.add(new Trips("Cantacuzino Castle", R.drawable.castelul_cantacuzino, getString(R.string.geo_castelul_cantacuzino)));
        trips.add(new Trips("Dino Park", R.drawable.dino_parc, getString(R.string.geo_dino_parc)));
        trips.add(new Trips("Peles Castle", R.drawable.castelul_peles, getString(R.string.geo_castelul_peles)));
        trips.add(new Trips("Rasnov Citadel", R.drawable.cetatea_rasnov, getString(R.string.geo_cetatea_rasnov)));
        trips.add(new Trips("The Zoo", R.drawable.gradina_zoologica, getString(R.string.geo_gradina_zoo)));
        trips.add(new Trips("Bear Sanctuary", R.drawable.sanctuarul_ursilor, getString(R.string.geo_sanctuarul_ursilor)));

        TripsAdapter tripsAdapter =  new TripsAdapter(this, trips);
        ListView listView =  findViewById(R.id.listView);
        listView.setAdapter(tripsAdapter);
    }
}
