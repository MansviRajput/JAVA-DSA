package Striver.DSA.Arrays;

import java.util.Arrays;

class sort012 {

    public static void main(String[] args) {
        int[] nums = {1, 0, 2, 1, 0};
        sortZeroOneTwo(nums);
        System.out.println(Arrays.toString(nums));
    }

    // public void sortZeroOneTwo(int[] nums) {
    //     int zeros = 0;
    //     int ones = 0;
    //     int twos = 0;
    //     for(int i=0;i<nums.length;i++){
    //         if(nums[i] == 0){
    //             zeros++;
    //         }
    //         else if(nums[i] == 1){
    //             ones++;
    //         }
    //         else{
    //             twos++;
    //         }
    //     }

    //     int idx = 0;

    //     while(zeros > 0){
    //         nums[idx] = 0;
    //         idx++;
    //         zeros--;
    //     }

    //     while(ones > 0){
    //         nums[idx] = 1;
    //         idx++;
    //         ones--;
    //     }

    //     while(twos > 0){
    //         nums[idx] = 2;
    //         idx++;
    //         twos--;
    //     }

    // }

    private static void sortZeroOneTwo(int[] nums){
        int l = 0;
        int mid = 0;
        int r = nums.length-1;
        while(mid<=r){
            if(nums[mid] == 0){
                swap(nums,l,mid);
                l++;
                mid++;
            }else if(nums[mid] == 1){
                mid++;
            }else{
                swap(nums,mid,r);
                r--;
            }
        }
    }

    private static void swap(int[] nums,int left,int right){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}