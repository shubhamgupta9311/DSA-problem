class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        int l=0;
        int k=0;
        for(int r=0;r<n;r++){
            if(nums[r]!=val){
                 nums[l]=nums[r];
               l++;
            k++;
            }
        }
        return k;
    }
}