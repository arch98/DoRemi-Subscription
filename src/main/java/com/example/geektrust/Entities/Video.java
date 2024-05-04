package com.example.geektrust.Entities;

public enum Video {
    FREE(0,1),
    PERSONAL(200,1),
    PREMIUM(500,3);

    private final int fee;
    private final int month;

   Video(int fee, int month){
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
