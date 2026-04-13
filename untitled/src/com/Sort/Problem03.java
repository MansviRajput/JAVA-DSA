package com.Sort;
//287. Find the Duplicate Number.

//Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
//There is only one repeated number in nums, return this repeated number.
//You must solve the problem without modifying the array nums and using only constant extra space.

//Example 1:
//Input: nums = [1,3,4,2,2]
//Output: 2

//Example 2:
//Input: nums = [3,1,3,4,2]
//Output: 3

//Example 3:
//Input: nums = [3,3,3,3,3]
//Output: 3


import java.util.Arrays;

public class Problem03 {


    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        System.out.println(findDuplicate(nums));
    }

    public static int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {

            if(nums[i] != i + 1){
                int index = nums[i] - 1;
                if(nums[index] != nums[i]){
                    swap(nums,i,index);
                }else {
                    return nums[i];
                }
            }else {
                i++;
            }
        }
        return -1;
    }

    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
