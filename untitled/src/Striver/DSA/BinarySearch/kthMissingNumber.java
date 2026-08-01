package Striver.DSA.BinarySearch;

public class kthMissingNumber {
    public static void main(String[] args) {
        int[] nums = {3, 5, 7, 10};
        int k = 6;
        System.out.println(solution(nums,k));
    }

    private static int solution(int[] nums, int k) {
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            int missing = nums[mid] - (mid+1);
            if(missing<k){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return start+k;
    }
}
