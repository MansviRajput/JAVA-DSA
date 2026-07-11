package Striver.DSA.Arrays;

public class largestNumber {
    public static void main(String[] args) {
//        int[] nums = {3, 3, 6, 1};
        int[] nums = {3, 3, 0, 99, -40};
        System.out.println(largestNumber(nums));
    }

    private static int largestNumber(int[] nums){
        if(nums.length==0){
            return 0;
        }
        int max = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>max){
                max = nums[i];
            }
        }
        return max;
    }
}
