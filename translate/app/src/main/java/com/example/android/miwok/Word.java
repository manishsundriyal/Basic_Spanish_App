package com.example.android.miwok;

/**
 * Created by Hind on 05-Sep-16.
 */
public class Word {
    private String mDefaultTranslation;
     private String mMiwokTranslation;
    private int mImageResourceId=NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mAudioResourceId;
    public Word(String defaultTranslation,String miwokTranslation,int imageResourceId,int audioResourceID)
    {
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
        mImageResourceId=imageResourceId;
        mAudioResourceId=audioResourceID;
    }

    public Word(String defaultTranslation,String miwokTranslation,int audioResourceID)
    {
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
        mAudioResourceId=audioResourceID;
    }
    public  String getMiwokTranslation()
    {

        return mMiwokTranslation;
    }
    public String getDefaultTranslation()

    {
        return mDefaultTranslation;
    }

    public int getmImageResourceId() {

        return mImageResourceId;
    }
    public boolean hasImage()
    {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
    public int getmAudioResourceId()
    {
        return mAudioResourceId;
    }
}
