package com.example.android.grevenatourguide;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Set;

import static android.R.id.tabs;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Create the viewpager
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        myFragmentPagerAdapter adapter = new myFragmentPagerAdapter(getSupportFragmentManager(), this);

        //Set the adapter for the viewpager
        viewPager.setAdapter(adapter);

        //tab icons
        final int[] ICONS = new int[]{
                R.drawable.ic_local_see_white_48dp,
                R.drawable.ic_restaurant_white_48dp,
                R.drawable.ic_local_hotel_white_48dp,
                R.drawable.ic_location_city_white_48dp
        };

        //Set the TabLayout for the ViewPager
        TabLayout tabs = (TabLayout) findViewById(R.id.sliding_tabs);
        tabs.setupWithViewPager(viewPager);

        //set icons for the tabs
        tabs.getTabAt(0).setIcon(ICONS[0]);
        tabs.getTabAt(1).setIcon(ICONS[1]);
        tabs.getTabAt(2).setIcon(ICONS[2]);
        tabs.getTabAt(3).setIcon(ICONS[3]);
    }
}
