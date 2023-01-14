package SearchInRotatedSortedArray;

class Solution {
    public int search(int[] nums, int target) {
        // Initialize left and right pointers for binary search
        int left = 0;
        int right = nums.length - 1;

        // While the left pointer is less than or equal to the right pointer
        while (left <= right) {
            // Find the middle index
            int mid = left + (right - left) / 2;

            // If the target is found at the middle index, return it
            if (target == nums[mid]) return mid;

            // Check if the right half is sorted
            if (nums[mid] <= nums[right]) {
                // If the target is within the sorted right half, search it
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    // Otherwise search the left half
                    right = mid - 1;
                }
            } else { // If the left half is sorted
                // If the target is within the sorted left half, search it
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    // Otherwise search the right half
                    left = mid + 1;
                }
            }
        }
        // If the target is not found, return -1
        return -1;
    }
}