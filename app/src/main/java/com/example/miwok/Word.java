package com.example.miwok;

public class Word {

    public String mDefaultTranslation;
    public String mMiwokTranslation;
    public int mImageResourceId = NO_IMAGE_PROVIDED ;
    public static final int NO_IMAGE_PROVIDED = -1;
    public int mAudioResourceID;




    public Word(String DefaultTranslation, String MiwokTranslation,int audioResourceID ){
        mDefaultTranslation=DefaultTranslation;
        mMiwokTranslation=MiwokTranslation;
        mAudioResourceID=audioResourceID;
    }
    public Word(String DefaultTranslation, String MiwokTranslation, int ImageResourceId,int audioResourceID){
        mDefaultTranslation=DefaultTranslation;
        mMiwokTranslation=MiwokTranslation;
        mImageResourceId=ImageResourceId;
        mAudioResourceID=audioResourceID;
    }
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }


}


