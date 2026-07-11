package Striver.DSA.Arrays;

public class removeDuplicateFromSortedArray {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{0,0,0,3,3,5,6}));
    }

    private static int solution(int[] nums){
        if(nums.length==0){
            return 0;
        }
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[j]!=nums[i]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
}
