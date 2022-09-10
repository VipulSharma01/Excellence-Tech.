package com.excellencetechnology.fragments;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;

import com.excellencetechnology.EBookActivity;
import com.excellencetechnology.R;
import com.excellencetechnology.TopicsActivity;
import com.excellencetechnology.codingActivity;
import com.excellencetechnology.demoActivity;
import com.excellencetechnology.designingActvity;
import com.excellencetechnology.marketingActivity;
import com.google.android.material.card.MaterialCardView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class HomeFragment extends Fragment {

    String[] name;
    FirebaseAuth auth;
    FirebaseDatabase database;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onResume() {
        super.onResume();
        LinearLayout demoBanner = getView().findViewById(R.id.demo);
        TextView userName = getView().findViewById(R.id.UserName);
        MaterialCardView codingAct = getView().findViewById(R.id.coding);
        MaterialCardView designAct = getView().findViewById(R.id.designing);
        MaterialCardView marketingAct = getView().findViewById(R.id.marketing);

        codingAct.setOnClickListener(view -> {
            Intent intent = new Intent(getContext(), codingActivity.class);
            startActivity(intent);
        });

        designAct.setOnClickListener(view -> {
            Intent intent = new Intent(getContext(), designingActvity.class);
            startActivity(intent);
        });

        marketingAct.setOnClickListener(view -> {
            Intent intent = new Intent(getContext(), marketingActivity.class);
            startActivity(intent);
        });

        demoBanner.setOnClickListener(view -> {
            Intent i = new Intent(getContext(), demoActivity.class);
            startActivity(i);
        });

        LinearLayout root = getView().findViewById(R.id.options);
        TextView more = root.findViewById(R.id.more);
        TextView lesser = root.findViewById(R.id.less);
        LinearLayout reactjs = root.findViewById(R.id.reactjs);
        LinearLayout php = root.findViewById(R.id.php);
        LinearLayout js = root.findViewById(R.id.js);
        LinearLayout html = root.findViewById(R.id.html);
        LinearLayout second = root.findViewById(R.id.s_row);
        LinearLayout third = root.findViewById(R.id.t_row);

        more.setOnClickListener(view -> {
            more.setVisibility(View.GONE);
            lesser.setVisibility(View.VISIBLE);
            second.setVisibility(View.VISIBLE);
            third.setVisibility(View.VISIBLE);

        });

        lesser.setOnClickListener(view -> {
            second.setVisibility(View.GONE);
            third.setVisibility(View.GONE);
            more.setVisibility(View.VISIBLE);
            lesser.setVisibility(View.GONE);
        });

        reactjs.setOnClickListener(view -> {
            Intent intent = new Intent(getContext(), TopicsActivity.class);
            codingActivity.setSelected(5);
            codingActivity.setCourseName("react");
            startActivity(intent);
        });

        php.setOnClickListener(view -> {
            Intent intent = new Intent(getContext(), TopicsActivity.class);
            codingActivity.setSelected(6);
            codingActivity.setCourseName("php");
            startActivity(intent);
        });

        js.setOnClickListener(view -> {
            Intent intent = new Intent(getContext(), TopicsActivity.class);
            codingActivity.setSelected(4);
            codingActivity.setCourseName("js");
            startActivity(intent);
        });

        html.setOnClickListener(view -> {
            Intent intent = new Intent(getContext(), TopicsActivity.class);
            codingActivity.setSelected(2);
            codingActivity.setCourseName("html");
            startActivity(intent);
        });

        // Fetching User's Name and setting only 1st part
        auth = FirebaseAuth.getInstance();
        database = FirebaseDatabase.getInstance();
        DatabaseReference mDb = database.getReference();
        FirebaseUser user = auth.getCurrentUser();
        String userKey = user.getUid();

        mDb.child("Users").child(userKey).addValueEventListener(new ValueEventListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String firebaseName = snapshot.child("name").getValue(String.class);
                if (firebaseName != null){
                    name = firebaseName.split(" ");
                    userName.setText("Hello, " + name[0]);
                }
            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {
            }
        });
    }
}