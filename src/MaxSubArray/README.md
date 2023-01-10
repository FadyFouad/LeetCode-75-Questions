### [53. Maximum Subarray](https://leetcode.com/problems/maximum-subarray/)

# Problem Description
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

## Example:

```agsl
Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
```

# Solution
The problem can be solved by using an algorithm called `Kadane's Algorithm` which is an efficient approach to solve this problem. 
The basic idea is to keep track of the maximum sum that has been seen so far, and the current sum while iterating through the array.

At each step in the loop, the current sum is updated to be the maximum of the current sum plus the current element, and the current element itself. This is because if the current sum is negative, then starting a new subarray from the current element will result in a larger sum.

The maximum sum is also updated at each step by comparing it to the current sum.

`The time complexity of this solution is O(n)` since we are iterating through the input array once.

`The space complexity of this solution is O(1)` since we are not using any additional data structures and only using a constant amount of variables.

```java
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
```