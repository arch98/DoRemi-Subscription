package com.example.geektrust;

import com.example.geektrust.Entities.TopUpPlan;
import com.example.geektrust.Model.*;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;
import java.util.Map;

public class SubscriptionManager {

    private Subscription subscription;
    private TopUp topUp;

    public SubscriptionManager(){
        this.subscription = null;
        this.topUp = new TopUp();
    }


    public void start_subscription(String date){
        String [] dat = date.split("-",3);
        LocalDate localDate = null;

       try {

            localDate = LocalDate.of(Integer.parseInt(dat[2]), Integer.parseInt(dat[1]), Integer.parseInt(dat[0]));
       }catch(DateTimeException ex){
           System.out.println("INVALID_DATE");
           return;
       }
        this.subscription = new Subscription(localDate);
    }

    public void add_subscription(String stream,String planType){
        if(this.subscription == null){
            System.out.println("ADD_SUBSCRIPTION_FAILED INVALID_DATE");
            return;
        }

        if(this.subscription.getPlanMap().containsKey(stream)){
            System.out.println("ADD_SUBSCRIPTION_FAILED DUPLICATE_CATEGORY");
            return;
        }
        Plan plan = null;
        switch (stream){
            case "MUSIC":
                plan = new MusicStream(planType);
                break;
            case "PODCAST":
                plan = new PodcastStream(planType);
                break;
            case "VIDEO":
                plan = new VideoStream(planType);
                break;
            default:
                break;
        }

        if(plan == null){
            return;
        }

        Map<String,Plan> planMap = this.subscription.getPlanMap();
        planMap.put(stream,plan);
        this.subscription.setPlanMap(planMap);
    }

    public void add_topup(String name,int devices){
        if(this.subscription == null){
            System.out.println("ADD_TOPUP_FAILED INVALID_DATE");
            return;
        }

        if(this.subscription.getPlanMap().isEmpty()){
            System.out.println("ADD_TOPUP_FAILED SUBSCRIPTIONS_NOT_FOUND\n" +
                    "SUBSCRIPTIONS_NOT_FOUND");
            return;
        }

        if(!this.topUp.getTopUpPlan().name().equals("NONE")){
            System.out.println("ADD_TOPUP_FAILED DUPLICATE_TOPUP");
            return;
        }

        this.topUp.setTopUpPlan(TopUpPlan.valueOf(name));
        this.topUp.setNum_of_devices(devices);
    }

    public void print_details(){
        if(this.subscription == null){
            System.out.println("SUBSCRIPTIONS_NOT_FOUND");
            return;
        }

        int sum = 0;

        for(Map.Entry<String,Plan> planEntry : this.subscription.getPlanMap().entrySet()){
            int month = planEntry.getValue().getRenewal();
            LocalDate renewal = this.subscription.getStartDate().plusMonths(month).minusDays(10);
            DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            String data = renewal.format(pattern);
            System.out.println("RENEWAL_REMINDER "+planEntry.getKey()+" "+data);
            sum += planEntry.getValue().getAmount();
        }

        sum += (this.topUp.getNum_of_devices()*this.topUp.getTopUpPlan().getAmount());
        System.out.println("RENEWAL_AMOUNT "+sum);
    }

}
