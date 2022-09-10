package com.excellencetechnology;

import static android.view.WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.excellencetechnology.models.UserModel;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GoogleAuthProvider;
import com.google.firebase.database.FirebaseDatabase;

import java.text.Normalizer;

public class SignupActivity extends AppCompatActivity {

    EditText email;
    EditText pass;
    int flag = 0;
    private FirebaseAuth auth;
    FirebaseDatabase database;
    GoogleSignInClient mGoogleSignInClient;
    int RC_SIGN_IN = 65; //65 is a random number here

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        auth = FirebaseAuth.getInstance();
        database = FirebaseDatabase.getInstance();

        getWindow().setStatusBarColor(getColor(R.color.white));
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            getWindow().getDecorView().getWindowInsetsController().setSystemBarsAppearance(APPEARANCE_LIGHT_STATUS_BARS, APPEARANCE_LIGHT_STATUS_BARS);
        }

        Button nexticn = findViewById(R.id.next);
        email = findViewById(R.id.etEmail);
        pass = findViewById(R.id.etPass);
        TextView login = findViewById(R.id.login);
        MaterialCardView buttonGoogle = findViewById(R.id.btnGoogle);
        MaterialCardView buttonFb = findViewById(R.id.btnFacebook);


        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                //Don't know why this still here the code works anyway
                .requestIdToken(getString(R.string.default_web_client_id))
                .requestEmail()
                .build();

        mGoogleSignInClient = GoogleSignIn.getClient(this, gso);

        email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (email.getText().toString().matches("")) {
                    email.setError("Enter email");
                } else if (email.getText().toString().contains("@")) {
                    email.setError(null);
                } else {
                    email.setError("Not a valid email format");
                }
            }
        });

        pass.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (email.getText().toString().matches("")) {
                    email.setError("Enter email");
                }else if (pass.getText().toString().length() < 6){
                    pass.setError("Must have 6 character");
                }else {
                    email.setError(null);
                }
            }
        });

        nexticn.setOnClickListener(view -> {
            signupWithEmail();
        });

        buttonGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signIn();
            }
        });

        buttonFb.setOnClickListener(view -> {
            Intent i = new Intent(SignupActivity.this, FacebookAuthActivity.class);
            startActivity(i);
        });

        login.setOnClickListener(view -> {
            Intent i = new Intent(SignupActivity.this, LoginActivity.class);
            startActivity(i);
        });
    }

    private void signIn() {
        Intent signInIntent = mGoogleSignInClient.getSignInIntent();
        startActivityForResult(signInIntent, RC_SIGN_IN);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == RC_SIGN_IN) {
            Task<GoogleSignInAccount> task = GoogleSignIn.getSignedInAccountFromIntent(data);
            try {
                GoogleSignInAccount account = task.getResult(ApiException.class);
                firebaseAuthWithGoogle(account.getIdToken());
            } catch (ApiException e) {
                Log.w("TAG", "Google sign in failed", e);
            }
        }
    }

    private void firebaseAuthWithGoogle(String idToken) {
        AuthCredential credential = GoogleAuthProvider.getCredential(idToken, null);
        auth.signInWithCredential(credential).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    Log.d("TAG", "signInWithCredential:success");

                    FirebaseUser firebaseUser = auth.getCurrentUser();
                    UserModel userModel = new UserModel();
                    userModel.setEmail(firebaseUser.getEmail());
                    userModel.setProfilePic(firebaseUser.getPhotoUrl().toString());
                    database.getReference().child("Users").child(firebaseUser.getUid()).setValue(userModel);

                    Intent i = new Intent(SignupActivity.this, StartupProcessingActivity.class);
                    startActivity(i);
                } else {
                    // If sign in fails, display a message to the user.
                    Log.w("TAG", "signInWithCredential:failure", task.getException());
                }
            }
        });
    }

    private void signupWithEmail(){
        auth.createUserWithEmailAndPassword(email.getText().toString(), pass.getText().toString()).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    UserModel user = new UserModel(email.getText().toString(),
                            pass.getText().toString());

                    String id = task.getResult().getUser().getUid();
                    FirebaseDatabase.getInstance().getReference().child("Users").child(id).setValue(user);

                    Toast.makeText(getApplicationContext(), "User account Created successfully", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(SignupActivity.this, FormActivity.class);
                    startActivity(i);

                } else {
                    Toast.makeText(getApplicationContext(), task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}