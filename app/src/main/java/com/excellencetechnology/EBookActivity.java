package com.excellencetechnology;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.AsyncTask;
import android.os.Bundle;

import com.excellencetechnology.adapters.EBookAdapter;
import com.excellencetechnology.models.EBookData;
import com.github.barteksc.pdfviewer.PDFView;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

import javax.net.ssl.HttpsURLConnection;

public class EBookActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<EBookData> recyclerDataArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ebook);

        recyclerView=findViewById(R.id.ebookList);

        // created new array list..
        recyclerDataArrayList=new ArrayList<>();

        // added data to array list
        recyclerDataArrayList.add(new EBookData("DSA",R.drawable.welcome_illus));
        recyclerDataArrayList.add(new EBookData("DSA",R.drawable.welcome_illus));
        recyclerDataArrayList.add(new EBookData("DSA",R.drawable.welcome_illus));
        recyclerDataArrayList.add(new EBookData("DSA",R.drawable.welcome_illus));
        recyclerDataArrayList.add(new EBookData("DSA",R.drawable.welcome_illus));
        recyclerDataArrayList.add(new EBookData("DSA",R.drawable.welcome_illus));
        recyclerDataArrayList.add(new EBookData("DSA",R.drawable.welcome_illus));

        // added data from arraylist to adapter class.
        EBookAdapter adapter=new EBookAdapter(recyclerDataArrayList,this);

        // setting grid layout manager to implement grid view.
        // in this method '2' represents number of columns to be displayed in grid view.
        GridLayoutManager layoutManager=new GridLayoutManager(this,2);

        // at last set adapter to recycler view.
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}