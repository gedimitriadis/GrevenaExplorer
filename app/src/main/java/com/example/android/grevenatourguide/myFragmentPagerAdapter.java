package com.example.android.grevenatourguide;

import android.content.Context;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

/**
 * Created by georgeD on 04/06/2017.
 */

public class myFragmentPagerAdapter extends android.support.v4.app.FragmentPagerAdapter {

    private Context mContext;

    //Public constructor for the ViewPager Adapter
    public myFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        //Set the Fragments as ViewPager items
        if (position == 0) {
            return new FamousForFragment();
        } else if (position == 1) {
            return new EatFragment();
        } else if (position == 2) {
            return new SleepFragment();
        } else {
            return new AuthoritiesFragment();
        }
    }

    @Override
    public int getCount() {
        //Returns the number of items of the Viewpager
        return 4;
    }
}
