class Solution {
    public int searchInsert(int[] nums, int target) {
    int n=nums.length;
    int lp=0;
    int rp=n-1;
    while(lp<=rp){
        int mid=lp+(rp-lp)/2;
        if(target==nums[mid]){
            return mid;
        }
         if(target<nums[mid]){
            rp=mid-1;
         }
         else{
            lp=mid+1;
         }
    }

    //in case target is not found
  return lp;


    }
}