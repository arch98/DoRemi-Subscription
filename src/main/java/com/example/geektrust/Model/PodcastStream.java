package com.example.geektrust.Model;

import com.example.geektrust.Entities.Podcast;

public class PodcastStream extends Plan{
    public PodcastStream(String plan_type){
        super(plan_type, Podcast.valueOf(plan_type).getMonth(),Podcast.valueOf(plan_type).getFee());
    }
}
