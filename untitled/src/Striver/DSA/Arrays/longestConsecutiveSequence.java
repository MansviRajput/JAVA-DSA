package Striver.DSA.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class longestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        System.out.println(solution(nums));
    }

    private static int solution(int[] nums){
        if(nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);
        int max = 1;
        int count = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1]){
                continue;
            }
            if(nums[i] == nums[i-1] + 1){
                count++;
            }else{
                count = 1;
            }
            max = Math.max(max, count);
        }
        return max;
    }

    private static int solution1(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int max = 0;
        for(int num : set){
            if(!set.contains(num-1)){
                int current = num;
                int count = 1;
                while(set.contains(current+1)){
                    current++;
                    count++;
                }
                max = Math.max(max, count);
            }
        }
        return max;
    }
}
