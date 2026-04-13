package com.LeetCode;

import java.util.Arrays;

public class leet16 {
    public static void main(String[] args) {
        int[] nums = {-1,2,1,-4};
        int target = 1;
        int solution = threeSumClosest(nums, target);
        System.out.println(solution);

    }

    private static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest_sum =nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length-2;i++){
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                int current_sum=nums[i]+nums[left]+nums[right];
                if(Math.abs(current_sum - target) < Math.abs(closest_sum-target)){
                    closest_sum=current_sum;
                }
                if(current_sum<target){
                    left++;
                }
                else if(current_sum>target){
                    right--;
                }
                else{
                    return closest_sum;
                }
            }
        }
        return closest_sum;
    }
}
