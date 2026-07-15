package Striver.DSA.Arrays;

import java.util.Arrays;

public class reArrangeArrayElementBySign {
    public static void main(String[] args) {
        int[] nums = {2, 4, 5, -1, -3, -4};
        int[] arr = solution(nums);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] solution(int[] nums){
        int[] ans = new int[nums.length];
        int posIdx = 0;
        int negIdx = 1;
        for(int num:nums){
            if(num > 0){
                ans[posIdx] = num;
                posIdx += 2;
            }
            else{
                ans[negIdx] = num;
                negIdx += 2;
            }
        }
        return ans;
    }
}
