### [LeetCode 217. Contains Duplicate](https://leetcode.com/problems/contains-duplicate/)

# Problem Description
Given an array of integers, find if the array contains any duplicates.

Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.

## Example:

``` 
Input: [1,2,3,1]
Output: true

Input: [1,2,3,4]
Output: false
```

# Solution
Use a hash set to store the elements as we process the array. For each element, we can check if the set already contains the element. If it does, we can return true immediately. If the set does not contain the element, we can add it to the set. If the loop completes without finding a duplicate element, we can return false.

The time complexity of this solution is O(n), where n is the number of elements in the array, since it needs to loop through the array once and perform a constant-time membership test for each element. The space complexity is O(n), since the size of the set will be equal to the number of elements in the array at worst case.
