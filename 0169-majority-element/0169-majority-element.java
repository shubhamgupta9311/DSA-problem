class Solution {
    public int majorityElement(int[] nums) {
        // brute force
        int  count,i,j;

        int n=nums.length;
        for(i=0;i<n;i++){
            count=0;
            for(j=i;j<n;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count>n/2){
                return nums[i];
            }
        }
        return -1;
    }

}