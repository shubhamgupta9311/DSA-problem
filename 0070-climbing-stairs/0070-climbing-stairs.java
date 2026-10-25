class Solution {

    public int helper(int n, int dp[]) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }

        if (dp[n] != 0) {
            return dp[n];
        }

        dp[n] = helper(n - 1, dp) + helper(n - 2, dp);
        return dp[n];

    }

    public int climbStairs(int n) {
        //recursion
        // if (n == 0) {
        //     return 1;
        // }
        // if (n < 0) {
        //     return 0;
        // }
        // int ways = climbStairs(n - 1) + climbStairs(n - 2);
        // return ways;

int dp[]=new int [n+1];
 return helper(n,dp);

    }

}