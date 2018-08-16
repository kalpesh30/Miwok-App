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
        word.add(new Word("Where are you going?","minto wuksus")) ;
        word.add(new Word("What is your name?","tinnә oyaase'nә")) ;
        word.add(new Word("My name is...","oyaaset...")) ;
        word.add(new Word("How are you feeling?","michәksәs?")) ;
        word.add(new Word("I’m feeling good.","kuchi achit")) ;
        word.add(new Word("Are you coming?","әәnәs'aa?")) ;
        word.add(new Word("Yes, I’m coming.","hәә’ әәnәm")) ;
        word.add(new Word("I’m coming.","әәnәm")) ;
        word.add(new Word("Let’s go.","yoowutis")) ;
        word.add(new Word("Come here.","әnni'nem"));

        WordAdapterWithoutImgView wdadapter = new WordAdapterWithoutImgView(this,word) ;
        ListView listview = findViewById(R.id.ph_list) ;
        listview.setAdapter(wdadapter) ;

    }
}
