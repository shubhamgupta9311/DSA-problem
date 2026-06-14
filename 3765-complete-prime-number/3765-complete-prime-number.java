class Solution {
    public boolean completePrime(int num) {
        
      String s=String.valueOf(num);
      //prefix
      for(int i=1;i<=s.length();i++){
     String prefix=s.substring(0,i);
     int n=Integer.parseInt(prefix);
//writing individual case for if num==1 blc below loop will not run if num==1
     if(n==1){
        return false;
     }
        for(int j=2;j<n;j++){
            if (n==1){
                return false;
            }
            if(n%j==0){
                return false;
            }
        }

      }
//suffix
for(int i=0;i<s.length();i++){
    String suffix=s.substring(i);
    int n=Integer.parseInt(suffix);
    if(n==1){
        return false;
    }

   for(int j=2;j<n;j++){
            if (n==1){
                return false;
            }
            if(n%j==0){
                return false;
            }
        }
   

}

return true;
    }
}