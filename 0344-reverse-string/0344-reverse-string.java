class Solution {
    public void reverseString(char[] s) {

        int l = 0;
        int r = s.length - 1;
        while (l < r) {
            if (s[l] != s[r]) {
                char temp = s[r];
                s[r] = s[l];
                s[l] = temp;
            }
            l++;
            r--;
        }

    }
}