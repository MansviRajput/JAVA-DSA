package Striver.DSA.Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class repeatingAndMissingNumber {
    public static void main(String[] args) {
        int[] nums = {3, 5, 4, 1, 1};
        System.out.println(Arrays.toString(solve(nums)));
//        System.out.println(Arrays.toString(solve2(nums)));
    }

    private static int[] solve(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        int repeating = -1;
        int missing = -1;

        for (int i = 1; i <= nums.length; i++) {
            if(map.getOrDefault(i,0) == 0){
                missing = i;
            }
            if(map.getOrDefault(i,0) == 2){
                repeating = i;
            }
        }

        return new int[]{repeating, missing};
    }

    private static int[] solve2(int[] nums) {
        int n = nums.length;
        long expectedSum = (long) n * (n+1) / 2;
        long expectedSquaredSum = (long) n * (n+1) * (2*n + 1) / 6;
        long actualSum = 0;
        long actualSquaredSum = 0;
        for (int i = 0; i < n; i++) {
            actualSum += nums[i];
            actualSquaredSum += (long) nums[i] * nums[i];
        }
        long diff = expectedSum - actualSum;
        long diffSquared = expectedSquaredSum - actualSquaredSum;
        long sum = diffSquared /  diff;
        int missing = (int) ((diff + sum) / 2);
        int repeating = (int) (sum - missing);
        return new int[]{repeating, missing};
    }
}
