
// T.C == 0 ms
// S.C == 46.14 MB

class Solution {

    public int first_occ(int[] nums, int target) {

        int first = -1;

        int start = 0;
        int end = nums.length-1;

        while(start <= end) {
            int mid = start + (end-start)/2;

            if(nums[mid] == target) {
                first = mid;
                end = mid-1;
            }
            else if(nums[mid] < target) {
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return first;
    }

    public int last_occ(int[] nums, int target) {

        int last = -1;

        int start = 0;
        int end = nums.length-1;

        while(start <= end) {
            int mid = start + (end-start)/2;

            if(nums[mid] == target) {
                last = mid;
                start = mid+1;;
            }
            else if(nums[mid] < target) {
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return last;
    }

    public int[] searchRange(int[] nums, int target) {
        
        int[] ans = new int[2];

        ans[0] = first_occ(nums, target);
        ans[1] = last_occ(nums, target);

        return ans;
    }
}
