class Solution {
    public int maxProfit(int[] prices) {
        int leftIndex = 0; //keeps track of buy value
        int rightIndex = 1; //keeps track of sell value
        int maxProfit = 0;

        while (rightIndex < prices.length) {
            int buy = prices[leftIndex];
            int sell = prices[rightIndex];
            maxProfit = Math.max(maxProfit, sell - buy);

            if (sell < buy) leftIndex = rightIndex;
            rightIndex++;
        }

        return maxProfit;
    }
}
