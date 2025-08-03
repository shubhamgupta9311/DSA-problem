class Solution {
    public int[] searchRange(int[] nums, int target) {

        int[] arr = new int[2];
        arr[0] = arr[1] = -1; //if e=we dont find that target in array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                arr[0] = i;
                while (i+1 < nums.length && nums[i + 1] == target) {
                    i++;
                   
                   
                }
                  arr[1] = i;
            
            }

        }
        return arr;

    }
}