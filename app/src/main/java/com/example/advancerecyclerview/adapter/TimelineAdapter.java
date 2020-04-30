package com.example.advancerecyclerview.adapter;

import android.content.Context;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.advancerecyclerview.model.TimeLineItem;

import java.util.List;

public class TimelineAdapter extends RecyclerView.Adapter<BaseViewHolder> {
    private Context context;
    private List<TimeLineItem> mData;

    public TimelineAdapter(Context context, List<TimeLineItem> mData) {
        this.context = context;
        this.mData = mData;
    }

    @NonNull
    @Override
    public BaseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull BaseViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        if(mData != null) {
            return mData.size();
        } else {
          return 0;
        }
    }
}
