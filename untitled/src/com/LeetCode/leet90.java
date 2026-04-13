package com.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Given an integer array nums that may contain duplicates, return all possible subsets (the power set).
//The solution set must not contain duplicate subsets. Return the solution in any order.
//Example 1:
//Input: nums = [1,2,2]
//Output: [[],[1],[1,2],[1,2,2],[2],[2,2]]

public class leet90 {
    public static void main(String[] args) {
        int[] nums = {1,2,2};
        List<List<Integer>> ans = subsetWithDuplicate(nums);
        for(List<Integer> list:ans){
            System.out.println(list);
        }

    }

    public static List<List<Integer>> subsetWithDuplicate(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums,0,new ArrayList<>(),result);
        return result;
    }

    private static void backtrack(int[] nums,int start,List<Integer> current,List<List<Integer>> result){
        result.add(new ArrayList<>(current));
        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1]){
                continue;
            }
            current.add(nums[i]);
            backtrack(nums,i+1,current,result);
            current.remove(current.size()-1);
        }

    }


}
