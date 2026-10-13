
class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int e = nums.length - 1;

        while (l <= e) {
            int mid = l + (e - l) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] >= nums[l]) {
                // Left half sorted
                if (target >= nums[l] && target < nums[mid]) {
                    e = mid - 1;
                } else {
                    l = mid + 1;
                }
            } else {
                // Right half sorted
                if (target > nums[mid] && target <= nums[e]) {
                    l = mid + 1;
                } else {
                    e = mid - 1;
                }
            }
        }

        return -1;
    }
}