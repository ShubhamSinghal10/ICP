
// Optimization 

class Solution {
    public int characterReplacement(String s, int k) {
        

        int[] freq = new int[26];
        int l = 0;
        int r = 0;
        int maxCount = 0;
        int maxLen = 0;

        while(r < s.length()) {

            char c = s.charAt(r);
            freq[c-'A']++;

            maxCount = Math.max(maxCount, freq[c-'A']);

            while( (r-l+1)-maxCount > k) {
                freq[s.charAt(l)-'A']--;
                l++;
            }
            maxLen = Math.max(maxLen,r-l+1);
            r++;
        }
        return maxLen;
    }
}
