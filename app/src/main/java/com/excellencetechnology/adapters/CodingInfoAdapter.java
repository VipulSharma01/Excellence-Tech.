package com.excellencetechnology.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.excellencetechnology.models.InfoData;
import com.excellencetechnology.R;

public class CodingInfoAdapter extends RecyclerView.Adapter<CodingInfoAdapter.ViewHolder> {
    private InfoData[] infoData;

    public CodingInfoAdapter(InfoData[] infoData) {
        this.infoData = infoData;
    }

    @NonNull
    @Override
    public CodingInfoAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.info_layout, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CodingInfoAdapter.ViewHolder holder, int position) {
        holder.contentText.setText(infoData[position].getContent());
    }

    @Override
    public int getItemCount() {
        return infoData.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView contentText;
        LinearLayout linearLayout;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.contentText = itemView.findViewById(R.id.textView);
            linearLayout = itemView.findViewById(R.id.linearLayoutt);
        }
    }
}
