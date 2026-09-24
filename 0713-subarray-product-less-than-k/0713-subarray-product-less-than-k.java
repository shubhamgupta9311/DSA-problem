class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        //brute force-two loops takes n^2 times
// int count=0;

// for(int i=0;i<nums.length;i++){

// long prod=1;

// for(int j=i;j<nums.length;j++){
//    prod*=nums[j];
//    if(prod>=k){
//     break;
//    }
//    count++; 
// }


// }
        

// return count;

////optimize -sliding window-remove recomputation
int left=0;
int right=0;
long prod=1;
int count=0;
//edge case handle
if(k<=1) return 0;
while(right<nums.length){
prod*=nums[right];
while(prod>=k){
prod/=nums[left];
left++;
}

count+=right-left+1;
right++;



}

return count;
    }
}