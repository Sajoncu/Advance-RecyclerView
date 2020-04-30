package com.example.advancerecyclerview.adapter;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.advancerecyclerview.R;
import com.example.advancerecyclerview.model.TimeLineItem;

public class HeaderTextViewHolder extends BaseViewHolder {
    TextView headerText;
    public HeaderTextViewHolder(@NonNull View itemView) {
        super(itemView);
        headerText = itemView.findViewById(R.id.header_text);
    }

    @Override
    void setData(TimeLineItem item) {
        headerText.setText(item.getHeaderTextItem().getHeaderText());
    }
}
