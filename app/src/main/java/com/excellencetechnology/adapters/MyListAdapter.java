package com.excellencetechnology.adapters;


import android.app.Activity;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

import com.excellencetechnology.R;

public class MyListAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] courses;
    private final String[] summary;
    private final int[] images;
    private String[] bgColors;


    public MyListAdapter(Activity context, String[] courses, String[] summary, int[] images, String[] bgColors) {
        super(context, R.layout.list_layout, courses);
        this.context = context;
        this.courses = courses;
        this.summary = summary;
        this.images = images;
        this.bgColors = bgColors;
    }

    public View getView(int position,View view,ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.list_layout, null,true);

        TextView titleText = (TextView) rowView.findViewById(R.id.title);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        CardView listitem = rowView.findViewById(R.id.listCard);

        titleText.setText(courses[position]);
        imageView.setImageResource(images[position]);
        listitem.setCardBackgroundColor(Color.parseColor(bgColors[position]));

        return rowView;

    };

}