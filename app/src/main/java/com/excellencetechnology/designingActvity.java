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

public class designingActvity extends AppCompatActivity {

    static int selected;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_designing);

        getWindow().setStatusBarColor(getColor(R.color.white));
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            getWindow().getDecorView().getWindowInsetsController().setSystemBarsAppearance(APPEARANCE_LIGHT_STATUS_BARS, APPEARANCE_LIGHT_STATUS_BARS);
        }

        ListView listView;

        String[] courses = {"Adobe Photoshop", "Adobe Illustrator", "Corel Draw", "Figma"};
        String[] summary = {"A battle tested language used in over 8 billion devices",
                "Android isn't about what you can achieve with it but what you can do with it",
                "One of the easiest language to learn and advance too",
                "Create your first webpage with HTML,and start the journey"};
        int[] images = {R.drawable.photoshop,R.drawable.illustrator,R.drawable.cdr,R.drawable.figma};
        String[] bgColors = {"#C2D6BD", "#C9E3E3", "#F2DAC6", "#CBCBCB"};

        MyListAdapter adapter=new MyListAdapter(this, courses, summary, images, bgColors);
        listView=(ListView)findViewById(R.id.listView);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                selected = position;
                Intent i = new Intent(designingActvity.this, TopicsActivity.class);
                startActivity(i);
            }
        });
    }
}