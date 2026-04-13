package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

class leet46 {

    public static void main(String[] args) {
        int[] nums = {1,2,3};
//        List<List<Integer>> result = permute(nums);
//        System.out.println(result);

        List<List<Integer>> ans = permuteUsingSwap(nums);
        System.out.println(ans);

    }

    private static List<List<Integer>> permuteUsingSwap(int[] nums) {

        int n = nums.length;

        List<List<Integer>> ans = new ArrayList<>();

        solveUsingSwap(0,nums,ans);

        return ans;
    }

    private static void solveUsingSwap(int idx,int[] nums,List<List<Integer>> ans) {

        if(idx == nums.length){
            List<Integer> temp = new ArrayList<>();
            for(int num : nums){
                temp.add(num);
            }
            ans.add(temp);
            return;
        }

        for(int i = idx; i < nums.length; i++){

            swap(nums,i,idx);
            solveUsingSwap(idx+1,nums,ans);
            swap(nums,i,idx);

        }

    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


    private static List<List<Integer>> permute(int[] nums) {
        int n = nums.length;

        List<List<Integer>> result = new ArrayList<>();

        List<Integer> temp = new ArrayList<>();

        boolean[] visited = new boolean[n];

        solve(temp,nums,result,visited);

        return result;
        
    }

    private static void solve(List<Integer> temp, int[] nums, List<List<Integer>> result,boolean[] visited) {
        if(temp.size()==nums.length){
            result.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(visited[i]){
                continue;
            }

            visited[i]=true;
            temp.add(nums[i]);

            solve(temp,nums,result,visited);

            temp.remove(temp.size()-1);
            visited[i]=false;

        }
    }
}