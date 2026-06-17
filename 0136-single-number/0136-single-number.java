class Solution {
    //brute force
    
    public int singleNumber(int[] nums) {
        // int n=nums.length;
        // int count=0;
        // for(int i=0;i<n;i++){
        //     count=0;
        //     for(int j=0;j<n;j++){
        //         if(nums[i]==nums[j]){
        //             count++;
        //         }
        //     }
        //     if(count==1){
        //         return nums[i];
        //     }
        // }
        // return -1;




//again visiting 2026
//trying first brute force
// int n=nums.length;
// for(int i=0;i<n;i++){
//      int count=0;
//      for(int j=0;j<n;j++){
//         if(nums[i]==nums[j]){
//             count++;
//         }
//      }
//         if(count==1){
//             return nums[i];
//         }
// }

// return -1;


//optimization
//xor gate(bit manipulation)
int ans=0;
for(int num:nums){
    ans^=num;
}

return ans;










    }
}