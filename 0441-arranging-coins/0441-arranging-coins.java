class Solution {

    //brute force
    public int arrangeCoins(int n) {
  
  if(n==1){
    return 1;
  }

        long sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
            if(sum>n){
              return (i-1);
            }
     
        }
         return -1;
    }
   
}