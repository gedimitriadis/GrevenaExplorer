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


public class SleepFragment extends Fragment {

    public SleepFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Find and inflate ListView to use with adapter
        View rootView = inflater.inflate(R.layout.guide_list, container, false);

        // Create a list of hotels
        final ArrayList<GuideItem> GuideItems = new ArrayList<GuideItem>();

        // Populate item list
        GuideItems.add(new GuideItem(R.drawable.axilleion, getString(R.string.achillion_title), getString(R.string.achillion_desc), getString(R.string.achillion_coord), getString(R.string.achillion_phone), getString(R.string.achillion_URL)));
        GuideItems.add(new GuideItem(R.drawable.aigli, getString(R.string.aigli_title), getString(R.string.aigli_desc), getString(R.string.aigli_coord), getString(R.string.aigli_phone), getString(R.string.aigli_URL)));
        GuideItems.add(new GuideItem(R.drawable.metropolis, getString(R.string.metropolis_title), getString(R.string.metropolis_desc), getString(R.string.metropolis_coord), getString(R.string.metropolis_phone), getString(R.string.metropolis_URL)));

        // Create an {@link GuideItemAdapter}, whose data source is a list of {@link GuideItem}s.
        // The adapter knows how to create list items for each item in the list.
        GuideItemAdapter adapter = new GuideItemAdapter(getActivity(), GuideItems);

        // Find the {@link ListView} object in the view hierarchy
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
