package com.awesome.dsa.array;

public class BuySellStock {

    public int maxProfit(int[] prices) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
            }
            int potentialProfit = prices[i] - min;
            if(potentialProfit > max){
                max = potentialProfit;
            }
        }
        return max;
    }
}
