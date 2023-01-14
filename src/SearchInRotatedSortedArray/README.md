### [33. Search in Rotated Sorted Array](https://leetcode.com/problems/search-in-rotated-sorted-array/)

# Problem Description
The problem is to search for a target value in a rotated sorted array. If the target is found in the array, return its index. Otherwise, return -1.


## Example:

```agsl
Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4
```
```agsl
Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1
```
## Note
Solve it without division and in O(log n).


# Solution
The solution uses a binary search approach to find the target element in the rotated array. The algorithm first checks if the array is null or empty, and if so, it returns -1 (indicating that the target element was not found). It then initializes two pointers, left and right, to the beginning and end of the array, respectively. It then enters a while loop that continues until the left pointer is greater than the right pointer. Within the loop, it calculates the middle index of the current subarray and compares the element at that index to the target. If they are equal, it returns the index. If not, it then checks whether the left side of the array is sorted or not. If it is sorted, it checks whether the target is within the range of the left side and if so, it narrows the search to the left side of the array. If not, it continues the search on the right side of the array. If the left side is not sorted, it does the opposite, first checking if the target is within the range of the right side, and if so, it narrows the search to the right side of the array, otherwise it continues the search on the left side of the array.

`The time complexity of this solution is O(log n) `The algorithm performs a binary search which has a time complexity of O(log n)


`The space complexity is O(1)`


```java
class Solution {
    public int[] productExceptSelf(int[] nums) {
        // edge case: empty or single-element array
        if (nums == null || nums.length < 2) {
            return new int[0];
        }

        // create an array to store the result
        int[] result = new int[nums.length];

        // initialize the result array
        result[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        // initialize a variable to store the running product of the elements to the right of the current element
        int rightProduct = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] *= rightProduct;
            rightProduct *= nums[i];
        }

        return result;
    }
}
```