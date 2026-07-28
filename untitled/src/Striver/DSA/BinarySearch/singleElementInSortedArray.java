package Striver.DSA.BinarySearch;

public class singleElementInSortedArray {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6};
        System.out.println(solution1(nums));
    }

    private static int solution2(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;

            if(mid % 2 == 1){
                mid--;
            }

            if(nums[mid] == nums[mid + 1]){
                start = mid + 2;
            }else{
                end = mid;
            }
        }
        return nums[start];
    }

    private static int solution1(int[] nums){

        if (nums.length == 1) return nums[0];

        if (nums[0] != nums[1]) return nums[0];

        if (nums[nums.length - 1] != nums[nums.length - 2])
            return nums[nums.length - 1];

        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]){
                return nums[mid];
            }
            if(mid < nums.length-1 && nums[mid]==nums[mid+1]){
                 if(mid % 2 == 0){
                     start=mid+2;
                 }else{
                     end=mid-1;
                 }
            }
            else if(mid > 0 && nums[mid]==nums[mid-1]){
                if(mid % 2 != 0){
                    start=mid+1;
                }else{
                    end=mid-2;
                }
            }
        }
        return -1;
    }

    private static int solution(int[] nums){
        int xor = 0;
        for(int num : nums){
            xor ^= num;
        }
        return xor;
    }






}
