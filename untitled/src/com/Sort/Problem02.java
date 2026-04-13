package com.Sort;
//448. Find All Numbers Disappeared in an Array

//Given an array nums of n integers where nums[i] is in the range [1, n],
//return an array of all the integers in the range [1, n] that do not appear in nums.

//Example 1:
//Input: nums = [4,3,2,7,8,2,3,1]
//Output: [5,6]

//Example 2:
//Input: nums = [1,1]
//Output: [2]

import java.util.ArrayList;
import java.util.List;

public class Problem02 {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        int[] arr1 = {1,1};
        System.out.println(findDisappearedNumbers(arr));
        System.out.println(findDisappearedNumbers(arr1));
    }

    static List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            //for sorting the number
            int index = nums[i] - 1;
            if (nums[index] != nums[i]) {
                swap(nums, i, index);
            } else {
                i++;
            }
        }

        // Searching for missing number
        List<Integer> ans = new ArrayList<>();
        for(int j=0;j<nums.length;j++) {
            if(nums[j]!=j+1) {
                ans.add(j+1);
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
