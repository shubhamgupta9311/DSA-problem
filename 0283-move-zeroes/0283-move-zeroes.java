class Solution {
    public void moveZeroes(int[] nums) {
        int left=0;//use to set the position of non zero numbers
        int right;//use to iterate over all array element for check it is non zero or zero numbers.
        for(right=0;right<nums.length;right++){
             if(nums[right]!=0){
                int temp=nums[right];      //swapping
                nums[right]=nums[left];
                nums[left]=temp;
                left++;
             }
            //  else{
            //     //skip nothing to do
            //  }
        } 
    
    }
}