package Striver.DSA.Arrays;

import java.util.HashMap;

public class largestSumWithSum0 {
    public static void main(String[] args) {
        int[] nums = {15, -2, 2, -8, 1, 7, 10, 23};
        System.out.println(solution(nums));
    }

    private static int solution(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int maxLength = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            // If prefix sum becomes 0
            if (sum == 0) {
                maxLength = i + 1;
            }

            // If sum already exists, calculate length
            if (map.containsKey(sum)) {
                maxLength = Math.max(maxLength, i - map.get(sum));
            } else {
                // Store first occurrence only
                map.put(sum, i);
            }
        }

        return maxLength;
    }
}
