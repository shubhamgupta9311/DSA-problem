class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        //sum of first n natural number
        int sum=(n+1)*n/2;
        int arrsum=0;
        for(int i=0;i<n;i++){
arrsum+=nums[i];
        }
        if(sum==arrsum){
            return 0;
        }
        return (sum-arrsum);
        
        
    }
}