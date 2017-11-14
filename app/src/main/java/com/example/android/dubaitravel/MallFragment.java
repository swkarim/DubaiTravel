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
public class MallFragment extends Fragment {


    public MallFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        //Create list of popular malls
        final ArrayList<Place> malls = new ArrayList<Place>();

        //Populate the list with custom class Place
        malls.add(new Place(getString(R.string.desc_mall_one)));
        malls.add(new Place(getString(R.string.desc_mall_two)));
        malls.add(new Place(getString(R.string.desc_mall_three)));
        malls.add(new Place(getString(R.string.desc_mall_four)));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), malls);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
