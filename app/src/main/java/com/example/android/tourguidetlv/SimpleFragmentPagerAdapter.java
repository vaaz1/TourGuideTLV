package com.example.android.tourguidetlv;

import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.android.tourguidetlv.R;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {
    private Context mContext;
    public SimpleFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        if (position == 0) {
            return new ShoppingFragment();
        } else if (position == 1){
            return new EventsFragment();
        } else if (position == 2){
            return new AttractionsFragment();
        } else if (position == 3){
            return new NatureFragment();
        } else {
            return new RestaurantsFragment();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0){
            return mContext.getString(R.string.category_shopping);
        }
        else if(position == 1){
            return mContext.getString(R.string.category_events);
        }
        else if(position == 2){
            return mContext.getString(R.string.category_attractions);
        }
        else if (position == 3){
            return mContext.getString(R.string.category_nature);
        }
        else{
            return mContext.getString(R.string.category_restaurants);
        }
    }

    @Override
    public int getCount() {
        return 5;
    }
}

