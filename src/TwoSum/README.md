# Problem Description
Given an array of integers, return the indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

## Example:

```agsl
Given nums = [2, 7, 11, 15], target = 9,
return [0, 1].
Because nums[0] + nums[1] = 2 + 7 = 9,
```

# Solution
To solve this problem, you can use a hash map to store the elements and their indices as you process the array. For each element, calculate the difference between the element and the target, and check if the difference is already in the map. If it is, return an array containing the indices of the two elements. If the difference is not in the map, add the current element and its index to the map. If the loop completes without finding a pair of elements that add up to the target, return an empty array.


```java
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // create a hash map to store the elements and their indices
        HashMap<Integer, Integer> map = new HashMap<>();

        // loop through the array of numbers
        for (int i = 0; i < nums.length; i++) {
            // calculate the difference between the current element and the target
            int diff = target - nums[i];

            // check if the difference is in the map
            if (map.containsKey(diff)) {
                // if it is, then return an array containing the indices of the two elements
                return new int[] { map.get(diff), i };
            } else {
                // if the difference is not in the map, add the current element and its index to the map
                map.put(nums[i], i);
            }
        }

        // if no two elements add up to the target, return an empty array
        return new int[0];
    }
}
```
## Tips
Be sure to consider edge cases, such as an empty array or a target that cannot be reached with the given elements.
Keep in mind that you cannot use the same element twice. This means that if the difference between the target and the current element is equal to the current element, you cannot use it as a solution.
