package com.LinearSearch;

import java.util.Arrays;

public class SearchIn2DArray {

    public static void main(String[] args) {
        int[][] arr = {
                {12,52,97,-71},
                {36,94,2},
                {23},
                {19,46,57,98,35,77}
        };
        int target = 2;
        int[] ans = search2d(arr,target);	//{row,col}
        System.out.println(Arrays.toString(ans));
        System.out.println(search2dForMax(arr));
        System.out.println(search2dForMin(arr));
    }

    static int[] search2d(int[][] arr,int target) {
        if(arr.length == 0) {
            return new int[] {-1,-1};
        }
        for(int row = 0;row < arr.length;row++) {
            for(int col = 0;col < arr[row].length;col++) {
                if(arr[row][col] == target) {
                    return new int[] {row,col};
                }
            }
        }
        return new int[] {-1,-1};
    }

    //Search the maximum value in 2d array
    static int search2dForMax(int[][] arr) {
        if(arr.length == 0) {
            return -1;
        }
        int max = Integer.MIN_VALUE;		//it intialize the minimum value to compare with
        for(int[] row : arr) {
            for(int col : row) {
                if(col > max) {				//if our intialized value is less than to our current element in array then it update the current to max
                    max = col;
                }
            }
        }
        return max;
    }

    //Search the minimum value in 2d array
    static int search2dForMin(int[][] arr) {
        if(arr.length == 0) {
            return -1;
        }
        int min = Integer.MAX_VALUE;
        for(int[] row : arr) {
            for(int col : row) {
                if(col < min) {
                    min = col;
                }
            }
        }
        return min;
    }
}


