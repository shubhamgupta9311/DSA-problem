class Solution {
    public int findUnsortedSubarray(int[] nums) {

if(nums.length==1){
    return 0;
}
int fbk=-1;
int lbk=-1;
int min=Integer.MAX_VALUE;
int max=Integer.MIN_VALUE;
//first break point
 for(int i=0;i<nums.length-1;i++){
if(nums[i]>nums[i+1]){
   fbk=i;
   break;
}
 }
 if(fbk==-1){
    return 0;
 }



 //last break point
  for(int i=nums.length-1;i>0;i--){
if(nums[i]<nums[i-1] ){
   lbk=i;
 
   break;
}
 }
 
 for(int i=fbk; i<=lbk;i++){
    min=Math.min(min,nums[i]);
    max=Math.max(max,nums[i]);
 } 

 //left expansion
 while(fbk>0 && nums[fbk-1]>min){
    fbk--;
 }
 //right expansion
 while(lbk<nums.length-1 && nums[lbk+1]<max){
    lbk++;
 }

  return (lbk-fbk)+1;

    }
}