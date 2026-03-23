class Solution {
    public double myPow(double x, int n) {
        double prod = 1;
        //when n is negative
        if (n < 0) {
            for (int j = 0; j > n; j--) {
                prod = prod * 1 / x;
            }
return prod;
        }
        //when n is positive
        for (int i = 0; i < n; i++) {
            prod = prod * x;
        }
        return prod;

    }
    
}