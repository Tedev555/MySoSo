package com.tedory.mysoso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class FeedActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);

        String[] sampleStrArr = {"title 1", "title 2", "title 3", "title 4",
                "title 5", "title 5"};

        recyclerView = findViewById(R.id.recycler_view);
        Adapter adapter = new Adapter(sampleStrArr);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

    }
}
