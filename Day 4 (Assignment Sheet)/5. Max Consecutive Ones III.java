
// Optimization

class Solution {
    public int longestOnes(int[] nums, int k) {
        

        int maxOne = 0;

        int start = 0;

        int zeroCount = 0;

        for(int end = 0; end < nums.length; end++) {

            if(nums[end] == 0) {
                zeroCount++;
            }

            while(zeroCount > k) {
                if(nums[start] == 0) {
                    zeroCount--;
                }
                start++;
            }

            maxOne = Math.max(maxOne, end-start+1);
        }
        return maxOne;
    }
}
