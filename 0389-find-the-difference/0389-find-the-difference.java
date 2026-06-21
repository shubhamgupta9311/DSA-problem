class Solution {
    public char findTheDifference(String s, String t) {
//         String st=s+t;
// int  ans=0;
// for(int i=0;i<st.length();i++){

//     ans^=st.charAt(i);
// }

// return (char)ans;

int ans=0;
for(int i=0;i<s.length();i++){
ans^=s.charAt(i);
}
for(int i=0;i<t.length();i++){
ans^=t.charAt(i);
}

return (char)ans;
    }
}
