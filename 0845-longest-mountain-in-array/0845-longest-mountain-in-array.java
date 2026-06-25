class Solution {
    public int longestMountain(int[] arr) {
        int n=arr.length;
        if(n<3){
            return 0;
        }
        int length=Integer.MIN_VALUE;
for(int i=1;i<n-1;i++){
   
    if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
         int count=0;
         int lp=i;
         int rp=i;
            //left expansion
          while(lp>0){
             if(arr[lp]>arr[lp-1]){
                count++;
             }
             else{
                break;
             }
             lp--;
          }
            //right expansion
          while(rp<n-1){
             if(arr[rp]>arr[rp+1]){
                count++;
             }
             else{
                break;
             }
             rp++;
          }
               length=Math.max(length,count+1);
    }
 


}
if(length==Integer.MIN_VALUE){
    return 0;
}

return length;


} 
}