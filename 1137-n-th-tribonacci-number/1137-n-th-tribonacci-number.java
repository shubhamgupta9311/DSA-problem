class Solution {
    public int tribonacci(int n) {
        int firstTerm=0;
        int secondTerm=1;
        int thirdTerm=1;
        if(n==0){
            return 0;
        }
        else if(n==1 || n==2){
            return 1;
        }
        else{
         for(int i=1;i<=n;i++){
            int fourthTerm=firstTerm+secondTerm+thirdTerm;
            firstTerm=secondTerm;
            secondTerm=thirdTerm;
            thirdTerm=fourthTerm;}

            return firstTerm;
        }


    }
}