package Striver.DSA.Arrays;

public class countSubArrayWithGivenXOR {
    public static void main(String[] args) {
        int[] nums = {4, 2, 2, 6, 4};
        int k = 6;
        System.out.println(solution(nums,k));
    }

    private static int solution(int[] nums, int k) {
        int xor = 0;
        int count = 0;
        for(int num : nums){
            xor ^= num;
            if(xor == 6){
                count++;
            }else{
                xor = 0;
            }
        }
        return count;
    }
}
