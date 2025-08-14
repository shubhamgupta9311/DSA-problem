class Solution { //here we have to return only k ,judge can auto read values of new updated array
    //* we dont have to store underscore also as judge autmatically see it 
    //instruction-It does not matter what you leave beyond the returned k (hence they are underscores).
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int l = 0; //left index
        int r; //right index
        for (r = 1; r < n; r++) {
            //  if(nums[l]==nums[r]){    //no requirement
            //       nums[r]=
            //  } 
            if (nums[l] != nums[r]) {
                l++;
                if (l != r) {
                    int temp = nums[r];
                    nums[r] = nums[l];
                    nums[l] = temp;
                }

            }

        }
        return l + 1;
    }
}
