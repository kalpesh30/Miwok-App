package com.example.kalpesh.miwokapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private View.OnClickListener NumbListener = new View.OnClickListener() {

        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getBaseContext(), Numbs.class) ;
            startActivity(intent) ;

        }
    } ;

    private View.OnClickListener FMemListener = new View.OnClickListener() {

        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getBaseContext(), FMem.class) ;
            startActivity(intent) ;

        }
    } ;

    private View.OnClickListener ClrsListener = new View.OnClickListener() {

        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getBaseContext(), Clrs.class) ;
            startActivity(intent) ;

        }
    } ;

    private View.OnClickListener PhrsListener = new View.OnClickListener() {

        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getBaseContext(),Phrs.class) ;
            startActivity(intent) ;
        }
    } ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv1 = findViewById(R.id.numbers) ;
        tv1.setOnClickListener(NumbListener);
        TextView tv2 = findViewById(R.id.family) ;
        TextView tv3 = findViewById(R.id.phrases) ;
        TextView tv4 = findViewById(R.id.colors) ;
        tv2.setOnClickListener(FMemListener);
        tv3.setOnClickListener(PhrsListener) ;
        tv4.setOnClickListener(ClrsListener) ;

    }

}
