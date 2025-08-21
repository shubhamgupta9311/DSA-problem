class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
         int buyPrice = prices[0];
        int maximumProfit = 0;
        for (int i = 1; i <n; i++) {
            // if (buyPrice < prices[i]) {
            //     int profit = prices[i] - buyPrice;
            //     maximumProfit = Math.max(profit, maximumProfit);
            // } else {
            //     buyPrice = prices[i];
            // }
            maximumProfit=Math.max(maximumProfit,prices[i]-buyPrice);
            buyPrice=Math.min(buyPrice,prices[i]);

        }
        return maximumProfit;
        
    }
}