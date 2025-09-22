//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

public class StockProfit {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            //update minimum price (buy at lowest possible price)
            if (price < minPrice) {
                minPrice = price;
            }

            //calculate profit if selling today
            int profit = price - minPrice;
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        StockProfit sol = new StockProfit();

        //Strictly given inputs
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println("Output for [7, 1, 5, 3, 6, 4]: " + sol.maxProfit
                (prices1));  //expected 5

        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println("Output for [7, 6, 4, 3, 1]: " + sol.maxProfit
                (prices2));  //expected 0
    }
}

