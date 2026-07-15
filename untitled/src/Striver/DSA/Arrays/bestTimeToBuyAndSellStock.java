package Striver.DSA.Arrays;

public class bestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] nums = {3, 8, 1, 4, 6, 2};
        System.out.println(solution(nums,6));
    }

    private static int solution(int[] nums,int n){
        int max = Integer.MIN_VALUE;
        int left = 0;
        int right = nums.length - 1;
        int profit = 0;
        while(left<right){
            profit = nums[right]-nums[left];
            if(profit < 0){
                right--;
            }else{
                left++;
            }
            max = Math.max(profit,max);
        }
        return max;
    }
}
