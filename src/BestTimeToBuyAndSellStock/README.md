# Problem Description
Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.

Note that you cannot sell a stock before you buy one.

## Example:

```agsl
Input: [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), 
profit = 6-1 = 5.
Not 7-1 = 6, 
as selling price needs to be larger than buying price.
```

# Solution
we can keep track of the minimum price seen so far and the maximum profit that can be made by selling at any point after the minimum price. We can do this by looping through the array and updating the minimum price and maximum profit as necessary.

`The time complexity of this solution is O(n)`, since it only needs to loop through the array once. `The space complexity is O(1)`, since it only uses a constant amount of additional space to store the minimum price and maximum profit variables.

```java
public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        // edge case: empty or single-element array
        if (prices == null || prices.length < 2) {
            return 0;
        }
        // initialize variables
        int maxProfit = 0;
        int minPrice = prices[0];

        // loop through the array, starting at the second element
        for (int i = 1; i < prices.length; i++) {
            // update the minimum price
            minPrice = Math.min(minPrice, prices[i]);
            // update the maximum profit
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        }
        return maxProfit;
    }
}
```