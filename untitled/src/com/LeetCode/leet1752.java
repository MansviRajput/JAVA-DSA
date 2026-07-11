package com.LeetCode;

import java.util.Arrays;

public class leet1752 {
    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
        int[] nums1 = {2,1,3,4};
        System.out.println(method1(nums));
        System.out.println(method2(nums1));
    }

    private static boolean method1(int[] nums){
        int count=0;
        int n = nums.length;
        for(int i=0;i<nums.length;i++){
            if(nums[i] > nums[(i+1)%n]){
                count++;
            }
        }

        return count<=1;
    }

    private static boolean method2(int[] nums){

        int n =nums.length;

        int[] sorted = nums.clone();
        Arrays.sort(sorted);

        int start = 0;
        for(int i=1;i<n;i++){
            if(nums[i]<nums[start]){
                start=i;
            }
        }

        for(int i=0;i<n;i++){
            if(nums[(start + i) % n] != sorted[i]){
                return false;
            }
        }

        return true;
    }

}
