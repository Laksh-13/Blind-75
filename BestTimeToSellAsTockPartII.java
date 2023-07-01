//Time Compexity: O(N)
//Space Compexity: O(1)
class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int oldStockPrice = prices[0]; 

        for (int i=1; i< prices.length; i++){
            if(oldStockPrice > prices[i]){
                oldStockPrice = prices[i];
            }
            else {
                profit += prices[i] - oldStockPrice;
                oldStockPrice = prices[i];
            }

        }

        return profit;
    }
}
