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
        word.add(new Word("father","әpә")) ;
        word.add(new Word("mother","әṭa")) ;
        word.add(new Word("son","angsi")) ;
        word.add(new Word("daughter","tune")) ;
        word.add(new Word("older brother","taachi")) ;
        word.add(new Word("younger brother","chalitti")) ;
        word.add(new Word("older sister","teṭe")) ;
        word.add(new Word("younger sister","kolliti")) ;
        word.add(new Word("grandmother","ama")) ;
        word.add(new Word("grandfather","paapa")) ;

        WordAdapter wdAdapter = new WordAdapter(this,word) ;
        ListView listView = findViewById(R.id.lv_fmly) ;
        listView.setAdapter(wdAdapter) ;

    }
}
