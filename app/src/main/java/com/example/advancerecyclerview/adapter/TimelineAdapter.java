package com.example.advancerecyclerview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.advancerecyclerview.R;
import com.example.advancerecyclerview.model.TimeLineItem;
import com.example.advancerecyclerview.utils.Constant;

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
        View view;
        switch (viewType){
            case (Constant.ITEM_HEADER_TEXT_VIEWTYPE) :
                view = LayoutInflater.from(context).inflate(R.layout.header_item, parent, false);
                return new HeaderTextViewHolder(view);
            case (Constant.ITEM_POST_TEXT_VIEWTYPE) :
                view = LayoutInflater.from(context).inflate(R.layout.item_post_text, parent, false);
                return new PostTextViewHolder(view);
            case (Constant.ITEM_POST_VIDEO_VIEWTYPE) :
                view = LayoutInflater.from(context).inflate(R.layout.item_post_video, parent, false);
                return new PostVideoViewHolder(view);
            default : throw new IllegalArgumentException();
        }
    }

    @Override
    public void onBindViewHolder(@NonNull BaseViewHolder holder, int position) {
        holder.setData(mData.get(position));
    }

    @Override
    public int getItemViewType(int position) {
        return mData.get(position).getViewType();
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
