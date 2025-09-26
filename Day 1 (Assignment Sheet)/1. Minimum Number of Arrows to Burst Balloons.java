// T.C = O(NLogN)
// S.C = O(1)

class Solution {
    public int findMinArrowShots(int[][] points) {
        
        Arrays.sort(points, (x, y) -> Integer.compare(x[1],y[1]));

        int arrow = 1;
        int end = points[0][1];
        for(int i = 0; i < points.length; i++) {
            
            int start = points[i][0];
            if(start <= end) {
                
            }
            else {
                end = points[i][1];
                arrow++;
            }
        }
        return arrow;
    }
}
