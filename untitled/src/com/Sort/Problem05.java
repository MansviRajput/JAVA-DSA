package com.Sort;

//645. Set Mismatch

//You have a set of integers s, which originally contains all the numbers from 1 to n.
//Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set,
// which results in repetition of one number and loss of another number.
//
//You are given an integer array nums representing the data status of this set after the error.
//Find the number that occurs twice and the number that is missing and return them in the form of an array.

//Example 1:
//Input: nums = [1,2,2,4]
//Output: [2,3]

//Example 2:
//Input: nums = [1,1]
//Output: [1,2]

import java.util.ArrayList;
import java.util.List;

public class Problem05 {
    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        System.out.println(findErrorNums(nums));

    }

    public static int[] findErrorNums(int[] nums) {
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

        // Searching for missing number
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                return new int[]{nums[index], index + 1};
            }
        }

        return new int[]{-1,-1};
    }

    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}
