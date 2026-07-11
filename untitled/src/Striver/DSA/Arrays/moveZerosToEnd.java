package Striver.DSA.Arrays;

import java.util.Arrays;

public class moveZerosToEnd {
    public static void main(String[] args) {
        int[] nums = {0, 1, 4, 0, 5, 2};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void moveZeroes(int[] nums) {
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[i] == 0 && nums[j] != 0){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
            }
        }
    }
}
