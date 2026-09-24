class Solution {
    public int pivotIndex(int[] nums) {
        int Totalsum=0;
        for(int num:nums){
            Totalsum+=num;
        }

        int left=0;

    for(int i=0;i<nums.length;i++){
  int  right=Totalsum-left-nums[i];

if(left==right){
    return i;
}


left+=nums[i];
    }



    return -1;



    }
}