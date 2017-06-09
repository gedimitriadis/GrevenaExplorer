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

public class AuthoritiesFragment extends Fragment {

    public AuthoritiesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Find and inflate ListView to use with adapter
        View rootView = inflater.inflate(R.layout.guide_list, container, false);

        // Create a list of necessary public services
        final ArrayList<GuideItem> GuideItems = new ArrayList<GuideItem>();

        // Populate item list
        GuideItems.add(new GuideItem(R.drawable.police, getString(R.string.police_title), getString(R.string.police_desc), getString(R.string.police_coord), getString(R.string.police_phone), getString(R.string.police_URL)));
        GuideItems.add(new GuideItem(R.drawable.firedepartment, getString(R.string.fire_title), getString(R.string.fire_desc), getString(R.string.fire_coord), getString(R.string.fire_phone), getString(R.string.fire_URL)));
        GuideItems.add(new GuideItem(R.drawable.hospital, getString(R.string.hospital_title), getString(R.string.hospital_desc), getString(R.string.hospital_coord), getString(R.string.hospital_phone), getString(R.string.hospital_URL)));
        GuideItems.add(new GuideItem(R.drawable.greekrescueteam, getString(R.string.rescue_title), getString(R.string.rescue_desc), getString(R.string.rescue_coord), getString(R.string.rescue_phone), getString(R.string.rescue_URL)));

        // Create an {@link GuideItemAdapter}, whose data source is a list of {@link GuideItem}s.
        // The adapter knows how to create list items for each item in the list.
        GuideItemAdapter adapter = new GuideItemAdapter(getActivity(), GuideItems);

        // Find the {@link ListView} object in the view hierarchy
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
