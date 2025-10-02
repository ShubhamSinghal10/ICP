
// T.C => O(n log n)
// S.C => O(1)

class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        
        
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[1],b[1]));

        int interval = intervals[0][1];

        int ans = 0;

        for(int i = 1; i < intervals.length; i++) {

            if(interval > intervals[i][0]) {
                ans++;
            }
            else {
                interval = intervals[i][1];
            }
        }
        return ans;
    }
}
