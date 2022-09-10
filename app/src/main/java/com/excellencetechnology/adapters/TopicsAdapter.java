package com.excellencetechnology.adapters;


import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.excellencetechnology.R;

public class TopicsAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] topics;


    public TopicsAdapter(Activity context, String[] topics) {
        super(context, R.layout.list_layout, topics);
        this.context = context;
        this.topics = topics;
    }

    public View getView(int position,View view,ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.topics, null,true);

        TextView titleText = (TextView) rowView.findViewById(R.id.topic_name);
        titleText.setText(topics[position]);
        return rowView;
    };

}