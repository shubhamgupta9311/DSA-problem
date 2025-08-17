class Solution {
    public int trap(int[] height) {
                    int n= height.length;
                    if(n<=2) {   //edge case when only two bar is present 
                        return 0;

                    }
        else{
            //calculating left max boundary
            int leftMax[]=new int[n];//helper array
             leftMax[0]=height[0];
            for(int i=1;i<n;i++){
            leftMax[i]=Math.max(leftMax[i-1],height[i]);

            }
            //calculating right max boundary
            int rightMax[]=new int[n];
             rightMax[n-1]=height[n-1];
                for(int i=n-2;i>=0;i--){
                    rightMax[i]=Math.max(rightMax[i+1],height[i]);
                
                }

                int trappedWater=0;
                for(int i=0;i<n;i++){
                    int waterlevel=Math.min(leftMax[i],rightMax[i]);
                trappedWater+=waterlevel-height[i];
                }


             return trappedWater;
        }
        
    }
}