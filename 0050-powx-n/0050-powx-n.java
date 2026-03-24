class Solution {
    public double myPow(double x, int n) {
        //1.method-done my me brute force but iT GIVES TLE as n is very big here
//         double prod = 1;

//         //when n is negative
//         if (n < 0) {
//             for (int j = 0; j > n; j--) {
//                 prod = prod * 1 / x;
//             }
// return prod;
//         }
//         //when n is positive
//         for (int i = 0; i < n; i++) {
//             prod = prod * x;
//         }
//         return prod;

//     }
    

//2. using inbult function,but not recommeded in interview although it is optimal

return Math.pow(x,n);



}
}