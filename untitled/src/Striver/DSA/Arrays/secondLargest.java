package Striver.DSA.Arrays;

public class secondLargest {
    public static void main(String[] args) {
        int[] nums = {10,10,10,10,10};
        System.out.println(secondLargest(nums));

    }

    private static int secondLargest(int[] nums) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>first){
                second = first;
                first = nums[i];
            }
            else if(nums[i]>second && nums[i] != first){
                second = nums[i];
            }
        }
        return second == Integer.MIN_VALUE ? -1 : second;
    }
}
