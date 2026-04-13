package com.LeetCode;

public class leet80 {

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int ans = SortedArrayWithAtmostTwoElement(nums);
        System.out.println(ans);
    }

    private static int SortedArrayWithAtmostTwoElement(int[] nums) {
        int k = 2;
        for(int i=2;i<nums.length;i++){
            if(nums[i]!= nums[k-2]){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
