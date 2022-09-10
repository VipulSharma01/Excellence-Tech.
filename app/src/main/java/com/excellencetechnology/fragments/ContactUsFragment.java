package com.excellencetechnology.fragments;

import static android.view.WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.excellencetechnology.Homepage;
import com.excellencetechnology.R;
import com.google.android.material.button.MaterialButton;

public class ContactUsFragment extends Fragment {


    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toolbar toolbarFragment = (Toolbar)getActivity().findViewById(R.id.toolbar);
        ((Homepage)getActivity()).setToolbar(toolbarFragment, "Contact us", R.color.white, R.drawable.ic_baseline_arrow_back_ios_new_24);
        getActivity().getWindow().setStatusBarColor(getActivity().getColor(R.color.white));
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            getActivity().getWindow().getDecorView().getWindowInsetsController().setSystemBarsAppearance(APPEARANCE_LIGHT_STATUS_BARS, APPEARANCE_LIGHT_STATUS_BARS);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_contact_us, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        MaterialButton call_button = view.findViewById(R.id.callbtn);
        MaterialButton whatsapp_button = view.findViewById(R.id.wabtn);
        MaterialButton mail_button = view.findViewById(R.id.mailbtn);
        MaterialButton map = view.findViewById(R.id.mapbtn);

        map.setOnClickListener(v -> {
            String url = "https://maps.app.goo.gl/u7zKXysrtbFAWZXw9";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });

        call_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:"+ "9356255522"));
                startActivity(callIntent);
            }
        });

        whatsapp_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PackageManager pm = getContext().getPackageManager();
                boolean isWhatsappInstalled = isPackageInstalled("com.whatsapp", pm);
                if (isWhatsappInstalled) {
                    String url = "https://wa.me/919356255522?text=Hi,%20this%20is%20a%20test%20message%20from%20excellence%20app";
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse(url));
                    startActivity(i);
                } else {
                    Toast.makeText(getContext(), "Whatsapp is not installed, Opening Playstore", Toast.LENGTH_SHORT).show();
                    Uri uri = Uri.parse("https://play.google.com/store/apps/details?id=com.whatsapp&hl=en_IN&gl=US");
                    Intent goToMarket = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(goToMarket);

                }
            }
        });

        mail_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = "info@excellencetechnology.in";
                String subject = "/* Your subject here */";
                String body = "/* Your body here */";
                String chooserTitle = "/* Your chooser title here */";

                Uri uri = Uri.parse("mailto:" + email)
                        .buildUpon()
                        .appendQueryParameter("subject", subject)
                        .appendQueryParameter("body", body)
                        .build();

                Intent emailIntent = new Intent(Intent.ACTION_SENDTO, uri);
                startActivity(Intent.createChooser(emailIntent, chooserTitle));

            }
        });
    }

    @Override
    public void onStart() {
        super.onStart();
        Toolbar toolbarFragment = (Toolbar)getActivity().findViewById(R.id.toolbar);
        ((Homepage)getActivity()).setToolbar(toolbarFragment, "Contact us", R.color.white, R.drawable.ic_baseline_arrow_back_ios_new_24);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            getActivity().getWindow().setStatusBarColor(getActivity().getColor(R.color.white));
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            getActivity().getWindow().getDecorView().getWindowInsetsController().setSystemBarsAppearance(APPEARANCE_LIGHT_STATUS_BARS, APPEARANCE_LIGHT_STATUS_BARS);
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public void onStop() {
        super.onStop();
        Toolbar toolbarFragment = (Toolbar)getActivity().findViewById(R.id.toolbar);
        ((Homepage)getActivity()).setToolbar(toolbarFragment, null, R.color.darker, R.drawable.menu_24);
        getActivity().getWindow().setStatusBarColor(getActivity().getColor(R.color.darker));
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            getActivity().getWindow().getDecorView().getWindowInsetsController().setSystemBarsAppearance(0, APPEARANCE_LIGHT_STATUS_BARS);
        }
    }

    private static boolean isPackageInstalled(String packageName, PackageManager packageManager) {
        try {
            packageManager.getPackageInfo(packageName, 0);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }
}