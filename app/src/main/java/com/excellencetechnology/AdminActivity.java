package com.excellencetechnology;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.excellencetechnology.admin.DetailsActivity;

public class AdminActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
        EditText user= (EditText) findViewById(R.id.et_Email);
        EditText pass= (EditText) findViewById(R.id.et_Pass);
        Button login = (Button) findViewById(R.id.login_btn);


        login.setOnClickListener(view -> {
            if (user.getText().toString().equals("admin@123")&&pass.getText().toString().equals("1234")){
                Intent i = new Intent(AdminActivity.this, DetailsActivity.class);
                startActivity(i);
            }
            else {
                Toast.makeText(this, "Enter Valid Details", Toast.LENGTH_SHORT).show();
            }
        });

    }
}