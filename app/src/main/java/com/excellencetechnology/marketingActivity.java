package com.excellencetechnology;

import static android.view.WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.excellencetechnology.adapters.MyListAdapter;

public class marketingActivity extends AppCompatActivity {

    static int selected;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marketing);

        getWindow().setStatusBarColor(getColor(R.color.white));
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            getWindow().getDecorView().getWindowInsetsController().setSystemBarsAppearance(APPEARANCE_LIGHT_STATUS_BARS, APPEARANCE_LIGHT_STATUS_BARS);
        }

        ListView listView;

        String[] courses = {"Digital Marketing", "Search Engine", "Social Media", "Web Analytics", "Adwords and Display", "Email Marketing",
                "Content Marketing", "Affiliate Marketing", "Youtube Marketing"};
        String[] summary = {"A battle tested language used in over 8 billion devices",
                "Android isn't about what you can achieve with it but what you can do with it",
                "One of the easiest language to learn and advance too",
                "Create your first webpage with HTML,and start the journey",
                "Design tour webpage your way by using CSS",
                "You’re building your own maze, in a way, and you might just get lost in it",
                "React is a great framework that bridges the gap between web and mobile",
                "You’re building your own maze, in a way, and you might just get lost in it",
                "React is a great framework that bridges the gap between web and mobile"};
        int[] images = {R.drawable.teacher,R.drawable.search_engine,R.drawable.social_media,R.drawable.analytics,R.drawable.adwords,R.drawable.email,R.drawable.copywriting,R.drawable.affiliate,R.drawable.youtubemarketing};
        String[] bgColors = {"#C2D6BD", "#C9E3E3", "#F2DAC6", "#CBCBCB", "#F0E2E2","#C2D6BD", "#C9E3E3", "#F2DAC6", "#CBCBCB"};

        MyListAdapter adapter=new MyListAdapter(this, courses, summary, images, bgColors);
        listView=(ListView)findViewById(R.id.listView);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                selected = position;
                Intent i = new Intent(marketingActivity.this, TopicsActivity.class);
                startActivity(i);
            }
        });
    }
}