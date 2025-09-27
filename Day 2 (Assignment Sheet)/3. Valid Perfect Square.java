// using Binary Search

// t.c = 0ms // Beat = 100%

class Solution {
    public boolean isPerfectSquare(int num) {
        
        if(num < 1) return false;

        long si = 0;
        long ei = (num/2)+1;

        while(si <= ei) {
            
            long mid = si + (ei-si)/2;

            if(mid*mid == num) return true;

            else if((mid*mid) > num) ei = mid-1;

            else si = mid+1;
        }
        return false;
    }
}
