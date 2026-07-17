package Striver.DSA.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leadersInArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 3, 1, 2};
        System.out.println((method1(nums)));
    }

    //    time complexity = o(n) & space complexity = o(n)
    private static List<Integer> method1(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int i = nums.length - 1;
        int maxRight = Integer.MIN_VALUE;
        while(i > 0){
            if(nums[i] > maxRight){
                list.add(nums[i]);
                maxRight = nums[i];
            }
            i--;
        }
        return list.reversed();
    }

    //    time complexity = o(n^2) space complexity = o(1)
    private static List<Integer> method2(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            boolean leader = false;

            for(int j = i + 1; j < nums.length; j++){
                if(nums[j] >= nums[i]){
                    leader = true;
                    break;
                }
            }
            if(!leader){
                list.add(nums[i]);
            }
        }
        return list;
    }
}
