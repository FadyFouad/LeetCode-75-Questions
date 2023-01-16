### [371. Sum of Two Integers](https://leetcode.com/problems/sum-of-two-integers/)

# Problem Description
Given two integers a and b, return the sum of the two integers without using the operators + and -.

## Note
The solution set must not contain duplicate triplets.


## Example:

```agsl
Input: a = 1, b = 2
Output: 3

```

## Constraints:

```agsl
-1000 <= a, b <= 1000
```

# Solution

1. The function takes in two integers a and b, which represent the two integers we want to add.

2. The first step is to check if the value of b is 0. If it is, then the function simply returns the value of a, as the sum of a and 0 is a.

3. If b is not 0, the function calls itself recursively with two new arguments: a ^ b and (a & b) << 1.

    -  The first argument, a ^ b, is the bitwise XOR of a and b. It gives the sum of the bits of the two integers where at least one of the bits is not set.
    -  The second argument, (a & b) << 1, is the bitwise AND of a and b shifted left by 1. This is equivalent to carrying the common set bits of a and b.
4. The function will call itself recursively with the new arguments until b is 0. At that point, the function will return the sum of a and b.


This algorithm is also an implementation of "Half Adder" logic gate which is a fundamental building block of the full adder.

# Complexity
- Time complexity: O(b)
<!-- Add your time complexity here, e.g. $$O(n)$$ -->

- Space complexity: O(1)
<!-- Add your space complexity here, e.g. $$O(n)$$ -->


```java
class Solution {
    // Iterative
    public int getSum(int a, int b) {
        if (a == 0) return b;
        if (b == 0) return a;

        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }

        return a;
    }

    // Iterative
    public int getSubtract(int a, int b) {
        while (b != 0) {
            int borrow = (~a) & b;
            a = a ^ b;
            b = borrow << 1;
        }

        return a;
    }

    // Recursive
    public int getSum(int a, int b) {
        return (b == 0) ? a : getSum(a ^ b, (a & b) << 1);
    }

    // Recursive
    public int getSubtract(int a, int b) {
        return (b == 0) ? a : getSubtract(a ^ b, (~a & b) << 1);
    }

}
```