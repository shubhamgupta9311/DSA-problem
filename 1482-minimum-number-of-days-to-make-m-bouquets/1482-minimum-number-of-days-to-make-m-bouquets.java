class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        if(n<(long)m*k){
            return -1;
        }
        //answer range
        int low=Integer.MAX_VALUE;
        int high=0;
        for(int day:bloomDay){
            low=Math.min(low,day);
            high=Math.max(high,day);
        }

while(low<=high){

    int mid=low+(high-low)/2;

if(ispossible(bloomDay,mid,m,k)){
    high=mid-1;
}
else{
    low=mid+1;
}
}
 return low;

    }

    public boolean ispossible(int bloomDay[],int mid,int m,int k){

      long count=0;
       long bou=0;
       for(int day:bloomDay){
        if(mid>=day){
            count++;
              if(count==k){
            bou++;
            count=0;
         }
        }
       
        else{
             count=0;
        }
       }
  return bou>=m;
    }
}