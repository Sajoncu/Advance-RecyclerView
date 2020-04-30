package com.example.advancerecyclerview.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.bumptech.glide.Glide;
import com.example.advancerecyclerview.R;
import com.example.advancerecyclerview.model.TimeLineItem;

public class PostTextViewHolder extends BaseViewHolder {

    TextView time, tv_content;
    ImageView imageView;

    public PostTextViewHolder(@NonNull View itemView) {
        super(itemView);
        time = itemView.findViewById(R.id.post_text_time);
        tv_content = itemView.findViewById(R.id.post_text_content);
        imageView = itemView.findViewById(R.id.post_text_image);
    }

    @Override
    void setData(TimeLineItem item) {
        time.setText(item.getPostTextItem().getTime());
        tv_content.setText(item.getPostTextItem().getPostText());
        Glide.with(itemView.getContext()).load(item.getPostTextItem().getImageUser()).into(imageView);
    }

}
