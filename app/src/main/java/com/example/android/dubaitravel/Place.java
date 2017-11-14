package com.example.android.dubaitravel;

/**
 * Created by Fazal on 5/11/2017.
 */

public class Place {
    private static final int NO_IMAGE_PROVIDED = -1;

    private int mPlaceImageId = NO_IMAGE_PROVIDED;
    private String mDescription;

    //Constructor
    public Place(int imageId, String description){
        mPlaceImageId = imageId;
        mDescription = description;
    }

    //Another constructor for those places that don't have a corresponding image
    public Place(String description){
        mDescription = description;
    }

    //Getter methods
    public int getmPlaceImageId(){
        return mPlaceImageId;
    }
    public String getmDescription(){
        return mDescription;
    }
    public boolean hasImage() {
        return mPlaceImageId != NO_IMAGE_PROVIDED;}
}
