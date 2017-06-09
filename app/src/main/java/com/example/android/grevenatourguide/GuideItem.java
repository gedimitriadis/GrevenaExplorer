package com.example.android.grevenatourguide;

import static android.R.attr.description;

/**
 * Created by georgeD on 03/06/2017.
 */

public class GuideItem {

    /**
     * Image resource ID for the item
     */
    private int mImageResourceID;

    /**
     * Title of the item
     */
    private String mTitle;

    /**
     * Phone number for the item
     */
    private String mPhoneNumber;

    /**
     * Address for the item
     */
    private String mAddress;

    /**
     * Description for each item
     */
    private String mDescription;

    /**
     * url or facebook profile
     */
    private String mWebsite;

    /**
     * Create a new GuideItem object for FamousFor, Eat, Sleep, Authorities fragments
     *
     * @param imageResourceID is the resource ID for the image to be used
     * @param title           is the item name
     * @param phoneNumber     the phone number for the item
     * @param address         is the address of the item
     * @param description     is more details about the item
     * @param website         is the url or facebook profile for item
     */

    /* constructor of GuideItem */
    public GuideItem(int imageResourceID, String title, String description, String address, String phoneNumber, String website) {
        mImageResourceID = imageResourceID;
        mTitle = title;
        mDescription = description;
        mAddress = address;
        mPhoneNumber = phoneNumber;
        mWebsite = website;
    }
    /**
     * Methods for getting item info
     */
    public int getImageResourceID() {
        return mImageResourceID;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getDescription() {
        return mDescription;
    }

    public String getAddress() {
        return mAddress;
    }

    public String getPhoneNumber() {
        return mPhoneNumber;
    }

    public String getWebsite() {
        return mWebsite;
    }


}
