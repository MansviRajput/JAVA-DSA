package com.LeetCode;

import java.util.ArrayList;
import java.util.List;




class leet39 {

    public static void main(String[] args) {
        int[] nums = {2,3,6,7};
        int target = 7;
        List<List<Integer>> lists = combinationSum(nums, target);
        System.out.println(lists);
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        combinationSumWithDuplicate(candidates,target,0,new ArrayList<>(),result);
        return result;
    }

    private static void combinationSumWithDuplicate(int[] nums, int target, int start, List<Integer> current, List<List<Integer>> result){
        if(target == 0){
            result.add(new ArrayList<>(current));
            return;
        }

        for(int i = start; i < nums.length; i++){
            if(nums[i] > target){
                break;
            }

            current.add(nums[i]);
            combinationSumWithDuplicate(nums, target - nums[i], i, current, result);
            current.remove(current.size()-1);
        }
    }

}