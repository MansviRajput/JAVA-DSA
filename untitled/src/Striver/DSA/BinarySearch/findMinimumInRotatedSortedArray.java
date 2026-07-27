package Striver.DSA.BinarySearch;

public class findMinimumInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2, 3};
        System.out.println(solution(nums));
    }

    private static int solution(int[] nums){
        if(nums.length == 0)
            return 0;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(mid < end && nums[mid] > nums[mid + 1]){
                return nums[mid+1];
            }else if(mid > start && nums[mid] < nums[mid - 1]){
                return nums[mid];
            }
            if(nums[mid] <= nums[start]){
                end =  mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
