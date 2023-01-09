package ContainsDuplicate;

import java.util.HashSet;

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
