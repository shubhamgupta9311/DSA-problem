class Solution {

    //memoziation

    public int fib1(int n, int dp[]) {
        //base case
        if (n == 0 || n == 1) {
            return n;
        }

        if (dp[n] != 0) {
            return dp[n];
        }
        dp[n] = fib1(n - 1, dp) + fib1(n - 2, dp);
        return dp[n];

    }

    public int  fib(int n) {

        //iteration method 
        //     if (n < 2) {
        //         return n;
        //     }

        //     else {
        //         int ft = 0;
        //         int st = 1;
        //         int th = 0;
        //         for (int i = 1; i < n; i++) {
        //             th = ft + st;
        //             ft = st;
        //             st = th;
        //         }

        //         return th;

        //     }

        // }

        //recursive method
        //base case
        // if(n==0 ||n==1){
        //     return n;
        // }
        // int fn=fib(n-1)+fib(n-2);

        // return fn

        int dp[] = new int[n + 1];// intially it will automaticalyy intialize with 0
       return fib1(n, dp);

    }
}