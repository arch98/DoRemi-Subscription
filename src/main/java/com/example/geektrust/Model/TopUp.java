package com.example.geektrust.Model;

import com.example.geektrust.Entities.TopUpPlan;

public class TopUp {

    private TopUpPlan topUpPlan;
    private int num_of_devices;

    public TopUp(){
        this.topUpPlan = TopUpPlan.NONE;
        this.num_of_devices = 1;
    }

    public TopUpPlan getTopUpPlan() {
        return topUpPlan;
    }

    public void setTopUpPlan(TopUpPlan topUpPlan) {
        this.topUpPlan = topUpPlan;
    }

    public int getNum_of_devices() {
        return num_of_devices;
    }

    public void setNum_of_devices(int num_of_devices) {
        this.num_of_devices = num_of_devices;
    }
}
