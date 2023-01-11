package MaximumProductSubarray;

class Solution {
    public int maxProduct(int[] nums) {
        // Initialize max, currMax and currMin with the first element in the array
        int max = nums[0], currMax = nums[0], currMin = nums[0];

        // Iterate through the array, starting at the second element
        for (int i = 1; i < nums.length; i++) {
            // If the current element is negative, swap currMax and currMin
            if (nums[i] < 0) {
                int temp = currMax;
                currMax = currMin;
                currMin = temp;
            }
            // Calculate the max between the current element and the product of current element and the currMax
            currMax = Math.max(nums[i], nums[i] * currMax);
            // Calculate the min between the current element and the product of current element and the currMin
            currMin = Math.min(nums[i], nums[i] * currMin);
            // Assign the max of currMax and max so far to max
            max = Math.max(max, currMax);
        }
        return max;
    }
}
