### [LeetCode 217. Contains Duplicate](https://leetcode.com/problems/contains-duplicate/)

# Problem Description
Given an array of integers, find if the array contains any duplicates.

Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.

## Example:

```agsl
Input: [1,2,3,1]
Output: true

Input: [1,2,3,4]
Output: false
```

# Solution
Use a hash set to store the elements as we process the array. For each element, we can check if the set already contains the element. If it does, we can return true immediately. If the set does not contain the element, we can add it to the set. If the loop completes without finding a duplicate element, we can return false.

`The time complexity of this solution is O(n)`, since it needs to loop through the array once and perform a constant-time membership test for each element. 
`The space complexity is O(n)`, since the size of the set will be equal to the number of elements in the array at worst case.

```java
class Solution {
    public boolean containsDuplicate(int[] nums) {
        // edge case: empty array
        if (nums == null || nums.length == 0) {
            return false;
        }

        // create a set to store the elements
        HashSet<Integer> set = new HashSet<>();

        // loop through the array
        for (int num : nums) {
            // if the set already contains the current element, return true
            if (set.contains(num)) {
                return true;
            } else {
                // if the set does not contain the current element, add it
                set.add(num);
            }
        }

        // if the loop completes, return false
        return false;
    }
}
```