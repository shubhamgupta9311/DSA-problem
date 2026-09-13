class Solution {
    public int findLengthOfLCIS(int[] nums) {
        
if(nums.length==1){
    return 1;
}
int lp=0;
int rp=1;
int tp=0;
int lgth=0;
while(rp<nums.length){

if(nums[lp]>=nums[rp]){
lgth=Math.max(lgth,rp-tp);
tp=rp;
}

lp++;
rp++;
}

lgth=Math.max(lgth,rp-tp);

return lgth;
       
    }
}