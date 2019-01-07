package com.marianavalentinamitroi.brasov.adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.marianavalentinamitroi.brasov.R;
import com.marianavalentinamitroi.brasov.model.PlacesAndTrips;

import java.util.ArrayList;

public class PlacesAndTripsAdapter extends ArrayAdapter<PlacesAndTrips> {

    public PlacesAndTripsAdapter(@NonNull Context context, @NonNull ArrayList<PlacesAndTrips> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable final View convertView, @NonNull ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_trips, parent, false);
        }

        // find the current word
        final PlacesAndTrips currentTrip = getItem(position);

        TextView name  =  listItemView.findViewById(R.id.trip_name);
        ImageView photo  =  listItemView.findViewById(R.id.trip_image);

        name.setText(currentTrip.getName());
        photo.setImageResource(currentTrip.getPhoto());

        /** find the location icon */
        ImageView location = listItemView.findViewById(R.id.location_icon);
        /** set a click listener ro the location icon, so, when clicked, we can go to google maps */
        location.setOnClickListener(new View.OnClickListener() {
            @NonNull
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri = Uri.parse(currentTrip.getLocation());
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");

                getContext().startActivity(mapIntent);
            }
        });

        return listItemView;
    }

}
