class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int lowestBuy = prices[0];
        
        for (int price : prices) {
            if (price < lowestBuy) { // keep track of lowest buy
                lowestBuy = price;
            }

            maxProfit = Math.max(maxProfit, price - lowestBuy);
        }
        return maxProfit;
    }
}
