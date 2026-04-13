package com.LinearSearch;

//in this example we have to search within some range

public class SearchInRange {

    public static void main(String[] args) {
        int[] arr = {2, -3, 86, 41, -7, 32, 13, 94};
        int target = -7;
        int sol = LinearSearchWithinRange(arr, target, 2, 6);
        System.out.println("Solution at index : " + sol);

    }

    static int LinearSearchWithinRange(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = start; i <= end; i++) {
//			int element = arr[i];
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

}