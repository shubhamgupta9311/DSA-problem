class Solution {
    public int findMin(int[] nums) {
        //brute force
        int n = nums.length;
        //some corner cases
        if (n == 1) {
            return nums[0];
        }
        for (int i = 0; i < n - 1; i++) {
            if (!(nums[i] < nums[i + 1])) {
                return nums[i + 1];
            }

        }
        return nums[0];
    }
}