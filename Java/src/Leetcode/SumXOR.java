package Leetcode;

public class SumXOR {

    public static void main(String[] args) {
        System.out.println(subsetXORSum(new int[]{5,1,6}));
    }

    static int subset,res;
    public static int subsetXORSum(int[] nums) {
        XOR(nums, 0);
        return res;
    }

    public static void XOR(int[] nums, int i) {
        if (i >= nums.length) {
            res+=subset;
            return;
        }
        subset^=nums[i];
        XOR(nums, i+1);
        subset^=nums[i];
        XOR(nums, i+1);
    }
}
