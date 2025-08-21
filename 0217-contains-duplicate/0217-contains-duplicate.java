class Solution {
    public boolean containsDuplicate(int[] nums) {
    int n=nums.length;
    int si=0;
    int ci=n;
    Arrays.sort(nums,si,ci);
    int l=0;
    for(int r=1;r<n;r++){
         if(nums[l]==nums[r]){
            return true;
         }
       l++;
    }
   return false;
        
    }
}