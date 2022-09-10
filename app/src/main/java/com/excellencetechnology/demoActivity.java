package com.excellencetechnology;

import static android.view.WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;

public class demoActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);

        getWindow().setStatusBarColor(getColor(R.color.white));
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            getWindow().getDecorView().getWindowInsetsController().setSystemBarsAppearance(APPEARANCE_LIGHT_STATUS_BARS, APPEARANCE_LIGHT_STATUS_BARS);
        }

        EditText nameEt = findViewById(R.id.nameET);
        EditText emailEt = findViewById(R.id.emailET);
        EditText mobileEt = findViewById(R.id.mobileET);
        String[] courses = {"Java", "Android", "Python", "Web Development", "Web Designing"};
        AutoCompleteTextView autoCompleteTextView = findViewById(R.id.courseSelection);
        Button submit = findViewById(R.id.submitBtn);

        ArrayAdapter<? extends String> arrayAdapter = new ArrayAdapter<>(this, R.layout.demo_dropdown, courses);
        autoCompleteTextView.setAdapter(arrayAdapter);

        submit.setOnClickListener(view -> {
            String nameData = nameEt.getText().toString();
            String emailData = emailEt.getText().toString();
            String mobileData = mobileEt.getText().toString();
            String courseData = autoCompleteTextView.getText().toString();
            String message = "I am " + nameData + ". And I am interested in " + courseData + " Course. " +
                    "I need a demo class so I can confirm my admission with you. I am reachable at " + mobileData + " and " + emailData
                    + " . Thanks";
            sendMail(message);
        });
    }

    private void sendMail(String mailBody) {

//        String mail = "info@excellencetechnology.in";
        String mail = "rahul731999@gmail.com";

        String subject = "Requesting a Demo";

        //Send Mail
        JavaMailAPI javaMailAPI = new JavaMailAPI(this,mail,subject, mailBody);

        javaMailAPI.execute();

    }
}