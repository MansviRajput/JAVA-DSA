package Striver.DSA.Arrays;

public class maximumProductSubarray {
    public static void main(String[] args) {
        int[] nums ={4, 5, 3, 7, 1, 2};
        System.out.println(solution(nums));
        int[] arr = {-2, 3, -4};
        System.out.println(maxProduct(arr));
    }

    // not work for more negative number //
    private static int solution(int[] nums) {
        int prod = 1;
        int max = Integer.MIN_VALUE;
        for(int num : nums){
            prod *= num;
            if(prod >= max){
                max = prod;
            }else{
                prod = 1;
            }
        }
        return max;
    }

    // standard way //
    private static int maxProduct(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int ans = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = max;
                max = min;
                min = temp;
            }

            max = Math.max(nums[i], max * nums[i]);
            min = Math.min(nums[i], min * nums[i]);

            ans = Math.max(ans, max);
        }

        return ans;
    }
}
