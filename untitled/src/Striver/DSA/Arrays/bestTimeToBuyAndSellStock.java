package Striver.DSA.Arrays;

public class bestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] nums = {5, 4, 3, 2, 1};
        System.out.println(maxProfit(nums,5));
    }

//    private static int solution(int[] nums,int n){
        // int minprice = nums[0];
        // int maxprofit = 0;
        // for(int i=1;i<n;i++){
        //     minprice = Math.min(minprice,nums[i]);
        //     maxprofit = Math.max(maxprofit,nums[i] - minprice);
        // }
        // return maxprofit;
//    }

    private static int maxProfit(int[] nums,int n){
        int buy = 0;
        int sell = 1;
        int maxProfit = 0;
        while (sell < n) {
            if (nums[sell] > nums[buy]) {
                maxProfit = Math.max(maxProfit, nums[sell] - nums[buy]);
            } else {
                buy = sell;
            }
            sell++;
        }
        return maxProfit;
    }
}
