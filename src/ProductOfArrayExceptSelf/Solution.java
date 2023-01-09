package ProductOfArrayExceptSelf;

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
