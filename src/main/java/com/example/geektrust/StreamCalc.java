package com.example.geektrust;

public class StreamCalc {

    private SubscriptionManager subscriptionManager;

    public  StreamCalc(){
        this.subscriptionManager = new SubscriptionManager();
    }
    public void run(String[] input){

        switch (input[0]) {
            case "START_SUBSCRIPTION":
                this.subscriptionManager.start_subscription(input[1]);
                break;
            case "ADD_SUBSCRIPTION":
                String[] inp = input[1].split(" ",2);
                this.subscriptionManager.add_subscription(inp[0],inp[1]);
                break;
            case "ADD_TOPUP":
                String [] inpl = input[1].split(" ",2);
                this.subscriptionManager.add_topup(inpl[0],Integer.parseInt(inpl[1]));
                break;
            case "PRINT_RENEWAL_DETAILS":
                this.subscriptionManager.print_details();
                break;
            default:
                break;
        }
    }
}
