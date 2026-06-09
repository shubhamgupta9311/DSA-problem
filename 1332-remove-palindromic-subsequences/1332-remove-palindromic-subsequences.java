class Solution {
    public int removePalindromeSub(String s) {
        StringBuilder sb=new StringBuilder(s);

        //case when comlete string is palindrome
        if(sb.reverse().toString().equals(s)){
            return 1;
        }

    else{
        return 2;
    }





    }
}