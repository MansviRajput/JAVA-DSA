package com.LeetCode;

class leet75 {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
        display(nums);
    }

    private static void sortColors(int[] nums) {
        int n = nums.length;

        // Bubble sort logic
        for(int i = 0; i < n - 1; i++) {
            for(int j = 0; j < n - i - 1; j++) {
                if(nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }

    private static void display(int[] nums) {
        for(int num : nums) {
            System.out.print(num + " ");
        }
    }
}