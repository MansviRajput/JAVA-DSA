package Striver.DSA.Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class majorityElement {
    public static void main(String[] args) {
        int[] nums = {7, 0, 0, 1, 7, 7, 2, 7, 7};
        System.out.println(majorityByAlgo(nums));
        int[] nums1 = {1,1,2,3,1};
        System.out.println(majorityByAlgoButNotSureAboutMajority(nums1));
    }

    private static int majorityByAlgoButNotSureAboutMajority(int[] nums){
        int candidate = 0;
        int count = 0;
        for(int num:nums){
            if(count == 0){
                candidate = num;
            }
            if(candidate == num){
                count++;
            }else{
                count--;
            }
        }

        int actualCount = 0;
        for(int num:nums){
            if(candidate == num){
                actualCount++;
            }
        }

        if(actualCount > nums.length/2){
            return candidate;
        }else{
            return -1;
        }
    }



    private static int majorityByAlgo(int[] nums) {
        int candidate = 0;
        int count = 0;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }

    private static int majorityByHashMap(int[] nums){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int n = nums.length;
        for(int key : map.keySet()){
            if(map.get(key)>n/2){
                return key;
            }
        }
        return -1;
    }

    private static int majorityBySorting(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    private static int majority(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count > n / 2) {
                return nums[i];
            }
        }
        return -1;
    }
}
