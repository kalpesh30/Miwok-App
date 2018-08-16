package com.example.kalpesh.miwokapp;

public class Word {
    private String def_eng;
    private String miwok;
    private int imageResource = NO_IMAGE_SUPPLIED;

    private static final int NO_IMAGE_SUPPLIED = -1 ;

    Word(String st1, String st2){
        def_eng = st1 ;
        miwok = st2 ;
    }

    Word(String st1,String st2,int imageResourceid ) {
        def_eng = st1;
        miwok = st2;
        imageResource = imageResourceid ;
    }

    public String getDef_eng() {
        return def_eng;
    }

    public String getMiwok() {
        return miwok;
    }

    public void setDef_eng(String def_eng) {
        this.def_eng = def_eng;
    }

    public void setMiwok(String miwok) {
        this.miwok = miwok;
    }

    /**
     * In order to check whether the image exist or not for a perticular word object
     *
     */
    public boolean imagExist() {
        if(imageResource != NO_IMAGE_SUPPLIED)
            return true;
        else
            return false;
    }

    public int getImageResource() {
        return imageResource;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource ;
    }
}
