package Striver.DSA.Arrays;

public class kadaneAlgorithm {
    public static void main(String[] args) {
        int[] nums = {2, 3, 5, -2, 7, -4};
        System.out.println(solution(nums));
    }

    private static int solution(int[] nums){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int num:nums){
            sum+=num;
            if(sum > max){
                max = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return max;
    }
}
