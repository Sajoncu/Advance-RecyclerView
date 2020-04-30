package com.example.advancerecyclerview.model;

public class PostVideoItem {
    private String viewURL;
    private int userImg;
    private String time;

    public PostVideoItem(String viewURL, int userImg, String time) {
        this.viewURL = viewURL;
        this.userImg = userImg;
        this.time = time;
    }

    public String getViewURL() {
        return viewURL;
    }

    public void setViewURL(String viewURL) {
        this.viewURL = viewURL;
    }

    public int getUserImg() {
        return userImg;
    }

    public void setUserImg(int userImg) {
        this.userImg = userImg;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
