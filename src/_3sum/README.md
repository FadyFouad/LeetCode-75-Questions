### [15. 3Sum](https://leetcode.com/problems/3sum/description/)

# Problem Description
Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

## Note
The solution set must not contain duplicate triplets.


## Example:

```agsl
Given array nums = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
[-1, 0, 1],
[-1, -1, 2]
]

```

# Solution
The solution uses the two pointer approach, and first sorts the array, then iterates through the array and for each element finds the pair whose sum is equal to 0-nums[i] . In order to avoid duplicate triplets, we check for the current element if it is equal to the previous element and if yes we skip it.


`The time complexity of this solution is O(n^2)`

`The space complexity is O(n)`

```java
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // Initialize an empty list to store the final result
        List<List<Integer>> result = new ArrayList<>();

        // Sort the input array
        Arrays.sort(nums);

        // Iterate through the array with a for loop
        for (int i = 0; i < nums.length - 2; i++) {
            // Check if the current element is the same as the previous one, skip if true
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }

            // Initialize two pointers, one at the current element and one at the end of the array
            int left = i + 1;
            int right = nums.length - 1;

            // While the left pointer is less than the right pointer
            while (left < right) {
                // Check if the sum of the current element, left pointer, and right pointer is 0
                if (nums[i] + nums[left] + nums[right] == 0) {
                    // If it is, add the values to a list and add that list to the final result
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Move the left pointer to the next unique element
                    while (left < right && nums[left] == nums[left+1]) {
                        left++;
                    }


                    // Move the right pointer to the next unique element
                    while (left < right && nums[right] == nums[right-1]) {
                        right--;
                    }
                    left++;
                    right--;
                }
                // If the sum is less than 0, move the left pointer to the next unique element
                else if (nums[i] + nums[left] + nums[right] < 0) {
                    while (left < right && nums[left] == nums[left+1]) {
                        left++;
                    }
                    left++;
                }
                // If the sum is greater than 0, move the right pointer to the next unique element
                else {
                    while (left < right && nums[right] == nums[right-1]) {
                        right--;
                    }
                    right--;
                }
            }
        }
        return result;
    }
}

```