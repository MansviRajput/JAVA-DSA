package Striver.DSA.BinarySearch;

import java.util.Arrays;

public class firstAndLastOccurrence {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        System.out.println(Arrays.toString(searchRange(nums,6)));
    }

    private static int[] searchRange(int[] nums,int target){
        int start = 0;
        int end = nums.length-1;
        while(start < nums.length && nums[start]!=target){
            start++;
        }
        if(start >= nums.length){
            return new int[]{-1,-1};
        }
        while(end >= 0 && nums[end]!=target){
            end--;
        }
        return new int[]{start,end};
    }

    static int[] searchRange1(int[] nums, int target) {
        int first = findOccurrence(nums, target, true);
        int last = findOccurrence(nums, target, false);
        return new int[]{first, last};
    }

    static int findOccurrence(int[] nums, int target, boolean first) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                ans = mid;

                if (first) {
                    end = mid - 1;      // search left
                } else {
                    start = mid + 1;    // search right
                }
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return ans;
    }
}
