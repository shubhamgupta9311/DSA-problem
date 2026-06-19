class Solution {
    public int findComplement(int num) {
        int ans=0;
           int iter=0;
      while(num>0){
      //taking last bit
        int bit=num&1;
        //xor that give complement of a bit
        int xor=(bit^1);
ans=ans|(xor<<iter);
num=num>>1;
iter++;
      }
  return ans;
    }
}