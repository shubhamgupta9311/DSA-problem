class Solution {
    public char findTheDifference(String s, String t) {
        String st=s+t;
int  ans=0;
for(int i=0;i<st.length();i++){

    ans^=st.charAt(i);
}

return (char)ans;
    }
}