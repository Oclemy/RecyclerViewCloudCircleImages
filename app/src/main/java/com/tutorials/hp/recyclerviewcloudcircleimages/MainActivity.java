package com.tutorials.hp.recyclerviewcloudcircleimages;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.tutorials.hp.recyclerviewcloudcircleimages.mData.TVShowsCollection;
import com.tutorials.hp.recyclerviewcloudcircleimages.mRecycler.MyAdapter;


public class MainActivity extends AppCompatActivity {

    RecyclerView rv;
    MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //RECYCLERVIEW
        rv= (RecyclerView) findViewById(R.id.rv);
        rv.setLayoutManager(new LinearLayoutManager(this));

        //ADAPTER
        adapter=new MyAdapter(this, TVShowsCollection.getTVShows());


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rv.setAdapter(adapter);
            }
        });
    }


}
