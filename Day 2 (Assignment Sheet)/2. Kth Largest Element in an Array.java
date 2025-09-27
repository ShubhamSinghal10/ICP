// using prioritQueue

// t.c = 61ms

class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int ele : nums) {
            pq.add(ele);

            if(pq.size() > k) {
                pq.poll();
            }
        }
        return pq.poll();
    }
}
