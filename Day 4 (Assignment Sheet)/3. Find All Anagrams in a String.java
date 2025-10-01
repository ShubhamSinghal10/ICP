
// Optimization

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        List<Integer> list = new ArrayList<>();

        int m = p.length();
        
        int n = s.length();

        if(m > n) return list;

        int map1[] = new int[26];
        int map2[] = new int[26];

        for(int i = 0; i < m; i++) {
            map1[p.charAt(i)-'a']++;
            map2[s.charAt(i)-'a']++;
        }

        if(isMatch(map1,map2)) list.add(0);

        for(int i = 1; i <= n-m; i++) {
            
            map2[s.charAt(i-1)-'a']--;
            map2[s.charAt(i+m-1)-'a']++;

            if(isMatch(map1,map2)) {
                list.add(i);
            }
        }
        return list;
    }

    public boolean isMatch(int[] map1, int[] map2) {

        for(int i = 0; i < 26; i++) {
            if(map1[i] != map2[i]) return false;
        }
        return true;
    }
}


// Brute force

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        int m = p.length();
        
        int n = s.length();

        int map1[] = new int[26];

        for(int i = 0; i < m; i++) {
            map1[p.charAt(i)-'a']++;
        }

        List<Integer> list = new ArrayList<>();

        int index = -1;
        for(int i = 0; i <= n-m; i++) {
            int[] map2 = new int[26];

            for(int j = i; j < i+m; j++) {

                map2[s.charAt(j)-'a']++;
            }
            index++;

            if(isMatch(map1,map2)) {
                list.add(index);
            }
        }
        return list;
    }

    public boolean isMatch(int[] map1, int[] map2) {

        for(int i = 0; i < 26; i++) {
            if(map1[i] != map2[i]) return false;
        }
        return true;
    }
}
