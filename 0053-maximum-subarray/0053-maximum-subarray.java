class Solution {
    public int maxSubArray(int[] nums) {
        int start, end;
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < nums.length; i++) { //if all numbers are negative
            if (nums[i] < 0) {
                count++;
            }
        }
        if (count == nums.length) {
            for (int i = 0; i < nums.length; i++) {
                ms = Math.max(ms, nums[i]);

            }
            return ms;
        } else {  //for mix numbers
            for (int i = 0; i < nums.length; i++) {

                cs = cs + nums[i];
                if (cs < 0) {
                    cs = 0;
                }
                ms = Math.max(cs, ms);
            }
            return ms;

        }

    }
}