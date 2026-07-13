package Striver.DSA.Arrays;

import java.util.Arrays;

public class findMissingNumber {
    public static void main(String[] args) {
        int[] nums = {0, 2, 3, 1, 4};
        System.out.println(missingNumber(nums));
        System.out.println(missingNumberUsingXOR(nums));
        System.out.println(missingNumberBrute(nums));
        System.out.println(missingNumberUsingSorting(nums));
    }



    private static int missingNumber(int[] nums) {
        int n = nums.length;
        int actualSum = 0;
        for(int i=0;i<nums.length;i++){
            actualSum+=nums[i];
        }
        int targetSum = n * (n+1)/2;
        return targetSum-actualSum;
    }

// most imp one
    private static int missingNumberUsingXOR(int[] nums) {
        int xor = 0;
        for(int i=0;i<nums.length;i++){
            xor ^= i;
            xor ^= nums[i];
        }
        xor ^= nums.length;
        return xor;
    }


    private static int missingNumberUsingSorting(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return nums.length;
    }

    private static int missingNumberBrute(int[] nums) {
        int n = nums.length;
        for (int i = 0; i <= n; i++) {
            boolean found = false;
            for (int j = 0; j < n; j++) {
                if (nums[j] == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return i;
            }
        }
        return -1;
    }
}
