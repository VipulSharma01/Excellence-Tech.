package com.excellencetechnology.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.excellencetechnology.R;
import com.excellencetechnology.models.EBookData;

import java.util.ArrayList;

public class EBookAdapter extends RecyclerView.Adapter<EBookAdapter.EBookViewHolder> {

    private ArrayList<EBookData> courseDataArrayList;
    private Context mcontext;

    public EBookAdapter(ArrayList<EBookData> recyclerDataArrayList, Context mcontext) {
        this.courseDataArrayList = recyclerDataArrayList;
        this.mcontext = mcontext;
    }

    @NonNull
    @Override
    public EBookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflate Layout
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ebook_card, parent, false);
        return new EBookViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EBookViewHolder holder, int position) {
        // Set the data to textview and imageview.
        EBookData recyclerData = courseDataArrayList.get(position);
        holder.ebookTitle.setText(recyclerData.getTitle());
        holder.ebookDl.setImageResource(recyclerData.getImgid());
    }

    @Override
    public int getItemCount() {
        // this method returns the size of recyclerview
        return courseDataArrayList.size();
    }

    // View Holder Class to handle Recycler View.
    public class EBookViewHolder extends RecyclerView.ViewHolder {

        private TextView ebookTitle;
        private ImageView ebookImg;
        private ImageView ebookDl;

        public EBookViewHolder(@NonNull View itemView) {
            super(itemView);
            ebookTitle = itemView.findViewById(R.id.ebook_title);
            ebookImg = itemView.findViewById(R.id.ebook_image);
            ebookDl = itemView.findViewById(R.id.ebook_dl);
        }
    }
}

