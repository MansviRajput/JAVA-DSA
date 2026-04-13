package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

//Given an integer array nums of unique elements, return all possible subsets (the power set).
//The solution set must not contain duplicate subsets. Return the solution in any order.
//Example 1:
//Input: nums = [1,2,3]
//Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]


public class leet78 {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> ans = subset(nums);
        for(List<Integer> list:ans){
            System.out.println(list);
        }
    }

    public static List<List<Integer>> subset(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums,0,new ArrayList<>(),result);
        return result;
    }

    public static void backtrack(int[] nums,int start,List<Integer> current,List<List<Integer>> result){
        result.add(new ArrayList<>(current));

        for(int i=start; i<nums.length; i++){
            current.add(nums[i]);
            backtrack(nums,i+1,current,result);
            current.remove(current.size()-1);
        }
    }
}
