class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int l=0;
        int profit=0;
        for(int r=1;r<n;r++ ){
           if(prices[l]<prices[r]){
             profit+=prices[r]-prices[l];

           }
           l++;
        
        }
       return profit;

    }
}