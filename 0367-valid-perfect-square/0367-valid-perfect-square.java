class Solution {
    public boolean isPerfectSquare(int num) {
        //corner case
        if (num == 1) {
            return true;
        }

        long lp = 1;
        long rp = num;
        while (lp <= rp) {
             long mid = lp + (rp - lp) / 2;
            if (mid * mid == num) {
                return true;
            }

            if (mid * mid > num) {
                rp = mid - 1;
            } else {
                lp = mid + 1;
            }
        }
        return false;
    }
}