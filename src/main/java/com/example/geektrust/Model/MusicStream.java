package com.example.geektrust.Model;

import com.example.geektrust.Entities.Music;

public class MusicStream extends Plan{

    public MusicStream(String plan_type){
        super(plan_type,Music.valueOf(plan_type).getMonth(),Music.valueOf(plan_type).getFee());
    }
}
