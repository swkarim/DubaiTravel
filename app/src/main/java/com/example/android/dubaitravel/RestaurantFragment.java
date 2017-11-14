package com.example.android.dubaitravel;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantFragment extends Fragment {


    public RestaurantFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        //Create list of popular restaurants
        final ArrayList<Place> restaurants = new ArrayList<Place>();

        //Populate the list with custom class Place
        restaurants.add(new Place(getString(R.string.desc_restaurant_one)));
        restaurants.add(new Place(getString(R.string.desc_restaurant_two)));
        restaurants.add(new Place(getString(R.string.desc_restaurant_three)));
        restaurants.add(new Place(getString(R.string.desc_restaurant_four)));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), restaurants);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
