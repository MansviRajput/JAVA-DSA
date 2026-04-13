package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class leet119 {
    public static void main(String[] args) {
        List<Integer> list = getRow(3);
        System.out.println(list);
        List<Integer> list1 = getRowWithout2DArray(3);
        System.out.println(list1);

    }

    private static List<Integer> getRow(int n) {
        int[][] arr = new int[n+1][n+1];

        List<List<Integer>> result = new ArrayList<>();


        for (int i = 0; i <= n; i++) {
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
        return result.get(result.size() - 1);
    }

    private static List<Integer> getRowWithout2DArray(int n) {
        List<Integer> row = new ArrayList<>();
        row.add(1);

        for (int i = 1; i <= n; i++) {
            // Update the row from right to left
            for (int j = row.size() - 1; j > 0; j--) {
                row.set(j, row.get(j) + row.get(j - 1));
            }
            row.add(1);
        }

        return row;
    }



}
