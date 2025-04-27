package GFG;
class CoinChange {

    public static void main(String[] args) {
        System.out.println(change(new int[]{5, 6, 2, 3}, 4, 10));
    }

    private static int change(int[] nums, int n, int sum) {
        if (sum==0) return 1;
        if (n==0) return 0;
        int res=change(nums, n-1, sum);
        if (nums[n-1] <= sum)
            res+=change(nums, n, sum-nums[n-1]);
        return res;
    }
}
