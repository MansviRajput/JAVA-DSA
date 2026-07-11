package Striver.DSA.Arrays;

public class leftRotateArrayByOne {
    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
        solution(nums);
    }

    private static void solution(int[] nums) {
        int key = nums[0];
        for(int i=1;i<nums.length;i++){
            nums[i-1] = nums[i];
        }
        nums[nums.length-1] = key;
    }
}
