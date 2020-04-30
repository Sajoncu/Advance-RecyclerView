package com.example.advancerecyclerview.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.bumptech.glide.Glide;
import com.example.advancerecyclerview.R;
import com.example.advancerecyclerview.model.PostVideoItem;
import com.example.advancerecyclerview.model.TimeLineItem;

public class PostVideoViewHolder extends BaseViewHolder {

    TextView time;
    ImageView imageView;

    public PostVideoViewHolder(@NonNull View itemView) {
        super(itemView);
        time = itemView.findViewById(R.id.post_video_time);
        imageView = itemView.findViewById(R.id.port_video_user_image);
    }

    @Override
    void setData(TimeLineItem item) {
        PostVideoItem post = item.getPostVideoItem();
        time.setText(post.getTime());
        Glide.with(imageView.getContext()).load(post.getUserImg()).into(imageView);
    }
}
