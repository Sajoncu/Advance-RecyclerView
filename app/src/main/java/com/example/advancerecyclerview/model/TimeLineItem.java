package com.example.advancerecyclerview.model;

import com.example.advancerecyclerview.utils.Constant;

public class TimeLineItem {
    private HeaderTextItem headerTextItem;
    private PostVideoItem postVideoItem;
    private PostTextItem postTextItem;
    private int viewType;

    public TimeLineItem(HeaderTextItem headerTextItem) {
        this.headerTextItem = headerTextItem;
        viewType = Constant.ITEM_HEADER_TEXT_VIEWTYPE;
    }

    public TimeLineItem(PostVideoItem postVideoItem) {
        this.postVideoItem = postVideoItem;
        viewType = Constant.ITEM_POST_VIDEO_VIEWTYPE;
    }

    public TimeLineItem(PostTextItem postTextItem) {
        this.postTextItem = postTextItem;
        viewType = Constant.ITEM_POST_TEXT_VIEWTYPE;
    }

    public HeaderTextItem getHeaderTextItem() {
        return headerTextItem;
    }

    public void setHeaderTextItem(HeaderTextItem headerTextItem) {
        this.headerTextItem = headerTextItem;
    }

    public PostVideoItem getPostVideoItem() {
        return postVideoItem;
    }

    public void setPostVideoItem(PostVideoItem postVideoItem) {
        this.postVideoItem = postVideoItem;
    }

    public PostTextItem getPostTextItem() {
        return postTextItem;
    }

    public void setPostTextItem(PostTextItem postTextItem) {
        this.postTextItem = postTextItem;
    }

    public int getViewType() {
        return viewType;
    }

    public void setViewType(int viewType) {
        this.viewType = viewType;
    }
}
