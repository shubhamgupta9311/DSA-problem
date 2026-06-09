class Solution {
    public boolean isSubsequence(String s, String t) {
        
        //edge case for length 0
if(s.length()==0 ||(s.length()==0 && t.length()==0)){
    return true;
}


int pt=0;
for(int i=0;i<t.length();i++){

    if(s.charAt(pt)==t.charAt(i)){
        pt++;
    }

    if(pt==s.length()){
        return true;
    }
}

return false;

    }
}