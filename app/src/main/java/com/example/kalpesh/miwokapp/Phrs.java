package com.example.kalpesh.miwokapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Phrs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrs);
        ArrayList<Word> word = new ArrayList<>() ;
        word.add(new Word("Where are you going?","minto wuksus",0)) ;
        word.add(new Word("What is your name?","tinnә oyaase'nә",0)) ;
        word.add(new Word("My name is...","oyaaset...",0)) ;
        word.add(new Word("How are you feeling?","michәksәs?",0)) ;
        word.add(new Word("I’m feeling good.","kuchi achit",0)) ;
        word.add(new Word("Are you coming?","әәnәs'aa?",0)) ;
        word.add(new Word("Yes, I’m coming.","hәә’ әәnәm",0)) ;
        word.add(new Word("I’m coming.","әәnәm",0)) ;
        word.add(new Word("Let’s go.","yoowutis",0)) ;
        word.add(new Word("Come here.","әnni'nem",0)) ;

        WordAdapterWithoutImgView wdadapter = new WordAdapterWithoutImgView(this,word) ;
        ListView listview = findViewById(R.id.ph_list) ;
        listview.setAdapter(wdadapter) ;

    }
}
