class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
         int bestSum=nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length-2;i++){
            int currSum=0;
            int lp=i+1;
            int rp=nums.length-1;
            
            while(lp<rp){
                 currSum=nums[i]+nums[lp]+nums[rp];
                 if(currSum==target){
                    return target;
                 }
                 else if(currSum>target){
                    rp--;
                 }
                 else{
                    lp++;
                 } 
                 
          if(Math.abs(target-currSum)<Math.abs(target-bestSum)){

            bestSum=currSum;
          }

            }
          
                                 


        }

        return bestSum;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
    }
}