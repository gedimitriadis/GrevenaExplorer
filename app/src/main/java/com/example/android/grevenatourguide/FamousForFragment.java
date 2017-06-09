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


/*
 */
public class FamousForFragment extends Fragment {


    public FamousForFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Find and inflate ListView to use with adapter
        View rootView = inflater.inflate(R.layout.guide_list, container, false);

        // Create a list of items Grevena is known for
        final ArrayList<GuideItem> GuideItems = new ArrayList<GuideItem>();

        // Populate item list
        GuideItems.add(new GuideItem(R.drawable.mushroom, getString(R.string.city_of_mushrooms), getString(R.string.mushroom_desc) , getString(R.string.mushroom_coord),  getString(R.string.mushroom_phone), getString(R.string.mushroom_URL)));
        GuideItems.add(new GuideItem(R.drawable.vasilitsa, getString(R.string.vasilitsa_title), getString(R.string.vasilitsa_desc), getString(R.string.vasilitsa_coord), getString(R.string.vasilitsa_phone), getString(R.string.vasilitsa_URL)));
        GuideItems.add(new GuideItem(R.drawable.valiacalda, getString(R.string.valiacalda_title), getString(R.string.valiacalda_desc), getString(R.string.valiacalda_coord), getString(R.string.valiacalda_phone), getString(R.string.valiacalda_URL)));
        GuideItems.add(new GuideItem(R.drawable.stonebridge, getString(R.string.bridge_title), getString(R.string.bridge_desc), getString(R.string.bridge_coord), getString(R.string.bridge_phone), getString(R.string.bridge_URL)));
        GuideItems.add(new GuideItem(R.drawable.milia, getString(R.string.milia_title), getString(R.string.milia_desc), getString(R.string.milia_coord), getString(R.string.milia_phone), getString(R.string.milia_URL)));
        GuideItems.add(new GuideItem(R.drawable.orliakas, getString(R.string.orliakas_title), getString(R.string.orliakas_desc), getString(R.string.orliakas_coord), getString(R.string.orliakas_phone), getString(R.string.orliakas_URL)));
        GuideItems.add(new GuideItem(R.drawable.rafting, getString(R.string.rafting_title), getString(R.string.rafting_desc), getString(R.string.rafting_coord), getString(R.string.rafting_phone), getString(R.string.rafting_URL)));
        GuideItems.add(new GuideItem(R.drawable.enduro, getString(R.string.enduro_title), getString(R.string.enduro_desc), getString(R.string.enduro_coord), getString(R.string.enduro_phone), getString(R.string.enduro_URL)));

        // Create an {@link GuideItemAdapter}, whose data source is a list of {@link GuideItem}s.
        // The adapter knows how to create list items for each item in the list.
        GuideItemAdapter adapter = new GuideItemAdapter(getActivity(), GuideItems);

        // Find the {@link ListView} object in the view hierarchy.
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
