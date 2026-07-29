package Striver.DSA.Arrays;

public class reversePair {
    public static void main(String[] args) {
        int[] nums = {6, 4, 4, 2, 2};
        System.out.println(solution(nums));
    }

    private static int solution(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length-1; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] > 2 * nums[j]){
                    count++;
                }
            }
        }
        return count;
    }

    //optimal by merge sort
}
