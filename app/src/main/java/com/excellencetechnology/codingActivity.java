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

public class codingActivity extends AppCompatActivity {

    static int selected;
    static String courseName;
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coding);

        getWindow().setStatusBarColor(getColor(R.color.white));
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            getWindow().getDecorView().getWindowInsetsController().setSystemBarsAppearance(APPEARANCE_LIGHT_STATUS_BARS, APPEARANCE_LIGHT_STATUS_BARS);
        }

        ListView listView;

        String[] courses = {"Java", "Python", "HTML", "CSS", "Javascript", "React", "PHP"};
        String[] summary = {"A battle tested language used in over 8 billion devices",
                            "One of the easiest language to learn and advance too",
                            "Create your first webpage with HTML,and start the journey",
                            "Design tour webpage your way by using CSS",
                            "You’re building your own maze, in a way, and you might just get lost in it",
                            "React is a great framework that bridges the gap between web and mobile",
                            "PHP is about as exciting as your toothbrush. You use it every day."};
        int[] images = {R.drawable.java,R.drawable.python,R.drawable.html,R.drawable.web_design,R.drawable.js,R.drawable.react_vector,R.drawable.php};
        String[] bgColors = {"#C2D6BD", "#C9E3E3", "#F2DAC6", "#CBCBCB", "#F0E2E2","#C2D6BD", "#C9E3E3"};
        String[] course = {"java", "python", "html", "css", "js", "react", "php"};

        MyListAdapter adapter=new MyListAdapter(this, courses, summary, images, bgColors);
        listView=(ListView)findViewById(R.id.listView);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                selected = position;
                courseName = course[position];
                Intent i = new Intent(codingActivity.this, TopicsActivity.class);
                startActivity(i);
;            }
        });
    }

    public static int position(){
        return selected;
    }

    public static void setSelected(int selected) {
        codingActivity.selected = selected;
    }

    public static void setCourseName(String courseName) {
        codingActivity.courseName = courseName;
    }

    public static String getCourseName(){
        return courseName;
    }
}