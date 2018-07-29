package com.example.kalpesh.miwokapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Numbs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        // An array of Words

        ArrayList<Word> words = new ArrayList<>() ;
        words.add(new Word("One","lutti")) ;
        words.add(new Word("two", "otiiko")) ;
        words.add(new Word("three","tolookosu")) ;
        words.add(new Word("four", "oyyisa")) ;
        words.add(new Word("five","massokka")) ;
        words.add(new Word("six","temmokka")) ;
        words.add(new Word("seven","kenekaku")) ;
        words.add(new Word("eight","kawinta")) ;
        words.add(new Word("nine","wo’e")) ;
        words.add(new Word("ten","na’aacha")) ;


        //LinearLayout NumbsLayout = findViewById(R.id.NumbLayout) ;
        // Counter for text variables

        //int i = 0;

        // Loop setting the TextViews in the Numbs Activity

        /* while(i<10) {
            TextView tv_one = new TextView(this);
            tv_one.setText(words.get(i));
            NumbsLayout.addView(tv_one);
            tv_one.setTextSize(28);
            i += 1 ;
        } */

        WordAdapter itemsAdapter = new WordAdapter(this,words) ;
        //ListView listView = findViewById(R.id.list) ;
        //listView.setAdapter(itemsAdapter) ;
        ListView listView = findViewById(R.id.list) ;
        listView.setAdapter(itemsAdapter);
    }
}

