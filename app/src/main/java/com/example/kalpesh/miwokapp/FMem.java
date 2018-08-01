package com.example.kalpesh.miwokapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class FMem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_members);

        ArrayList<Word> word = new ArrayList<>();
        word.add(new Word("father","әpә",R.drawable.family_father)) ;
        word.add(new Word("mother","әṭa",R.drawable.family_mother)) ;
        word.add(new Word("son","angsi",R.drawable.family_son)) ;
        word.add(new Word("daughter","tune",R.drawable.family_daughter)) ;
        word.add(new Word("older brother","taachi",R.drawable.family_older_brother)) ;
        word.add(new Word("younger brother","chalitti",R.drawable.family_younger_brother)) ;
        word.add(new Word("older sister","teṭe",R.drawable.family_older_sister)) ;
        word.add(new Word("younger sister","kolliti",R.drawable.family_younger_sister)) ;
        word.add(new Word("grandmother","ama",R.drawable.family_grandmother)) ;
        word.add(new Word("grandfather","paapa",R.drawable.family_grandfather)) ;

        WordAdapter wdAdapter = new WordAdapter(this,word) ;
        ListView listView = findViewById(R.id.lv_fmly) ;
        listView.setAdapter(wdAdapter) ;

    }
}
