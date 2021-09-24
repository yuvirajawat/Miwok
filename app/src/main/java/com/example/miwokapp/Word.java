package com.example.miwokapp;

public class Word {

    private final String mDefaultTranslation;
    private final String mMiwokTranslation;
    private final int mAudioResourceID;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    // constructor
    public Word( String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceID){
        mDefaultTranslation= defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceID = audioResourceID;

    }
    public Word( String defaultTranslation, String miwokTranslation, int audioResourceID){
        mDefaultTranslation= defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceID = audioResourceID;

    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }
// to get miwok translation
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
   //to get image resource id
    public int getImageResourceId(){
        return mImageResourceId;
    }
    // to get audio file resource id

    public int getAudioResourceID() {
        return mAudioResourceID;
    }


// returns whether there is an image for this word or not

    public boolean hasImage(){
        return mImageResourceId!=NO_IMAGE_PROVIDED;
    }
}
