// Problem: Best Time to Buy and Sell Stock
// Find maximum profit from one transaction.

// Approach:
// Keep track of minimum price so far.
// Calculate maximum profit at each step.

// Time Complexity: O(n)
// Space Complexity: O(1)

public class Day01_BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices) {

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price : prices) {

            if(price < minPrice) {
                minPrice = price;
            }

            int profit = price - minPrice;

            if(profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {

        int[] prices = {7,1,5,3,6,4};

        int result = maxProfit(prices);

        System.out.println("Maximum Profit: " + result);
    }
}