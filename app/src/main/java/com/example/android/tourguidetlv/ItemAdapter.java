package com.example.android.tourguidetlv;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ItemAdapter extends ArrayAdapter<Item> {
    private int mColorResourceId;
    public ItemAdapter(Activity context, ArrayList<Item> item, int colorResourceId){
        super(context,0,item);
        mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        final Item currentItem = getItem(position);

        ImageView itemImageView = (ImageView) listItemView.findViewById(R.id.item_image_view);
        if(currentItem.hasImage()){
            itemImageView.setImageResource(currentItem.getmImageResource());
            itemImageView.setVisibility(View.VISIBLE);
        }
        else {
            itemImageView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.item_name);
        nameTextView.setText(currentItem.getmName());

        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.item_description);
        descriptionTextView.setText(currentItem.getmDescription());

        TextView locationTextView = (TextView) listItemView.findViewById(R.id.item_location);
        locationTextView.setText(currentItem.getmLocation());

        TextView timeTextView = (TextView) listItemView.findViewById(R.id.item_time);
        timeTextView.setText(currentItem.getmTime());

        TextView phoneTextView = (TextView) listItemView.findViewById(R.id.item_phone);
        phoneTextView.setText(currentItem.getmPhone());

        if(currentItem.getmPhone() != null){
            phoneTextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String phoneText = currentItem.getmPhone();
                    Intent callIntent = new Intent(Intent.ACTION_DIAL);
                    callIntent.setData(Uri.parse("tel:" + phoneText));
                    if(callIntent.resolveActivity(v.getContext().getPackageManager()) != null){
                        v.getContext().startActivity(callIntent);
                    }
                }
            });
        }

        if(currentItem.getmLocation() != null){
            locationTextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String locationText = currentItem.getmGeo();
                    Intent locationIntent = new Intent(Intent.ACTION_VIEW);
                    locationIntent.setData(Uri.parse("geo:" + locationText+"?z=19"));
                    if(locationIntent.resolveActivity(v.getContext().getPackageManager()) != null){
                        v.getContext().startActivity(locationIntent);
                    }
                }
            });
        }

        return listItemView;
    }

}
