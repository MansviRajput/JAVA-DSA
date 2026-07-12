package Striver.DSA.Arrays;

public class linearSearch {
    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 5, 3};
        System.out.println(solution(nums,3));
    }

    private static int solution(int[] nums,int target){
        for(int j=0;j<nums.length;j++){
            if(nums[j]==target){
                return j;
            }
        }
        return -1;
    }
}
