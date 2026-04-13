package com.Sort;

import java.util.ArrayList;
import java.util.List;

//41. First Missing Positive
//Given an unsorted integer array nums.
//Return the smallest positive integer that is not present in nums.
//You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.

//Example 1:
//Input: nums = [1,2,0]
//Output: 3
//Explanation: The numbers in the range [1,2] are all in the array.

//Example 2:
//Input: nums = [3,4,-1,1]
//Output: 2
//Explanation: 1 is in the array but 2 is missing.

//Example 3:
//Input: nums = [7,8,9,11,12]
//Output: 1
//Explanation: The smallest positive integer 1 is missing.

public class Problem06 {
    public static void main(String[] args) {
        int[] arr = {7,8,9,11,12};
        int[] arr1 = {1,2,0};
        System.out.println(firstMissingPositive(arr));
        System.out.println(firstMissingPositive(arr1));
    }

    public static int firstMissingPositive(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            //for sorting the number
            int index = nums[i] - 1;
            if (nums[i] > 0 && nums[i] <= nums.length && nums[index] != nums[i]) {
                swap(nums, i, index);
            } else {
                i++;
            }
        }

        // Searching for missing number
        for(int j=0;j<nums.length;j++) {
            if(nums[j]!=j+1) {
                return j+1;
            }
        }

        return nums.length + 1;

    }

    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
