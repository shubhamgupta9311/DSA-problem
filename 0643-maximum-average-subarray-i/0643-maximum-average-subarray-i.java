class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int lp = 0;
        double currSum = 0;

        for (int i = 0; i < k; i++) {
            currSum += nums[i];
        }
        double average = currSum / k;
        double max = average;

        for (int i = k; i < nums.length; i++) {
            currSum = currSum - nums[lp] + nums[i];
            average = currSum / k;
            max = Math.max(max, average);
            lp++;
        }

        return max;
    }
}