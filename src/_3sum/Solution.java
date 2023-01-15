package _3sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
