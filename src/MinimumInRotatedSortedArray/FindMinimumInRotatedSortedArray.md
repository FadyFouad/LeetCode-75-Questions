### [153. Find Minimum in Rotated Sorted Array](https://leetcode.com/problems/find-minimum-in-rotated-sorted-array)

# Problem Description
Given an integer array nums sorted in ascending order, and an integer target, find the index of the target in the array. If the target is not found in the array, return -1.
## Example:

```agsl
Input: nums = [3,4,5,1,2]
Output: 1
Explanation: The original array was [1,2,3,4,5] rotated 3 times.


Input: nums = [4,5,6,7,0,1,2]
Output: 0
Explanation: The original array was [0,1,2,4,5,6,7] and it was rotated 4 times.

Input: nums = [11,13,15,17]
Output: 11
Explanation: The original array was [11,13,15,17] and it was rotated 4 times. 
```
## Note
Solve it without division and in O(n).


# Solution
This solution uses a binary search algorithm to find the minimum value in a rotated sorted array. The approach is to find the pivot point, which is the point where the array is rotated. Once we find this point, we know that the minimum value is located at the pivot point or the first element of the array.

`Time complexity: O(log n).`
`Space complexity: O(1).`


```java
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
        // Once the left pointer is equal to the right pointer, we know that this is the pivot point 
        // and we return the value at this index
        return nums[left];
    }
}

```