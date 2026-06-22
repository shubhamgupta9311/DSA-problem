class Solution { 
    public int removeDuplicates(int[] nums) {

//doing on 22/6/26
 int lp=0;
 int rp;
 for(rp=0;rp<nums.length;rp++){
    if(nums[lp]!=nums[rp]){
        lp++;
        nums[lp]=nums[rp];
    }

 }

 return lp+1;


    }
}