class Solution { //resolved -8 march 2026
    public int maxArea(int[] height) {
        int n=height.length;
        int maxwater=0;
        int lp=0;
        int rp=n-1;
        while(lp<rp){
            int currwater=Math.min(height[lp],height[rp])*(rp-lp);
            maxwater=Math.max(maxwater,currwater);
            if(height[lp]>height[rp]){
                rp--;
            }
            else{
                lp++;
            }
        }

return maxwater;

    }
}