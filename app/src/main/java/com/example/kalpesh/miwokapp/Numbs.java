package com.example.kalpesh.miwokapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
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

        ArrayList<String> words = new ArrayList<>() ;
        words.add("one") ;
        words.add("two") ;
        words.add("three") ;
        words.add("four") ;
        words.add("five") ;
        words.add("six") ;
        words.add("seven") ;
        words.add("eight") ;
        words.add("nine") ;
        words.add("ten") ;


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

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,words) ;
        ListView listView = findViewById(R.id.list) ;
        listView.setAdapter(itemsAdapter) ;
    }
}

