package com.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Given an array nums of n integers,
// return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:
//0 <= a, b, c, d < n
//a, b, c, and d are distinct.
//nums[a] + nums[b] + nums[c] + nums[d] == target
//You may return the answer in any order.

public class leet18 {
    public static void main(String[] args) {

        int[] nums = {1,0,-1,0,-2,2};
        int target = 0;
        List<List<Integer>> list = threeSum(nums,target);
        System.out.println(list);


    }

    private static List<List<Integer>> threeSum(int[] nums,int target) {

        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(nums);
        for (int i = 0; i < nums.length-3; i++) {
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }

            for(int j = i+1; j < nums.length-2; j++){
                if (j > i+1 && nums[j] == nums[j-1]) {
                    continue;
                }

                int left =  j+1,right = nums.length-1;
                while(left<right){
                    long sum = (long) nums[i]+nums[j]+nums[left]+nums[right];

                    if(sum ==  target){
                        res.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));

                        while(left<right && nums[left] == nums[left+1]) left++;

                        while(left<right && nums[right] == nums[right-1]) right--;

                        left++;
                        right--;
                    } else if (sum<target) {
                        left++;
                    }else{
                        right--;
                    }
                }
            }
        }
        return res;
    }

}
