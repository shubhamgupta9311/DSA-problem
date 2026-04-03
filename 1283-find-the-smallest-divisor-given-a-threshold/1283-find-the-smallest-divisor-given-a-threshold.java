class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        //1. search range
        int low=1;
        int high=0;
        for(int num:nums){
            high=Math.max(high,num);
        }

        while(low<=high){
            int mid=low+(high-low)/2;
            if(isPossible(nums,mid,threshold)){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }

    public boolean isPossible(int nums[],int mid,int threshold){
         long sum=0;
    for(int num:nums){
        sum+=(num+mid-1)/mid;
    }
    if(sum<=threshold){
        return true;
    }


return false;



    }
}