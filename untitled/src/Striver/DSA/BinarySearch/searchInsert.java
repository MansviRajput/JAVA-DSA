package Striver.DSA.BinarySearch;

public class searchInsert {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        System.out.println(solution(nums,7));
    }

    private static int solution(int[] nums,int target){
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>target){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return start;
    }
}
