class Solution {
    public int[] countBits(int n) {
        
        int arr[]=new int[n+1];
        for(int i=0;i<=n;i++){
            int count=0;
            int N=i;
            while(N>0){
              if((N&1)==1){
                count++;
              }
              N=N>>1;
            }
              arr[i]=count;

        }
        return arr;
    }
}