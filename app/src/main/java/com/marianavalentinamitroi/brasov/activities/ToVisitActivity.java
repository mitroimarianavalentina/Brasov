package com.marianavalentinamitroi.brasov.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.marianavalentinamitroi.brasov.R;
import com.marianavalentinamitroi.brasov.adapter.PlacesAndTripsAdapter;
import com.marianavalentinamitroi.brasov.model.PlacesAndTrips;

import java.util.ArrayList;

public class ToVisitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        /** create a new ArrayList<PlacesAndTrips> and populate it */
        final ArrayList<PlacesAndTrips> placesToSee = new ArrayList<>();

        /** add places to the list */
        placesToSee.add(new PlacesAndTrips("Council Square", R.drawable.piata_sfatului,
                getString(R.string.geo_piata_sfatului), getString(R.string.council_square_d)));

        placesToSee.add(new PlacesAndTrips("Black Church", R.drawable.biserica_neagra,
                getString(R.string.geo_biserica_neagra), getString(R.string.biserica_neagra_d)));

        placesToSee.add(new PlacesAndTrips("First Romanian School", R.drawable.prima_scoala_romaneasca,
                getString(R.string.geo_prima_scoala), getString(R.string.first_school_d)));

        placesToSee.add(new PlacesAndTrips("Saint Nicholas Church", R.drawable.biserica_sf_nicolae,
                getString(R.string.geo_biserica_sf_nicolae), getString(R.string.st_nicholas_d)));

        placesToSee.add(new PlacesAndTrips("White Tower", R.drawable.turnul_alb,
                getString(R.string.geo_turnul_alb), getString(R.string.turnul_alb_d)));

        placesToSee.add(new PlacesAndTrips("\"Behind the Walls\" Alley", R.drawable.dupa_ziduri,
                getString(R.string.geo_dupa_ziduri), getString(R.string.dupa_ziduri_d)));

        placesToSee.add(new PlacesAndTrips("Muresenilor House", R.drawable.casa_muresenilor,
                getString(R.string.geo_casa_muresenilor), getString(R.string.casa_muresenilor_d)));

        placesToSee.add(new PlacesAndTrips("Brasov Citadel", R.drawable.cetatea_brasov,
                getString(R.string.geo_cetatea_brasov), getString(R.string.brasov_citadel_d)));

        placesToSee.add(new PlacesAndTrips("Weavers Bastion", R.drawable.bastionul_tesatorilor,
                getString(R.string.geo_bastionul_tesatorilor), getString(R.string.weavers_bastion_d)));


        PlacesAndTripsAdapter placesAndTripsAdapter =  new PlacesAndTripsAdapter(this, placesToSee);
        ListView listView =  findViewById(R.id.listView);
        listView.setAdapter(placesAndTripsAdapter);

        //on click to display a toast with some info about the sight
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String description = placesToSee.get(position).getDescription();
                String title = placesToSee.get(position).getName();
                Intent intent = new Intent(getApplicationContext(), DescriptionsActivity.class);
                intent.putExtra("description", description);
                intent.putExtra("title", title);
                startActivity(intent);
            }
        });
    }
}
