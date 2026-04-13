package com.LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class leet118 {
    public static void main(String[] args) {
        List<List<Integer>> ans = pascalTriangle(5);
        System.out.println(ans);
    }

//    private static void pascalTriangle(int n) {
//        int[][] arr = new int[n][n];
//
//        for (int i = 0; i < n; i++) {
//
//            // Print leading spaces for alignment
//            for (int s = 0; s < n - i - 1; s++) {
//                System.out.print(" ");
//            }
//
//            for (int j = 0; j <= i; j++) {
//
//                // First and last elements of each row are 1
//                if (j == 0 || j == i) {
//                    arr[i][j] = 1;
//                } else {
//                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
//                }
//
//                // Print the value
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }

    private static List<List<Integer>> pascalTriangle(int n) {      //O(n^2)
        int[][] arr = new int[n][n];

        List<List<Integer>> result = new ArrayList<>();


        for (int i = 0; i < n; i++) {
            List<Integer> list = new ArrayList<>();

            for (int j = 0; j <= i; j++) {

                // First and last elements of each row are 1
                if (j == 0 || j == i) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                }

                // Print the value
                list.add(arr[i][j]);
            }
            result.add(list);
        }
        return result;
    }
}