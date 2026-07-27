package Striver.DSA.BinarySearch;

public class sortedInRotatedArrayWithDuplicate {
    public static void main(String[] args) {
        int[] nums = {7, 8, 1, 2, 3, 3, 3, 4, 5, 6};
        int target = 7;
        System.out.println(solution(nums,target));
    }

    private static boolean solution(int[] nums, int target){
        if(nums.length == 0)
            return false;
        int pivot = findPivot(nums);
        if(pivot == -1){
            return binarySearch(nums,target,0,nums.length-1);
        }
        if(nums[pivot]==target){
            return true;
        }
        if(target >= nums[0]){
            return binarySearch(nums,target,0,pivot-1);
        }else {
            return binarySearch(nums, target, pivot + 1, nums.length - 1);
        }
    }

    private static boolean binarySearch(int[] nums, int target, int start, int end){
        while(start<=end){
            int mid = start + (end - start)/2;
            if(nums[mid]==target)
                return true;
            else if(nums[mid]>target)
                end = mid-1;
            else
                start = mid+1;
        }
        return false;
    }

    private static int findPivot(int[] nums){
        int start = 0;
        int end = nums.length - 1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if(mid < end && nums[mid] > nums[mid + 1]){
                return mid;
            }
            if(mid > start && nums[mid] < nums[mid - 1]){
                return mid - 1;
            }

            //for duplicate value
            if(nums[mid] == nums[start] && nums[mid] == nums[end]){
                if(nums[start] > nums[start+1]){
                    return start;
                }
                start++;
                if(nums[end] < nums[end-1]){
                    return end;
                }
                end--;
            }else if(nums[start] < nums[mid] || (nums[start] == nums[mid] && nums[mid] > nums[end])){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
}
