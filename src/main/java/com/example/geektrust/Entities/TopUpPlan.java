package com.example.geektrust.Entities;

public enum TopUpPlan {

    NONE(1,0,1),
    FOUR_DEVICE(4,50,1),
    TEN_DEVICE(10,100,1);

    private final int max_device;
    private final int amount;
    private final int month;

    TopUpPlan(int max_device,int amount,int month){
        this.max_device = max_device;
        this.amount =amount;
        this.month = month;
    }

    public int getMonth() {
        return month;
    }

    public int getAmount() {
        return amount;
    }

    public int getMax_device() {
        return max_device;
    }
}
