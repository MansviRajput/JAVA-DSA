package practice;

import java.util.Arrays;
import java.util.Stack;

public class nextGreaterElement {
    public static void main(String[] args) {
        int[] nums = {4,5,2,25};
        System.out.println(Arrays.toString(solution(nums)));
    }

    private static int[] solution(int[] nums) {
        int[] ans = new int[nums.length];
        Stack<Integer> st = new Stack<>();
        for(int i=nums.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<nums[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i]=-1;
            }else{
                ans[i] = st.peek();
            }
            st.push(nums[i]);
        }
        return ans;
    }
}
