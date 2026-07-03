//package com.LeetCode;
//
//import java.util.Arrays;
//
//import static java.util.Arrays.sort;
//
//public class leet31 {
//    public static void main(String[] args) {
//        int[] nums = new int[]{1,2,3};
//        permute(nums,0);
//    }
//
//    private void nextPermutation(int[] nums) {
//        int[] sorted =
//        permute(nums,0);
//
//
//    }
//
//    private static void permute(int[] nums, int start) {
//        if(start == nums.length - 1){
//            System.out.println(Arrays.toString(nums));
//            return;
//        }
//
//        for(int i=start;i<nums.length;i++){
//            swap(nums,start,i);
//            permute(nums,start+1);
//            swap(nums,start,i);
//        }
//    }
//
//    private static void swap(int[] nums,int i,int j){
//        int temp = nums[i];
//        nums[i] = nums[j];
//        nums[j] = temp;
//    }
//
//}
