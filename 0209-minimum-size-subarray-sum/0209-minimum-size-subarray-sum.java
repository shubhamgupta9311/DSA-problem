class Solution {
    public int minSubArrayLen(int target, int[] nums) {
      int n = nums.length;
        int minLength = Integer.MAX_VALUE;

        int left = 0;
        int right = 0;
        int sum = 0;

        while (right < n) {

            // Expand
            sum += nums[right];
            right++;

            // Shrink while condition is satisfied
            while (sum >= target) {

                minLength = Math.min(minLength, right - left);

                sum -= nums[left];
                left++;
            }
        }

        if (minLength == Integer.MAX_VALUE) {
            return 0;
        }

        return minLength;










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