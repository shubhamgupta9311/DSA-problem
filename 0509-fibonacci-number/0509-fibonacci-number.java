class Solution {
    public int fib(int n) {
//iteration method 
        if (n < 2) {
            return n;
        }

        else {
            int ft = 0;
            int st = 1;
            int th = 0;
            for (int i = 1; i < n; i++) {
                th = ft + st;
                ft = st;
                st = th;
            }

            return th;

        }

    }

}