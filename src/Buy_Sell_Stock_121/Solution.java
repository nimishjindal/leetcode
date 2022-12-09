package Buy_Sell_Stock_121;

public class Solution {
    public int maxProfit(int[] prices) {
        int size = prices.length;
        int profit = 0;
        int buy = prices[0];
        int i = 0;
        while (i < size) {
            buy = Math.min(prices[i], buy);
            while (i + 1 < size && prices[i + 1] <= prices[i])
                buy = Math.min(prices[++i], buy);

            int sell = (i + 1 < size) ? prices[++i] : prices[i++];
            profit = Math.max(profit, sell - buy);
        }
        return profit;
    }
}
