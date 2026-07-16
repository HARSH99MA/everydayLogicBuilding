class Solution {
    public int maxProfit(int[] prices) {

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {

            // Agar current price aur chhota hai, to usko new minimum bana do
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }

            // Current day par sell karne se kitna profit milega
            int profit = prices[i] - minPrice;

            // Agar ye profit ab tak ke best profit se bada hai
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }
}