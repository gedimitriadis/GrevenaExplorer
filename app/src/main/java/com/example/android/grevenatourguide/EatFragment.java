package com.example.android.grevenatourguide;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;



public class EatFragment extends Fragment {

    public EatFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Find and inflate ListView to use with adapter
        View rootView = inflater.inflate(R.layout.guide_list, container, false);

        // Create a list of Restaurants
        final ArrayList<GuideItem> GuideItems = new ArrayList<GuideItem>();

        // Populate item list
        GuideItems.add(new GuideItem(R.drawable.aulais, getString(R.string.aulais_title), getString(R.string.aulais_desc), getString(R.string.aulais_coord), getString(R.string.aulais_phone), getString(R.string.aulais_URL)));
        GuideItems.add(new GuideItem(R.drawable.trapezageuseon, getString(R.string.trapeza_title), getString(R.string.trapeza_desc), getString(R.string.trapeza_coord), getString(R.string.trapeza_phone), getString(R.string.trapeza_URL)));
        GuideItems.add(new GuideItem(R.drawable.venti, getString(R.string.venti_title), getString(R.string.venti_desc), getString(R.string.venti_coord), getString(R.string.venti_phone), getString(R.string.venti_URL)));
        GuideItems.add(new GuideItem(R.drawable.square, getString(R.string.square_title), getString(R.string.square_desc), getString(R.string.square_coord), getString(R.string.square_phone), getString(R.string.square_URL)));

        // Create an {@link GuideItemAdapter}, whose data source is a list of {@link GuideItem}s.
        // The adapter knows how to create list items for each item in the list.
        GuideItemAdapter adapter = new GuideItemAdapter(getActivity(), GuideItems);

        // Find the {@link ListView} object in the view hierarchy
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
