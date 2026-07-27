package Striver.DSA.BinarySearch;

// Greater or equal to target (nearest one)
// first greater element

// only diff is the comparator
// lb --->

public class lowerAndUpperBound {
    public static void main(String[] args) {
        int[] nums = {1,2,2,3};
        int target = 2;
        System.out.println(lowerBound(nums,target));
        System.out.println(upperBound(nums,target));
    }

    // First index where nums[i] > target
    private static int upperBound(int[] nums, int x) {
        int start = 0;
        int end = nums.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(nums[mid] <= x){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return start;
    }

    // First index where nums[i] >= target
    private static int lowerBound(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]>=target){
                high = mid-1;
            }else if(nums[mid]<target){
                low = mid+1;
            }
        }
        return low;
    }
}
