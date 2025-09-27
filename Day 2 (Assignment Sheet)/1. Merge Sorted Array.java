
// Using merge sort

// t.c = 0 ms

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int idx1 = 0;
        int idx2 = 0;

        int ha = n;

        while(ha > 0) {

            if(nums1[idx1] == 0) {
                nums1[idx1] = nums2[idx2++];
                ha--;
            }
            idx1++;
        }

        merge(nums1, 0, nums1.length-1);
    }

    // merge
    public static void merge(int[] nums1, int si, int ei) {

        if(si >= ei) return;

        int mid = si + (ei-si)/2;

        merge(nums1, si, mid);
        merge(nums1, mid+1, ei);
        merge_sort(nums1, si, mid, ei);
    }

    // merge_sort
    public static void merge_sort(int[] nums1, int si, int mid, int ei) {

        int[] temp = new int[ei-si+1];
        int k = 0;

        int i = si;
        int j = mid+1;

        while(i <= mid && j <= ei) {
            if(nums1[i] < nums1[j]) {
                temp[k] = nums1[i];
                i++;
            }
            else {
                temp[k] = nums1[j];
                j++;
            }
            k++;
        }

        while(i <= mid) {
            temp[k++] = nums1[i++];
        }

        while(j <= ei) {
            temp[k++] = nums1[j++];
        }

        for(k = 0, i = si; k < temp.length; k++, i++) {
            nums1[i] = temp[k];
        }
    }
}
