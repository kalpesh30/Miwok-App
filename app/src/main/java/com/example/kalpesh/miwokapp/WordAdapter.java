package com.example.kalpesh.miwokapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int listItemColorId;

    public void setListItemColorId(int listItemColorId) {
        this.listItemColorId = listItemColorId;
    }

    public WordAdapter(@NonNull Context context,@NonNull ArrayList<Word> objects,int colorId) {
        super(context,0, objects);
        this.listItemColorId = colorId ;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView ;
        if(listItemView == null)
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false) ;
        Word word = getItem(position) ;

        // Displaying Miwok Word
        TextView tvMiwok = (TextView)  listItemView.findViewById(R.id.tv_Miw) ;
        tvMiwok.setText(word.getMiwok()) ;
        // Displaying English Meaning of the word
        TextView tvEng = (TextView) listItemView.findViewById(R.id.tv_Eng) ;
        tvEng.setText(word.getDef_eng());

        ImageView imgView = (ImageView) listItemView.findViewById(R.id.iv_Sym) ;

        if(word.imagExist()) {
            imgView.setVisibility(View.VISIBLE);
            imgView.setImageResource(word.getImageResource());
        }
        else{
            imgView.setVisibility(View.GONE);
        }

        View listview = listItemView.findViewById(R.id.ll_translation) ;
        listview.setBackgroundColor(listItemColorId);

        return listItemView;

    }


}
