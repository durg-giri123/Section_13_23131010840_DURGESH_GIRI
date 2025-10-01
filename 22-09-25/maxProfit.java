class MaxProfit {  // File name should be MaxProfit.java
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            }

            int profit = price - minPrice;
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        MaxProfit sol = new MaxProfit();

        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println("Output for [7,1,5,3,6,4]: " + sol.maxProfit(prices1)); // Expected 5

        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println("Output for [7,6,4,3,1]: " + sol.maxProfit(prices2)); // Expected 0
    }
}
