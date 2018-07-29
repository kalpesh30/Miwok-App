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
        word.add(new Word("red","weṭeṭṭi")) ;
        word.add(new Word("green","chokokki")) ;
        word.add(new Word("brown","takaakki")) ;
        word.add(new Word("gray", "ṭopoppi")) ;
        word.add(new Word("black","kululli")) ;
        word.add(new Word("white","kelelli")) ;
        word.add(new Word("dusty yellow","takaakki")) ;
        word.add(new Word("mustard yellow","chiwiiṭә")) ;

        WordAdapter wdAdapter = new WordAdapter(this,word) ;
        ListView listView = findViewById(R.id.lv_clr) ;
        listView.setAdapter(wdAdapter);
    }
}
