package com.example.advancerecyclerview.adapter;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.advancerecyclerview.model.TimeLineItem;

public abstract class BaseViewHolder extends RecyclerView.ViewHolder {
    abstract void setData(TimeLineItem item);

    public BaseViewHolder(@NonNull View itemView) {
        super(itemView);
    }
}
