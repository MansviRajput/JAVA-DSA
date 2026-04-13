package com.Sort;

import java.util.ArrayList;
import java.util.List;

//442. Find All Duplicates in an Array

//Given an integer array nums of length n where all the integers of nums are in the range [1, n]
//and each integer appears at most twice, return an array of all the integers that appears twice.

//You must write an algorithm that runs in O(n) time and uses only constant auxiliary space,
//excluding the space needed to store the output

//Example 1:
//Input: nums = [4,3,2,7,8,2,3,1]
//Output: [2,3]

//Example 2:
//Input: nums = [1,1,2]
//Output: [1]

//Example 3:
//Input: nums = [1]
//Output: []

public class Problem04 {

    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findAllDuplicates(nums));

    }

    public static List<Integer> findAllDuplicates(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            //for sorting the number
            int index = nums[i] - 1;
            if (nums[index] != nums[i]) {
                swap(nums, i, index);
            } else {
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for(int j=0;j<nums.length;j++) {
            if(nums[j]!=j+1) {
                ans.add(nums[j]);
            }
        }

        return ans;
    }


    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
