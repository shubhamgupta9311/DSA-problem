class Solution {
    public int[] twoSum(int[] numbers, int target) {
    //     int n =numbers.length;
    //     int lp=0;
    //     int rp=n-1;
    //     while(lp<rp){
    //         int currsum=numbers[lp]+numbers[rp];
    //         if(currsum==target){
    //             return new int[]{lp+1,rp+1};
    //         }

    //         if(currsum>target){
    //             rp--;
    //         }
    //         else{
    //             lp++;
    //         }
    //     }
    //     return new int[]{-1,-1};


















    //doing on 24/6/2026
    int n=numbers.length;
    int left=0;
    int right=n-1;

    while(left<right){
   int sum=numbers[left]+numbers[right];

   if(sum==target){
    return new int[]{left+1,right+1};
   }

   else if(sum>target){
    right--;
   }

   else{
    left++;
   }

    }


return new int[]{-1,-1};

    }
}