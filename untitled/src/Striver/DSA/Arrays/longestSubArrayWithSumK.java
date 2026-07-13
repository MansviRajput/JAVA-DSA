package Striver.DSA.Arrays;

import java.util.HashMap;

public class longestSubArrayWithSumK {
    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 7, 1, 9};
        int k = 15;
        System.out.println(longestSubArray(nums, k));
    }

    private static int longestSubArray(int[] nums,int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxlen = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if(sum == k){
                maxlen = i+1;
            }
            int remian = sum - k;
            if(map.containsKey(remian)){
                maxlen = Math.max(maxlen,i - map.get(remian));
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return maxlen;
    }

// only work for positive number
    private static int usingSlidingWindow(int[] nums, int k) {
        int left = 0;
        int sum = 0;
        int maxlen = 0;
        for(int right = 0; right < nums.length; right++){
            sum += nums[right];
            while(sum > k){
                sum -= nums[left++];
                left++;
            }
            if(sum == k){
                maxlen = Math.max(maxlen, right - left + 1);
            }
        }
        return maxlen;
    }

    private static int usingRecursion(int[] nums,int k,int i,int count,int max){
        if(nums==null||nums.length==0){
            return 0;
        }
        int sum=0;
        for(int j=0;j< nums.length;j++){
            sum += nums[j];
            count++;
            max = Math.max(max,count);
            if(sum == k){
                usingRecursion(nums,k,j+1,0,max);
            }
        }
        return max;
    }
}
