package com.excellencetechnology.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import com.excellencetechnology.R;
import com.excellencetechnology.TopicsActivity;
import com.excellencetechnology.TopicsDetailedActivity;
import com.excellencetechnology.WebviewActivity;
import com.excellencetechnology.adapters.TopicsAdapter;
import com.excellencetechnology.codingActivity;
import com.google.android.exoplayer2.SimpleExoPlayer;


public class TopicFragment extends Fragment {

    public TopicsActivity topicsActivity;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_topic, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ListView listView;
        int pos = codingActivity.position();

        int[] topics = {R.array.java_topics, R.array.python_topics, R.array.html_topics, R.array.css_topics, R.array.js_topics, R.array.react_topics, R.array.php_topics};
        TopicsAdapter adapter=new TopicsAdapter(getActivity(), getResources().getStringArray(topics[pos]));
        listView=view.findViewById(R.id.listView);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener((adapterView, vieww, position, l) -> {
            topicsActivity = (TopicsActivity) getActivity();
            Intent intent = new Intent(getContext(), TopicsDetailedActivity.class);
            intent.putExtra("topic", String.valueOf(position));
            startActivity(intent);
        });
    }
}