package com.example.geektrust.Model;

import com.example.geektrust.Entities.Music;

public class Plan {
    public final String plan_type;
    public final int renewal;
    public final int amount;

    public Plan(String plan_type,int renewal,int amount){
        this.plan_type = plan_type;
        this.renewal = renewal;
        this.amount = amount;
    }

    public String getPlan_type() {
        return plan_type;
    }

    public int getAmount() {
        return amount;
    }

    public int getRenewal() {
        return renewal;
    }
}
