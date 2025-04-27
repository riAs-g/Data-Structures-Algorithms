package GFG;
public class BuySell {
    public static void main(String[] args) {
        System.out.println("Max profit is "+maxProfit(new int[]{1, 5, 3, 8, 12}));
    }

    private static int maxProfit(int[] nums) {
        int profit = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i+1]>nums[i]) {
                profit+=nums[i+1]-nums[i];
            }
        }
        return profit;
    }
}
