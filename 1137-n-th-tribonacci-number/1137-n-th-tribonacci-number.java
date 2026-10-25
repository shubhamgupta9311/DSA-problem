class Solution {
    // public int helper(int n, int dp[]) {
    //     if (n == 0 || n == 1) {
    //         return n;
    //     }

    //     if (n == 2) {
    //         return 1;
    //     }

    //     if (dp[n] != 0) {
    //         return dp[n];
    //     }

    //     dp[n] = helper(n - 1, dp) + helper(n - 2, dp) + helper(n - 3, dp);

    //     return dp[n];

    // }

    public int tribonacci(int n) {
        //simple if else and loop easy no need to write btes that better here

        //recursion+memoziation
        // int dp[] = new int[n + 1];
        // return helper(n, dp);


//tabulation
int dp[]=new int[n+1];
if(n==0){
    return 0;
}

if(n==1){
    return 1;
}
dp[1]=dp[2]=1;


for(int i=3;i<=n;i++){
    dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
}

return dp[n];
        
    }
}