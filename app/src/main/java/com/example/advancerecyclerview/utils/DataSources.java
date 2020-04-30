package com.example.advancerecyclerview.utils;

import com.example.advancerecyclerview.R;
import com.example.advancerecyclerview.model.HeaderTextItem;
import com.example.advancerecyclerview.model.PostTextItem;
import com.example.advancerecyclerview.model.PostVideoItem;
import com.example.advancerecyclerview.model.TimeLineItem;

import java.util.ArrayList;
import java.util.List;

public class DataSources {
    public static List<TimeLineItem> getTimelineData() {

        List<TimeLineItem> mdata = new ArrayList<>();
        HeaderTextItem headerTextItem = new HeaderTextItem("This is time line title");
        TimeLineItem headerTimeLineItem = new TimeLineItem(headerTextItem);

        PostTextItem postTextItem = new PostTextItem("We have explained earlier how to implement Android RecyclerView. But in that article, we have explained about a normal RecyclerView means each row has the same UI. That means a RecyclerView with only a single view type. Now in this article, we will implement RecyclerView with multiple view type.We have explained earlier how to implement Android RecyclerView. But in that article, we have explained about a normal RecyclerView means each row has the same UI. That means a RecyclerView with only a single view type. Now in this article, we will implement RecyclerView with multiple view type.", R.drawable.profilepic, "12:93");
        TimeLineItem postTextTimeLineItem = new TimeLineItem(postTextItem);

        PostVideoItem postVideoItem = new PostVideoItem("https://sajon.com", R.drawable.auth_logo, "06:32");
        TimeLineItem postVideoTimeLineItem = new TimeLineItem(postVideoItem);

        HeaderTextItem headerTextItem1 = new HeaderTextItem("This is time line title");
        TimeLineItem headerTimeLineItem1 = new TimeLineItem(headerTextItem);

        PostTextItem postTextItem1 = new PostTextItem("We have explained earlier how to implement Android RecyclerView. But in that article, we have explained about a normal RecyclerView means each row has the same UI. That means a RecyclerView with only a single view type. Now in this article, we will implement RecyclerView with multiple view type.We have explained earlier how to implement Android RecyclerView. But in that article, we have explained about a normal RecyclerView means each row has the same UI. That means a RecyclerView with only a single view type. Now in this article, we will implement RecyclerView with multiple view type.", R.drawable.profilepic, "12:93");
        TimeLineItem postTextTimeLineItem1 = new TimeLineItem(postTextItem);

        PostVideoItem postVideoItem1 = new PostVideoItem("https://sajon.com", R.drawable.auth_logo, "06:32");
        TimeLineItem postVideoTimeLineItem1 = new TimeLineItem(postVideoItem);


        HeaderTextItem headerTextItem2 = new HeaderTextItem("This is time line title");
        TimeLineItem headerTimeLineItem2 = new TimeLineItem(headerTextItem);

        PostTextItem postTextItem2 = new PostTextItem("We have explained earlier how to implement Android RecyclerView. But in that article, we have explained about a normal RecyclerView means each row has the same UI. That means a RecyclerView with only a single view type. Now in this article, we will implement RecyclerView with multiple view type.We have explained earlier how to implement Android RecyclerView. But in that article, we have explained about a normal RecyclerView means each row has the same UI. That means a RecyclerView with only a single view type. Now in this article, we will implement RecyclerView with multiple view type.", R.drawable.profilepic, "12:93");
        TimeLineItem postTextTimeLineItem2 = new TimeLineItem(postTextItem);

        PostVideoItem postVideoItem2 = new PostVideoItem("https://sajon.com", R.drawable.auth_logo, "06:32");
        TimeLineItem postVideoTimeLineItem2 = new TimeLineItem(postVideoItem);



        HeaderTextItem headerTextItem3 = new HeaderTextItem("This is time line title");
        TimeLineItem headerTimeLineItem3 = new TimeLineItem(headerTextItem);

        PostTextItem postTextItem3 = new PostTextItem("We have explained earlier how to implement Android RecyclerView. But in that article, we have explained about a normal RecyclerView means each row has the same UI. That means a RecyclerView with only a single view type. Now in this article, we will implement RecyclerView with multiple view type.We have explained earlier how to implement Android RecyclerView. But in that article, we have explained about a normal RecyclerView means each row has the same UI. That means a RecyclerView with only a single view type. Now in this article, we will implement RecyclerView with multiple view type.", R.drawable.profilepic, "12:93");
        TimeLineItem postTextTimeLineItem3 = new TimeLineItem(postTextItem);

        PostVideoItem postVideoItem3 = new PostVideoItem("https://sajon.com", R.drawable.auth_logo, "06:32");
        TimeLineItem postVideoTimeLineItem3 = new TimeLineItem(postVideoItem);

        mdata.add(headerTimeLineItem);
        mdata.add(postTextTimeLineItem);
        mdata.add(postVideoTimeLineItem);

        mdata.add(headerTimeLineItem1);
        mdata.add(postTextTimeLineItem1);
        mdata.add(postVideoTimeLineItem1);

        mdata.add(headerTimeLineItem2);
        mdata.add(postTextTimeLineItem2);
        mdata.add(postVideoTimeLineItem2);

        mdata.add(headerTimeLineItem3);
        mdata.add(postTextTimeLineItem3);
        mdata.add(postVideoTimeLineItem3);

        return mdata;
    }
}
