
// In summary:
// Time complexity: O(n)
// Space complexity: O(1)

class Solution {
    public int maxSubArray(int[] nums) {
        
        int sum = 0;
        int maxsum = nums[0];

        for(int ele : nums) {
            sum += ele;
            maxsum = Math.max(sum,maxsum);

            if(sum < 0) {
                sum = 0;
            }
        }
        return maxsum;
    }
}
