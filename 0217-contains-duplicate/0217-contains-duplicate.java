class Solution {
    public boolean containsDuplicate(int[] nums) { 
        //using inbulit sort but tc goes O(nlogn)
//     int n=nums.length;
//     int si=0;
//     int ci=n;
//     Arrays.sort(nums,si,ci);
//     int l=0;
//     for(int r=1;r<n;r++){
//          if(nums[l]==nums[r]){
//             return true;
//          }
//        l++;
//     }
//    return false;
        
//     }

//one way of doing using hashset
    
    int n=nums.length;
    HashSet<Integer> set=new HashSet<>();
    for(int num:nums){
        set.add(num);
    }
   return set.size()<n;




    }
}