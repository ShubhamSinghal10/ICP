
// In summary:
// Time complexity: O(n log n)
// Space complexity: O(1)

class Solution {
    public int numRescueBoats(int[] people, int limit) {
        
        int ans = 0;

        int start = 0;
        int end = people.length-1;

        Arrays.sort(people);

        while(start <= end) {

            if(people[start]+people[end] <= limit) {
                ans++;
                start++;
                end--;
            }
            else {
                ans++;
                end--;
            }
        }
        return ans;
    }
}
