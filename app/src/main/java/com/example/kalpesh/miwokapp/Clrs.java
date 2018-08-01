package com.example.kalpesh.miwokapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Clrs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colours);

        ArrayList<Word> word = new ArrayList<>() ;
        word.add(new Word("red","weṭeṭṭi",R.drawable.color_red)) ;
        word.add(new Word("green","chokokki",R.drawable.color_green)) ;
        word.add(new Word("brown","takaakki",R.drawable.color_brown)) ;
        word.add(new Word("gray", "ṭopoppi",R.drawable.color_gray)) ;
        word.add(new Word("black","kululli",R.drawable.color_black)) ;
        word.add(new Word("white","kelelli",R.drawable.color_white)) ;
        word.add(new Word("dusty yellow","takaakki",R.drawable.color_dusty_yellow)) ;
        word.add(new Word("mustard yellow","chiwiiṭә",R.drawable.color_mustard_yellow)) ;

        WordAdapter wdAdapter = new WordAdapter(this,word) ;
        ListView listView = findViewById(R.id.lv_clr) ;
        listView.setAdapter(wdAdapter);
    }
}
