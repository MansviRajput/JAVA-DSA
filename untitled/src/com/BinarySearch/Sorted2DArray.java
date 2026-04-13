package com.BinarySearch;

import java.util.Arrays;

public class Sorted2DArray {

    public static void main(String[] args) {
        int[][] arr = {
                {10,15,18,23},
                {25,29,34,42},
                {47,56,64,72}
        };
        int target = 42;
        System.out.print(Arrays.toString(search(arr,target)));

    }

    static int[] search(int[][] arr,int target) {
        int rows = arr.length;
        int cols = arr[0].length;

        int start = 0;
        int end = rows*cols - 1;

        while(start <= end) {
            int mid = start + (end - start)/2;

            int row = mid / cols;
            int col = mid % cols;

            if(arr[row][col] == target) {
                return new int[] {row,col};
            }
            else if(arr[row][col] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return new int[] {-1,-1};
    }

}

