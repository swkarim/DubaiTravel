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
public class TouristFragment extends Fragment {


    public TouristFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        //Create list of popular tourist places
        final ArrayList<Place> places = new ArrayList<Place>();

        //Populate the list with custom class Place
        places.add(new Place(R.drawable.burj_khalifa, getString(R.string.desc_burj_khalifa)));
        places.add(new Place(R.drawable.burj_al_arab, getString(R.string.desc_burj_al_arab)));
        places.add(new Place(R.drawable.atlantis, getString(R.string.desc_atlantis)));
        places.add(new Place(R.drawable.wild_wadi, getString(R.string.desc_wild_wadi)));
        
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
