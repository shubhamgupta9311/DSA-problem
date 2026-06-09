class Solution {
    public int removePalindromeSub(String s) {
        // StringBuilder sb=new StringBuilder(s);
//1.tc-O(N) AND SC-O(n)
        //case when comlete string is palindrome
    //     if(sb.reverse().toString().equals(s)){
    //         return 1;
    //     }

    // else{
    //     return 2;
    // }


//2.

int lp=0;
int rp=s.length()-1;
//taking oppostie now means logic for when string are not palidrome as here we have to check less as if one charter miss in equivakence means not a plaindrome string and we return hwere 2 and in other case we will retirn
while(lp<rp){
    if(s.charAt(lp)!=s.charAt(rp)){
return 2;

    }
    lp++;
    rp--;
}

return 1;
    }
}