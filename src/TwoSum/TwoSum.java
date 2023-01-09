package TwoSum;

import java.util.HashMap;

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
