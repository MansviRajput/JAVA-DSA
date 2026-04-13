package com.LeetCode;

public class leet136 {
    public static void main(String[] args) {
        int[] nums = {2,3,7,2,3};
        System.out.println(singleNumber(nums));
    }

    private static int singleNumber(int[] nums) {
        int res = 0;
        for(int num:nums){
            res^=num;
        }
        return res;
    }
}
