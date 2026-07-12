package Striver.DSA.Arrays;

//Find the number that appears once, and other numbers twice.  -> give the number that appear only once in array
// known as single number

import java.util.HashMap;

public class singleNumber {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4, 3, 1, 4};
        System.out.println(solution(nums));
    }

    private static int solution(int[] nums){
        int result = 0;
        for(int num : nums){
            result ^= num;
        }
        return result;
    }

    private static int solution2(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                return key;
            }
        }

        return -1;
    }
}
