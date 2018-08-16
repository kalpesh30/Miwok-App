package com.example.kalpesh.miwokapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class WordAdapterWithoutImgView extends ArrayAdapter<Word> {


    public WordAdapterWithoutImgView(@NonNull Context context, @NonNull ArrayList<Word> objects) {
        super(context, 0, objects);
    }

    public View getView(int position,View convertView,ViewGroup parent) {
        View listItemView = convertView ;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_phrases,parent,false) ;
        }

        Word word = getItem(position) ;
        TextView miwokWord = (TextView) listItemView.findViewById(R.id.tv_Miw) ;
        miwokWord.setText(word.getMiwok());
        TextView engWord = (TextView) listItemView.findViewById(R.id.tv_Eng) ;
        engWord.setText(word.getDef_eng()) ;

        return listItemView ;
    }
}
