package com.excellencetechnology.admin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.excellencetechnology.R;

import java.util.ArrayList;

public class Myadapter extends RecyclerView.Adapter<Myadapter.MyViewHolder> {

     Context context;
     ArrayList<User>  list;

    public Myadapter(Context context, ArrayList<User> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item,parent,false);

        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        User user = list.get(position);
        holder.Name.setText(user.getName());
        holder.Email.setText(user.getEmail());
        holder.PhoneNumber.setText(user.getPhoneNumber());
        holder.Gender.setText(user.getGender());
        holder.Qualification.setText(user.getQualification());
        holder.City.setText(user.getCity());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView Name,Email,PhoneNumber,Gender,Qualification,City;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            Name = itemView.findViewById(R.id.name);
            Email = itemView.findViewById(R.id.e_mail);
            PhoneNumber = itemView.findViewById(R.id.ph_num);
            Gender = itemView.findViewById(R.id.gen);
            Qualification = itemView.findViewById(R.id.edu);
            City = itemView.findViewById(R.id.ci_ty);
        }
    }
}
