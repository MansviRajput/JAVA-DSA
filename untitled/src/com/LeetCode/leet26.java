package com.LeetCode;

class leet26 {

    public static void main(String[] args) {
        int[] nums = {1,1,2};
        int ans = removeDuplicates(nums);
        System.out.println(ans);
    }

//      give the count of unique number but not changable array
//    private static int removeDuplicates(int[] nums) {
//        int count=0;
//        for(int i=1; i<nums.length; i++){
//            if(i>0 && nums[i] == nums[i-1]){
//                continue;
//            }
//            count++;
//        }
//        return count;
//    }

    private static int removeDuplicates(int[] nums) {
        if (nums.length == 0){
            return 0;
        }

        int k = 1;
        for (int i = 1; i < nums.length; i++){
            if (nums[i] != nums[k-1]){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

}