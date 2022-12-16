package com.example.basicmediaapplication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class GeniusActivity extends AppCompatActivity {

    RecyclerView recyclerview;

    String s1[],s2[];
    int images[]= { R.drawable.ic_baseline_auto_fix_high_24,R.drawable.ic_baseline_format_color_fill_24,R.drawable.ic_baseline_face_4_24};
    int images1[]={R.drawable.genius1};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genius);
            recyclerview = findViewById(R.id.recyclerView);
            recyclerview.setHasFixedSize(true);
            s1=getResources().getStringArray(R.array.title);
            s2=getResources().getStringArray(R.array.descriptions);
            geniusAdapter adapter = new geniusAdapter(this,s1,s2,images,images1);
            recyclerview.setAdapter(adapter);
            recyclerview.setLayoutManager(new LinearLayoutManager(this));
            adapter.notifyDataSetChanged();
        }

    }