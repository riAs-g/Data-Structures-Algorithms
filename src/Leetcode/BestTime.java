package Leetcode;

public class BestTime {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }

    private static int maxProfit(int[] prices) {
        int min=prices[0], profit, maxprofit=0;
        for (int price : prices) {
            profit = price - min;
            maxprofit = Math.max(maxprofit, profit);
            min = Math.min(min, price);
        }
        return maxprofit;
    }
}
