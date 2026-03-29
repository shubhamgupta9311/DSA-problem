class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=0;

        //max piles
        for(int pile:piles){
            high=Math.max(high,pile);
        }

        int ans=high;
//till no w we have find our range of answer

        while(low<=high){
            
        int mid=low+(high-low)/2;

    if(ispossible(piles,mid,h)){
        ans=mid;
        high=mid-1;
    }
    else{
        low=mid+1;
    }
        }
        return ans;
    }
    //checking function
public boolean ispossible(int []piles,int k,int h){
     long totalhours=0;

    for(int pile:piles){
    totalhours += pile / k;
if (pile % k != 0) {
    totalhours++;
}
    }
    return totalhours<=h;

}
}

