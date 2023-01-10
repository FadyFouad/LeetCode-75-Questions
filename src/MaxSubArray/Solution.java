package MaxSubArray;

class Solution {
    public int maxSubArray(int[] nums) {

        // Initialize variables to track maximum sum and current sum
        int maxSum = nums[0];
        int currSum = nums[0];

        // Iterate through the array, starting at the second element
        for (int i = 1; i < nums.length; i++) {
            // Set the current sum to the maximum of the current sum and the current element
            currSum = Math.max(currSum + nums[i], nums[i]);
            // Set the maximum sum to the maximum of the current maximum sum and the current sum
            maxSum = Math.max(maxSum, currSum);
        }

        // Return the maximum sum
        return maxSum;
    }
}