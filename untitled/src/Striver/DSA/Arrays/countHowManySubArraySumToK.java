package Striver.DSA.Arrays;

import java.util.HashMap;

public class countHowManySubArraySumToK {
    public static void main(String[] args) {
        int[] nums ={3, 1, 2, 4};
        System.out.println(subarraySum(nums,6));
    }

    private static int subarraySum(int[] nums, int k) {
        int sum = 0;
        int count = 0;
        int left = 0;
        for(int right = 0; right < nums.length; right++){
            sum += nums[right];
            while(sum > k){
                sum -= nums[left];
                left++;
            }
            if(sum == k){
                count++;
            }
        }
        return count;
    }

    // most appropriate for both positive and negative number
    private static int subarraySum2(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;
        int count = 0;
        for(int num : nums){
            sum += num;
            if(map.containsKey(sum - k)){
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
