class Solution {     //not may be optimized
    public int fib(int n) {
        int firstTerm=0;
        int secondTerm=1;
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
              for(int i=1;i<=n;i++){
            
                int thirdTerm=firstTerm+secondTerm;
                firstTerm=secondTerm;
                secondTerm=thirdTerm;
              }
              return firstTerm;
        }

    }
}