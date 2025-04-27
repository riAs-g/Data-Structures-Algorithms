package Leetcode;

import java.util.Arrays;

public class SortColors {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortColors(new int[]{1,0,1,2,2,0})));
    }

    private static int[] sortColors(int[] nums) {
        //Bucket Sort
//        {
//            HashMap<Integer,Integer> hash=new HashMap<>();
//            hash.put(0,0);
//            hash.put(1,0);
//            hash.put(2,0);
//            for (int num: nums) {
//                if (num==0)
//                    hash.put(0, hash.get(0)+1);
//                if (num==1)
//                    hash.put(1, hash.get(1)+1);
//                if (num==2)
//                    hash.put(2, hash.get(2)+1);
//            }
//            for (int i = 0; i < nums.length; i++) {
//                if (hash.get(0)>0) {
//                    nums[i]=0;
//                    hash.put(0, hash.get(0)-1);
//                    continue;
//                }
//                if (hash.get(1)>0) {
//                    nums[i]=1;
//                    hash.put(1, hash.get(1)-1);
//                    continue;
//                }
//                if (hash.get(2)>0) {
//                    nums[i]=2;
//                    hash.put(2, hash.get(2)-1);
//                }
//            }
//        }
        //Counting Sort
        {
            int[] count = new int[3];
            for (int num : nums) {
                count[num]++;
            }

            int index = 0;
            for (int i = 0; i < 3; i++) {
                while (count[i]-- > 0) {
                    nums[index++] = i;
                }
            }
        }
        return nums;
    }
}
