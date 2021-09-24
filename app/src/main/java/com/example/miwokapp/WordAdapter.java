package com.example.miwokapp;
import android.content.Context;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word>{
// resource id for background color fot this list of items
    private final int mColorResourceId;
    public WordAdapter(Context context, ArrayList<Word> words, int colorResourceID) {
        super(context,0, words);
        mColorResourceId = colorResourceID;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Word localWord = getItem(position);

        TextView miwokTextView = listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(localWord.getMiwokTranslation());

        TextView defaultTextView = listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(localWord.getDefaultTranslation());

        ImageView iconView = listItemView.findViewById(R.id.image);
        if(localWord.hasImage()) {
            iconView.setImageResource(localWord.getImageResourceId());
            // make sure view is visible
            iconView.setVisibility(View.VISIBLE);
        }
        else{
            //otherwise hide it completely
            iconView.setVisibility(View.GONE);
        }
        View textContainer= listItemView.findViewById(R.id.text_container);
        int color= ContextCompat.getColor(getContext(),mColorResourceId);
        textContainer.setBackgroundColor(color);
        return listItemView;
    }
}

