package MinimumInRotatedSortedArray;

class Solution {
    public int findMin(int[] nums) {
        // Initialize left and right pointers to the first and last element of the array
        int left = 0, right = nums.length - 1;

        // Run the loop until left pointer is less than right pointer
        while (left < right) {
            // Calculate the midpoint of the array using the left and right pointers
            int mid = left + (right - left) / 2;

            // If the value at the midpoint is greater than the value at the right pointer,
            // this means the pivot point is to the right of the midpoint
            if (nums[mid] > nums[right]) {
                // Update left pointer to midpoint + 1
                left = mid + 1;
            }
            // If the value at the midpoint is less than or equal to the value at the right pointer,
            // this means the pivot point is to the left of the midpoint
            else {
                // Update right pointer to midpoint
                right = mid;
            }
        }
        // Once the left pointer is equal to the right pointer, we know that this is the pivot point,
        // and we return the value at this index
        return nums[left];
    }
}