package com.excellencetechnology.fragments;

import static android.view.WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.excellencetechnology.Homepage;
import com.excellencetechnology.R;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class ProfileFragment extends Fragment {

    FirebaseAuth auth;
    FirebaseDatabase database;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Change toolbar properties for this fragment
        Toolbar toolbarFragment = (Toolbar)getActivity().findViewById(R.id.toolbar);
        ((Homepage)getActivity()).setToolbar(toolbarFragment, "Profile", R.color.white, R.drawable.ic_baseline_arrow_back_ios_new_24);
        getActivity().getWindow().setStatusBarColor(getActivity().getColor(R.color.white));
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            getActivity().getWindow().getDecorView().getWindowInsetsController().setSystemBarsAppearance(APPEARANCE_LIGHT_STATUS_BARS, APPEARANCE_LIGHT_STATUS_BARS);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false);
    }

    @Override
    public void onResume() {
        super.onResume();

        TextView userName = getView().findViewById(R.id.name);
        ImageView userImage = getView().findViewById(R.id.photo);

        // Fetching User's Name and setting only 1st part
        auth = FirebaseAuth.getInstance();
        database = FirebaseDatabase.getInstance();
        DatabaseReference mDb = database.getReference();
        FirebaseUser user = auth.getCurrentUser();
        String userKey = user.getUid();


         mDb.child("Users").child(userKey).addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String name = snapshot.child("name").getValue(String.class);
                if (name != null){
                    userName.setText(name);
                }

                String picUrl = snapshot.child("profilePic").getValue(String.class);
                new DownloadImageFromInternet(userImage).execute(picUrl);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public void onStart() {
        super.onStart();
        // Change toolbar properties for this fragment on start
        Toolbar toolbarFragment = (Toolbar)getActivity().findViewById(R.id.toolbar);
        ((Homepage)getActivity()).setToolbar(toolbarFragment, "Profile", R.color.white, R.drawable.ic_baseline_arrow_back_ios_new_24);
        getActivity().getWindow().setStatusBarColor(getActivity().getColor(R.color.white));
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            getActivity().getWindow().getDecorView().getWindowInsetsController().setSystemBarsAppearance(APPEARANCE_LIGHT_STATUS_BARS, APPEARANCE_LIGHT_STATUS_BARS);
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public void onStop() {
        super.onStop();
        // Change toolbar properties for to activity one
        Toolbar toolbarFragment = (Toolbar)getActivity().findViewById(R.id.toolbar);
        ((Homepage)getActivity()).setToolbar(toolbarFragment, null, R.color.darker, R.drawable.menu_24);
        getActivity().getWindow().setStatusBarColor(getActivity().getColor(R.color.darker));
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            getActivity().getWindow().getDecorView().getWindowInsetsController().setSystemBarsAppearance(0, APPEARANCE_LIGHT_STATUS_BARS);
        }
    }

    private class DownloadImageFromInternet extends AsyncTask<String, Void, Bitmap> {
        ImageView imageView;
        public DownloadImageFromInternet(ImageView imageView) {
            this.imageView=imageView;
        }
        protected Bitmap doInBackground(String... urls) {
            String imageURL=urls[0];
            Bitmap bimage=null;
            try {
                InputStream in=new java.net.URL(imageURL).openStream();
                bimage=BitmapFactory.decodeStream(in);
            } catch (Exception e) {
                Log.e("Error Message", e.getMessage());
                e.printStackTrace();
            }
            return bimage;
        }
        protected void onPostExecute(Bitmap result) {
            imageView.setImageBitmap(result);
        }
    }
}