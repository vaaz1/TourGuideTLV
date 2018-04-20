package com.example.android.tourguidetlv;

public class Item {
    private int mImageResource = NO_IMG_PROVIDED;
    private String mName;
    private String mDescription;
    private String mLocation;
    private String mGeo;
    private String mTime;
    private String mPhone;
    private static final int NO_IMG_PROVIDED = -1;


    public Item(int imageResource, String name, String description, String location, String geo, String time, String phone){
        mImageResource = imageResource;
        mName = name;
        mDescription = description;
        mLocation = location;
        mGeo = geo;
        mTime = time;
        mPhone = phone;
    }

    public Item(String name, String description, String location, String geo, String time, String phone){
        mName = name;
        mDescription = description;
        mLocation = location;
        mGeo = geo;
        mTime = time;
        mPhone = phone;
    }

    public Item(int imageResource, String name, String description, String location, String geo, String time){
        mImageResource = imageResource;
        mName = name;
        mDescription = description;
        mLocation = location;
        mGeo = geo;
        mTime = time;
    }

    public Item(String name, String description, String location, String geo, String time){
        mName = name;
        mDescription = description;
        mLocation = location;
        mGeo = geo;
        mTime = time;
    }

    public int getmImageResource(){
        return mImageResource;
    }
    public String getmName(){
        return mName;
    }
    public String getmDescription(){
        return mDescription;
    }
    public String getmLocation(){
        return mLocation;
    }
    public String getmGeo() {
        return mGeo;
    }
    public String getmTime(){
        return mTime;
    }
    public String getmPhone(){
        return mPhone;
    }
    public boolean hasImage(){
        return mImageResource != NO_IMG_PROVIDED;
    }
}
