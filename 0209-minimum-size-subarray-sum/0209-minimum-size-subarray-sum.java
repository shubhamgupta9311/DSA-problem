class Solution {
    public int minSubArrayLen(int target, int[] nums) {
     int n=nums.length;
     int sum=0;
     int left=0;
     int right=0;
     int min=Integer.MAX_VALUE;

     while(right<n){
    sum+=nums[right];
while(sum>=target){
 min=Math.min(min,right-left+1);
 sum-=nums[left];
 left++;
}
right++;

     }
 if(min==Integer.MAX_VALUE){
        return 0;
     }
 

     return min;










  //brute force

//         for(int i=0;i<n;i++){

//   int sum=0;
//             for(int j=i;j<n;j++){
//                sum+=nums[j]; 
// if(sum>=target){
//     minLength=Math.min(minLength,j-i+1 );
//     break;
// }
//             }

//             if(minLength==1 ||minLength==Integer.MAX_VALUE){
//                 break;
//             }
//         }

//         if(minLength==Integer.MAX_VALUE){
//             return 0;
//         }

        // return minLength;

    }
}