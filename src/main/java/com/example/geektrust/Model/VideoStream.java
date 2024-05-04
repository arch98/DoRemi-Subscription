package com.example.geektrust.Model;

import com.example.geektrust.Entities.Video;

public class VideoStream extends Plan{

    public VideoStream(String plan_type){
        super(plan_type, Video.valueOf(plan_type).getMonth(),Video.valueOf(plan_type).getFee());
    }
}
