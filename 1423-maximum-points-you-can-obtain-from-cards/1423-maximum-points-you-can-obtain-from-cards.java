class Solution {
    public int maxScore(int[] cardPoints, int k) {
int n=cardPoints.length;
//total sum
int ts=0;
for(int i=0;i<n;i++){
ts+=cardPoints[i];
}
 

 //sum of first subarray of n-k
 int Sum=0;
 for(int i=0;i<n-k;i++){
   Sum+=cardPoints[i];
 }
int minSum=Sum;
for(int i=n-k;i<n;i++){
Sum=Sum+cardPoints[i]-cardPoints[i-n+k];
minSum=Math.min(minSum,Sum);
}
   return (ts-minSum);

}
}