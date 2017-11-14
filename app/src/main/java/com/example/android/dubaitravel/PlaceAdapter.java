package com.example.android.dubaitravel;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Fazal on 5/11/2017.
 */

public class PlaceAdapter extends ArrayAdapter<Place> {


    public PlaceAdapter(Activity context, ArrayList<Place> places){
        super(context, 0, places);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        //Get the Place Object from the Array
        Place currentPlace = getItem(position);

        //Reference the Views from the layout
        TextView placeDescription = (TextView) listItemView.findViewById(R.id.place_description);


        //Extract the information from the Place Object and set it where appropriate.

        placeDescription.setText(currentPlace.getmDescription());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.place_image);
        if (currentPlace.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentPlace.getmPlaceImageId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        return listItemView;
    }
}
