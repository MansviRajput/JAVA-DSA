package Striver.DSA.BinarySearch;

public class singleElementInSortedArray {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6,8};
        System.out.println(solution(nums));
    }

//    private static int solution1(int[] nums){
//
//    }

    private static int solution(int[] nums){
        int xor = 0;
        for(int num : nums){
            xor ^= num;
        }
        return xor;
    }
}
