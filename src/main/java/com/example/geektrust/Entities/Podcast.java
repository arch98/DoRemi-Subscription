package com.example.geektrust.Entities;

public enum Podcast {
    FREE(0,1),
    PERSONAL(100,1),
    PREMIUM(300,3);

    private final int fee;
    private final int month;

    Podcast(int fee, int month){
        this.fee = fee;
        this.month = month;
    }

    public int getFee() {
        return fee;
    }

    public int getMonth() {
        return month;
    }
}
