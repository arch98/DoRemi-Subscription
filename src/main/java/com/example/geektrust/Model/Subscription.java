package com.example.geektrust.Model;

import com.example.geektrust.Entities.TopUpPlan;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Subscription {

    private Map<String,Plan> planMap;
    private LocalDate startDate;


    public Subscription(LocalDate startDate){
        this.startDate = startDate;
        this.planMap = new HashMap<>();
    }



    public Map<String, Plan> getPlanMap() {
        return planMap;
    }

    public LocalDate getStartDate() {
        return startDate;
    }



    public void setPlanMap(Map<String, Plan> planMap) {
        this.planMap = planMap;
    }

}
