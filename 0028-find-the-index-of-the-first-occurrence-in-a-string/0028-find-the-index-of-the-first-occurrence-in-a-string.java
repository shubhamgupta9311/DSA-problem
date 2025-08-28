class Solution {
    public int strStr(String haystack, String needle) {
        int l = 0;
        int n = haystack.length();
        for (int r = 0; r < n; r++) {

            if (haystack.charAt(r) == needle.charAt(l)) {
                l++;
                if (l == needle.length()) {
                    return r - l + 1;
                }
            } else {
                r = r - l;
                l = 0;

            }

        }
        return -1;

    }
}