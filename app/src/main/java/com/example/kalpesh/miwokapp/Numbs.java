package com.example.kalpesh.miwokapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Numbs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        // An array of Words

        String words[] = new String[10] ;
        words[0] = "one" ;
        words[1] = "two" ;
        words[2] = "three" ;
        words[3] = "four" ;
        words[4] = "five" ;
        words[5] = "six" ;
        words[6] = "seven" ;
        words[7] = "eight" ;
        words[8] = "nine" ;
        words[9] = "ten" ;

        Log.v("Number's Actvity","Word at index 0 : " + words[0]) ;
        Log.v("Number's Activity","Word at index 1 : " + words[1]) ;
    }
}
