package com.LeetCode;

import java.util.Arrays;

class leet4 {

    public static void main(String[] args) {
        int[] nums1 = {1,3,4};
        int[] nums2 = {2};
        double solution = findMedianSortedArrays(nums1,nums2);
        System.out.println(solution);
    }

    private static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] merge = new int[nums1.length + nums2.length];

        System.arraycopy(nums1, 0, merge, 0, nums1.length);
        System.arraycopy(nums2, 0, merge, nums1.length, nums2.length);

        Arrays.sort(merge);

        int n = merge.length;

        if (n % 2 == 1) {
            return merge[n / 2];
        } else {
            return (merge[n / 2 - 1] + merge[n / 2]) / 2.0;
        }
    }
}