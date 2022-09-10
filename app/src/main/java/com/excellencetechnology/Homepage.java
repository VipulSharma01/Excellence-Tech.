package com.excellencetechnology;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.excellencetechnology.R.id;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class Homepage extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    String[] PERMISSIONS = {Manifest.permission.CALL_PHONE};
    int PERMISSION_ALL = 1;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @SuppressLint({"RestrictedApi", "ResourceAsColor"})
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);

        if (!hasPermissions(this, PERMISSIONS)) {
            ActivityCompat.requestPermissions(this, PERMISSIONS, PERMISSION_ALL);
        }

        Toolbar mToolbar = findViewById(id.toolbar);
        setSupportActionBar(mToolbar);

        DrawerLayout drawer = findViewById(id.drawer_layout);
        NavigationView navigationView = findViewById(id.nav_view);

        mAppBarConfiguration = new AppBarConfiguration.Builder(
//                R.id.nav_home, id.nav_profile, id.nav_contact ,id.nav_gallery)
                R.id.nav_home, id.nav_contact ,id.nav_gallery)
                .setOpenableLayout(drawer)
                .build();
        mToolbar.post(() -> {
            Drawable d = ResourcesCompat.getDrawable(getResources(), R.drawable.menu_24, null);
            mToolbar.setNavigationIcon(d);
            mToolbar.setTitle("");
            mToolbar.setBackgroundColor(getResources().getColor(R.color.darker));
        });

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);

    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

    public void setToolbar(Toolbar toolbar, String title, int color, int icon){
        AppCompatActivity actionBar = this;
        actionBar.setSupportActionBar(toolbar);

        DrawerLayout drawer = actionBar.findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.setDrawerIndicatorEnabled(true);
        toggle.syncState();
        if(toolbar != null) {
            toolbar.setTitle(title);
            toolbar.setBackgroundColor(getResources().getColor(color));
            toolbar.setNavigationIcon(icon);
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finishAffinity();
        System.exit(0);
    }

    public static boolean hasPermissions(Context context, String... permissions) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M && context != null && permissions != null) {
            for (String permission : permissions) {
                if (ActivityCompat.checkSelfPermission(context, permission) != PackageManager.PERMISSION_GRANTED) {
                    return false;
                }
            }
        }
        return true;
    }
}
