class Solution {
    public int maxProfit(int[] prices) {
       // int buy = 0;
       // int sell = 1;
       int profit = 0;
        for(int buy = 0; buy < prices.length - 1; buy++){
            for(int sell = buy + 1; sell < prices.length; sell++){
                profit = Math.max(profit, prices[sell] - prices[buy]);

            }

        }
            return profit;
        }
    }

