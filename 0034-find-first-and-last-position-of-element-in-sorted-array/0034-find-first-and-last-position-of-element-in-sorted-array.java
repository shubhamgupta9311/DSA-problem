class Solution {
    public int[] searchRange(int[] nums, int target) {

        if(nums.length==0){
            return new int[]{-1,-1};
        }
        int low = 0;
        int high = nums.length - 1;
        return new int[]{Fo(nums,target,low,high),Lo(nums,target,low,high)};

    }

    public int Fo(int nums[], int target, int low, int high ) {

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] >= target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
         if(low>nums.length-1){
            low--;
         }
        if (nums[low] == target) {
            return low;
        }
        return -1;

    }

    public int Lo(int nums[], int target, int low, int high) {

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] <= target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }

         if(high<0){
            high=0;
         }

        if (nums[high] == target) {
            return high;
        }
        return -1;
    }
}