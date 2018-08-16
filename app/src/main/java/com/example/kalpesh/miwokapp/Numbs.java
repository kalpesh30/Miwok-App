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
        words.add(new Word("One","lutti",R.drawable.number_one)) ;
        words.add(new Word("two", "otiiko",R.drawable.number_two)) ;
        words.add(new Word("three","tolookosu",R.drawable.number_three)) ;
        words.add(new Word("four", "oyyisa",R.drawable.number_four)) ;
        words.add(new Word("five","massokka",R.drawable.number_five)) ;
        words.add(new Word("six","temmokka",R.drawable.number_six)) ;
        words.add(new Word("seven","kenekaku",R.drawable.number_seven)) ;
        words.add(new Word("eight","kawinta",R.drawable.number_eight)) ;
        words.add(new Word("nine","wo’e",R.drawable.number_nine)) ;
        words.add(new Word("ten","na’aacha",R.drawable.number_ten)) ;


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

