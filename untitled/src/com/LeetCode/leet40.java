package com.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class leet40 {

    public static void main(String[] args) {
        int[] candidate = {10,1,2,7,6,1,5};
        int target = 8;
        List<List<Integer>> ans = combinationSum2(candidate, target);
        System.out.println(ans);
    }

    private static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        combinationSumWithoutDuplicate(candidates,target,0,new ArrayList<>(),result);
        return result;        
    }

    private static void combinationSumWithoutDuplicate(int[] nums,int target,int start,List<Integer> current,List<List<Integer>> result){
        if(target == 0){
            result.add(new ArrayList<>(current));
            return;
        }

        for(int i=start; i<nums.length; i++){

            //skip duplicate
            if(i>start&&nums[i]==nums[i-1]){
                continue;
            }

            if(nums[i]>target){
                break;
            }

            current.add(nums[i]);
            combinationSumWithoutDuplicate(nums,target - nums[i],i+1,current,result);
            current.remove(current.size() - 1);
        }
    }
}