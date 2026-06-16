class Solution {
    public int hammingWeight(int n) {
        int count=0;
       
      while(n>0){
         int bitMask=(n & 1);
        if(bitMask!=0){
            count++;
        }
      n= n >> 1 ;
      }        
return count;
    }
}