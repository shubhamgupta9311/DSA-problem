class Solution {
    public int reverse(int x) {
  int sign=(x<0)? -1:1;
  x=Math.abs(x);
  long rev=0;
  while(x>0){
rev=rev*10 +x%10;
x=x/10;

  }
  long res=rev*sign;

  if(res<Integer.MIN_VALUE ||res>Integer.MAX_VALUE){
    return 0;
  }
  return (int)res;
        
    }
}