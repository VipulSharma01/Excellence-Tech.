package com.excellencetechnology;

import static android.view.WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;

import com.excellencetechnology.models.UserModel;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.Objects;

public class FormActivity extends AppCompatActivity {

    ArrayAdapter arrayAdapter;
    FirebaseAuth auth;
    FirebaseDatabase database;
    DatabaseReference databaseReference;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        getWindow().setStatusBarColor(getColor(R.color.white));
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            getWindow().getDecorView().getWindowInsetsController().setSystemBarsAppearance(APPEARANCE_LIGHT_STATUS_BARS, APPEARANCE_LIGHT_STATUS_BARS);
        }

        Button submit = findViewById(R.id.submit);

        EditText name = findViewById(R.id.name);
        EditText email = findViewById(R.id.email);
        EditText number = findViewById(R.id.number);
        EditText city = findViewById(R.id.city);

        String[] qualification = {"M.Tech", "B.tech", "M.Sc", "B.Sc", "MCA", "BCA", "Senior Secondary", "Other PostGraduate", "Other Undergraduate"};
        String[] gender = {"Male", "Female", "Other"};
        AutoCompleteTextView qualificationAutoComplete = findViewById(R.id.courseSelection);
        AutoCompleteTextView genderAutoComplete = findViewById(R.id.genederselection);

        arrayAdapter = new ArrayAdapter(this, R.layout.demo_dropdown, qualification);
        qualificationAutoComplete.setAdapter(arrayAdapter);
        arrayAdapter = new ArrayAdapter(this, R.layout.demo_dropdown, gender);
        genderAutoComplete.setAdapter(arrayAdapter);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                auth = FirebaseAuth.getInstance();
                database = FirebaseDatabase.getInstance();
                DatabaseReference mDb = database.getReference();
                FirebaseUser user = auth.getCurrentUser();
                String userKey = Objects.requireNonNull(user).getUid();

                mDb.child("Users").child(userKey).addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {

                        String nameData = name.getText().toString();
                        String emailData = email.getText().toString();
                        String mobileData = number.getText().toString();
                        String genderData = genderAutoComplete.getText().toString();
                        String qualificationData = qualificationAutoComplete.getText().toString();
                        String cityData = city.getText().toString();

                        FirebaseDatabase.getInstance().getReference().child("Users").child(userKey).child("name").setValue(nameData);
                        FirebaseDatabase.getInstance().getReference().child("Users").child(userKey).child("email").setValue(emailData);
                        FirebaseDatabase.getInstance().getReference().child("Users").child(userKey).child("mobile").setValue(mobileData);
                        FirebaseDatabase.getInstance().getReference().child("Users").child(userKey).child("gender").setValue(genderData);
                        FirebaseDatabase.getInstance().getReference().child("Users").child(userKey).child("qualification").setValue(qualificationData);
                        FirebaseDatabase.getInstance().getReference().child("Users").child(userKey).child("city").setValue(cityData);
                        FirebaseDatabase.getInstance().getReference().child("Users").child(userKey).child("form_filled").setValue("yes");

                        Intent i = new Intent(FormActivity.this, Homepage.class);
                        startActivity(i);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
            }
        });
    }
}