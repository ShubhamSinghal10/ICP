// 239 leetocode

// t.c = O(N)
// Optimization 

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int n = nums.length;
        int arr[] = new int[n-k+1];

        Deque<Integer> q = new ArrayDeque<>();
        for(int i = 0; i < n; i++) {

            while(!q.isEmpty() && q.peekFirst()<=i-k) {
                q.pollFirst();
            }

            while(!q.isEmpty() && nums[q.peekLast()] < nums[i]) {
                q.pollLast();
            }
            q.add(i);
            if(i >= k-1) {
                arr[i-k+1] = nums[q.peekFirst()];
            }
        }
        return arr;

    }
}



// Brute force approach
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int[] ans = new int[nums.length-k+1];
        int idx = 0;
        
        for(int i = 0; i <= nums.length-k; i++) {

            int max = nums[i];

            for(int j = i; j < i+k; j++) {

                max = Math.max(nums[j],max);
            }
            ans[idx++] = max;
        }
        return ans;
    }
}
