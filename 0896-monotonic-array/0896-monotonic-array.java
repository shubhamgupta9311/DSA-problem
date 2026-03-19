class Solution {
    public boolean isMonotonic(int[] nums) {
      boolean inc=true;
      boolean dec=true;
int n=nums.length;
    
    for(int i=0;i<n-1;i++){
        //dec case
        if(nums[i]>nums[i+1]){
          inc=false;
        }
        //inc case
        if(nums[i]<nums[i+1]){
          dec=false;
        }
    }
    //we use two if instead of else beacuse when we have element and all are same then seconf one executa means iind case bcomes true but we dont want it as when we have same element both case will true and also there is no effect on them and same elements one are always monotonic 
      return inc || dec;
    }
}