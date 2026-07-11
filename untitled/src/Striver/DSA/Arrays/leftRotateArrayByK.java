package Striver.DSA.Arrays;

import java.util.Arrays;

public class leftRotateArrayByK {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        solution(nums,2);
        System.out.println(Arrays.toString(nums));
    }

    private static void solution(int[] nums, int k) {
        int n = nums.length;
        k %= n;

        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
        reverse(nums, 0, n - 1);
    }

    private static void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }
}
