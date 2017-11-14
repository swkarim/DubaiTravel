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
public class AltFragment extends Fragment {


    public AltFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        //Create list of popular off beat/alternate attractions.
        final ArrayList<Place> altAttractions = new ArrayList<Place>();

        //Populate the list with custom class Place
        altAttractions .add(new Place(getString(R.string.desc_off_one)));
        altAttractions .add(new Place(getString(R.string.desc_off_two)));
        altAttractions .add(new Place(getString(R.string.desc_off_three)));
        altAttractions .add(new Place(getString(R.string.desc_off_four)));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), altAttractions);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
