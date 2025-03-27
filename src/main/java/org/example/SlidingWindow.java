package org.example;

public class SlidingWindow {
    public static int maxProfit(int[] prices){
        int maxProfit =0;
        int minBuy = prices[0];
        for(int i= 1; i < prices.length; i++){
            if(prices[i] < minBuy){
                minBuy = prices[i];
            }else{
                int currentProfit = prices[i] - minBuy;
                maxProfit = Math.max(maxProfit, currentProfit);
            }
        }
        return maxProfit;
    }
}
