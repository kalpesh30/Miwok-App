package com.example.kalpesh.miwokapp;

public class Word {
    private String def_eng;
    private String miwok;

    Word(String st1,String st2) {
        def_eng = st1;
        miwok = st2;
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

}
