package Striver.DSA.Arrays;

public class maximumConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 0, 1, 1, 1, 0};
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    private static int findMaxConsecutiveOnes(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        int max = 0;
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }
            if(nums[i]==0){
                count = 0;
            }
            if(count>max){
                max = count;
            }
        }
        return max;
    }

    //most used one bcz after checking for 1 doest need to check for 0 try this type of solution

    private static int findMaxConsecutiveOnes1(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        int max = 0;
        int count = 0;
        for(int num:nums){
            if(num==1){
                count++;
                max =  Math.max(max,count);
            }else{
                count = 0;
            }
        }
        return max;
    }
}
