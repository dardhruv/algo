package com.dhruv.goldmannsacha;


public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
        int[] arr = new int[]{7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }
// there are 2 conditions in this problem.First that stock price at current index is less than minimum buyer price so we make
// buyer price as the current price
// else currentPrice would be more than minPrice so we will get some profit and hence we can compare if by seeling ar current
// price would our profit be more if yes then we change the maximumProfit
    public static int maxProfit(int[] prices){
        int minBuyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0; i<prices.length; i++){
            if(prices[i] < minBuyPrice){
                minBuyPrice = prices[i];
            }else if (prices[i] - minBuyPrice > maxProfit){
                maxProfit = prices[i] - minBuyPrice;
            }
        }
        return maxProfit;
    }
}
