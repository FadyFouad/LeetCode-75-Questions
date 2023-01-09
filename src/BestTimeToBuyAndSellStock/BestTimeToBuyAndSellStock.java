package BestTimeToBuyAndSellStock;

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