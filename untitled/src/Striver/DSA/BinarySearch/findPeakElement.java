package Striver.DSA.BinarySearch;

public class findPeakElement {
    public static void main(String[] args) {
        int[] nums = {-2, -1, 3, 4, 5};
        System.out.println(findPeak1(nums));
    }

    private static int findPeak1(int[] nums){
        int start = 0;
        int end = nums.length - 1;
        while(start < end){
            int mid = start + (end-start)/2;
            if(nums[mid] > nums[mid+1]){
                end = mid;
            }
            else{
                start = mid + 1;
            }
        }
        return start;
    }

    private static int findPeak2(int[] nums){
        int start = 0;
        int end = nums.length-1;
        while(start <= end){
            int mid = start+(end-start)/2;
            boolean left =
                    mid==0 || nums[mid]>nums[mid-1];
            boolean right =
                    mid==nums.length-1 || nums[mid]>nums[mid+1];
            if(left && right){
                return mid;
            }
            if(mid < nums.length-1 &&
                    nums[mid] < nums[mid+1]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
}
