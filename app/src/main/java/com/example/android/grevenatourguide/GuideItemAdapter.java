package com.example.android.grevenatourguide;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.net.Uri;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Locale;

import static android.R.attr.phoneNumber;

/**
 * Created by georgeD on 04/06/2017.
 */

public class GuideItemAdapter extends ArrayAdapter<GuideItem> {

    public GuideItemAdapter(FragmentActivity context, ArrayList<GuideItem> GuideItems) {
        super(context, 0, GuideItems);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View GuideItemView = convertView;
        if (GuideItemView == null) {
            GuideItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link GuideItem} object located at this position in the list
        GuideItem currentGuideItem = getItem(position);


        // Find the TextView in the list_item.xml layout with the ID image.
        final ImageView itemImageView = (ImageView) GuideItemView.findViewById(R.id.image_list_view);
        itemImageView.setImageResource(currentGuideItem.getImageResourceID());

        // Find the TextView in the list_item.xml layout with the ID title.
        TextView titleTextView = (TextView) GuideItemView.findViewById(R.id.title);
        // Get the Title from the currentGuideItem object and set this text on
        // the Title TextView.
        titleTextView.setText(currentGuideItem.getTitle());

        // Find the TextView in the list_item.xml layout with the ID description.
        TextView descriptionTextView = (TextView) GuideItemView.findViewById(R.id.description);
        // Get the desc from the currentGuideItem object and set this text on
        // the desc TextView.
        descriptionTextView.setText(currentGuideItem.getDescription());

        // get phone number, location and url for the item
        final String phoneNumber = currentGuideItem.getPhoneNumber();
        final String location = currentGuideItem.getAddress();
        final String website = currentGuideItem.getWebsite();

        //Create a Click Listener for phone icon
        ImageView phoneIconView = (ImageView) GuideItemView.findViewById(R.id.phone_icon);
        phoneIconView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //If clicking on the icon, opens the dialer with correct phone number displayed
                Intent phoneIntent = new Intent(Intent.ACTION_DIAL);
                phoneIntent.setData(Uri.parse("tel:" + phoneNumber));
                getContext().startActivity(phoneIntent);

            }
        });

        //Create a Click Listener for maps icon
        ImageView mapIconView = (ImageView) GuideItemView.findViewById(R.id.map_icon);
        mapIconView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //If clicking on the icon, goes to the site of the place through maps app
                Uri geoLocation = Uri.parse(location + "?z21");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, geoLocation);
                getContext().startActivity(mapIntent);

            }
        });

        //Create a Click Listener for URL
        ImageView websiteIconView = (ImageView) GuideItemView.findViewById(R.id.website_icon);
        websiteIconView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //If clicking on the icon, goes to a relative link (website, youtube, facebook) opening the browser
                Intent webIntent = new Intent(Intent.ACTION_VIEW);
                webIntent.setData(Uri.parse(website));
                getContext().startActivity(webIntent);

            }
        });

        return GuideItemView;
    }
}
