class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;

        // 1. Find the rotation point (index of the minimum)
        int lo = 0, hi = n - 1;
        while (lo < hi) {
            int m = lo + (hi - lo) / 2;
            if (nums[m] > nums[hi]) {
                lo = m + 1;   // min is to the right of m
            } else {
                hi = m;       // min is at m or to its left
            }
        }
        int pivot = lo;

        // 2. Pick the sorted half that could contain target
        int l, r;
        if (target >= nums[pivot] && target <= nums[n - 1]) {
            l = pivot;
            r = n - 1;
        } else {
            l = 0;
            r = pivot - 1;
        }

        // 3. Standard binary search on that half
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) return mid;
            if (nums[mid] < target) l = mid + 1;
            else r = mid - 1;
        }
        return -1;
    }
}