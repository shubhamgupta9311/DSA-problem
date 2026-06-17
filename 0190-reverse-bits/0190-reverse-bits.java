class Solution {
    public int reverseBits(int n) {
        int  revbit=0;
  for(int i=0 ;i<32;i++){
   int bit=n&1;
   revbit=(revbit<<1) | bit;
   n=n>>>1;
  }
  return revbit;


        }
       
    }
