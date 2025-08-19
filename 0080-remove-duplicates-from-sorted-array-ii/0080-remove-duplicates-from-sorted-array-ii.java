class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
      if(n<3){
        return n;
      }
    int In=2;
    for(int i=2;i<n;i++){
    // if(nums[i]==nums[In-2]){
    //     //nothing to do means skip it
    // }
     if(nums[i]!=nums[In-2]){
        nums[In++]=nums[i];
     }
    }


   return In;


    }
}