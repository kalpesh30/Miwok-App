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
        word.add(new Word("Where are you going?","minto wuksus",R.drawable.ic_launcher_background)) ;
        word.add(new Word("What is your name?","tinnә oyaase'nә",R.drawable.ic_launcher_background)) ;
        word.add(new Word("My name is...","oyaaset...",R.drawable.ic_launcher_background)) ;
        word.add(new Word("How are you feeling?","michәksәs?",R.drawable.ic_launcher_background)) ;
        word.add(new Word("I’m feeling good.","kuchi achit",R.drawable.ic_launcher_background)) ;
        word.add(new Word("Are you coming?","әәnәs'aa?",R.drawable.ic_launcher_background)) ;
        word.add(new Word("Yes, I’m coming.","hәә’ әәnәm",R.drawable.ic_launcher_background)) ;
        word.add(new Word("I’m coming.","әәnәm",R.drawable.ic_launcher_background)) ;
        word.add(new Word("Let’s go.","yoowutis",R.drawable.ic_launcher_background)) ;
        word.add(new Word("Come here.","әnni'nem",R.drawable.ic_launcher_background)) ;

        WordAdapter wdadapter = new WordAdapter(this,word) ;
        ListView listview = findViewById(R.id.ph_list) ;
        listview.setAdapter(wdadapter) ;

    }
}
