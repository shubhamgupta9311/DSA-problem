class Solution {
    public int shipWithinDays(int[] weights, int days) {
//edge cases
if(weights.length==1){
    return weights[0];
}
        //finding the range of answer
        int low=0;
        int high=0;
        for(int weight:weights){
             low= Math.max(low,weight);
             high+=weight;
        }

        while(low<=high){
            int mid=low+(high-low)/2;   //possible solution
           
           if(ispossible(weights,mid,days)){
            high=mid-1;
           }
            else{
                low=mid+1;
            }
        }
        return low;
    }

public boolean ispossible( int weights[],int k,int days){
 long daycount=1;
      long totalweight=0;
     for(int weight:weights){
             totalweight+=weight;
        if( totalweight>k){
             totalweight=weight;
     daycount++;
        }
     }
  return daycount<=days;
}

}