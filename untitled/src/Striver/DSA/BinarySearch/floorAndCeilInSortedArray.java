package Striver.DSA.BinarySearch;

import java.util.Arrays;

public class floorAndCeilInSortedArray {
    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 8, 10, 12, 14};

        System.out.println(Arrays.toString(getFloorAndCeil(nums,1)));
    }

    private static int[] getFloorAndCeil(int[] nums, int x) {
        int floor  = -1;
        int ceil = -1;
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(x == nums[mid]){
                floor = nums[mid];
                ceil = nums[mid];
                break;
            }else if(x < nums[mid]){
                ceil = nums[mid];
                end = mid-1;
            }else{
                floor = nums[mid];
                start = mid+1;
            }
        }
        return new int[]{floor,ceil};
    }
}
