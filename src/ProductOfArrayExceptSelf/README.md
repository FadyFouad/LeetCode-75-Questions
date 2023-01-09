### [238. Product of Array Except Self](https://leetcode.com/problems/product-of-array-except-self/)

# Problem Description
Given an array nums of n integers where n > 1, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

## Example:

``` 
Input:  [1,2,3,4]
Output: [24,12,8,6]

```
## Note
Solve it without division and in O(n).


# Solution
Use two passes through the array.

In the first pass, we can initialize the result array and fill it with the running product of the elements to the left of the current element. In the second pass, we can initialize a variable to store the running product of the elements to the right of the current element and use it to update the result array.

The time complexity of this solution is O(n), since it uses two passes through the array to calculate the result. The space complexity is O(n), since it uses an additional array to store the result.