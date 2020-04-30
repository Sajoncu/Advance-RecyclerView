package com.example.advancerecyclerview.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.advancerecyclerview.R;
import com.example.advancerecyclerview.adapter.TimelineAdapter;
import com.example.advancerecyclerview.model.TimeLineItem;
import com.example.advancerecyclerview.utils.DataSources;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TimelineAdapter timelineAdapter;
    private RecyclerView recyclerView;
    private List<TimeLineItem> mTimeline;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initRV();
        getListData();
        setUpAdapter();
    }

    private void setUpAdapter() {
        timelineAdapter = new TimelineAdapter(this, mTimeline);
        recyclerView.setAdapter(timelineAdapter);
    }

    private void getListData() {
        mTimeline = DataSources.getTimelineData();
    }

    private void initRV() {
        recyclerView = findViewById(R.id.timeline_rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
