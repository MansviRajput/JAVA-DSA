package com.LinearSearch;

public class LinearSearch {

    public static void main(String[] args) {
//		int[] num = {25,-6,28,41,53,-2,-7,22,71,36,98,-1};
//		int target = -1;
//		int ans = LinearSearchReturnIndex(num,target);
//		System.out.println(ans);
//		int sol = LinearSearchReturnTarget(num,target);
//		System.out.println(sol);
//		boolean value = LinearSearchReturnBooleanValue(num,target);
//		System.out.println(value);


    }

    //	search the target and return the index
    static int LinearSearchReturnIndex(int arr[], int target) {
        if (arr.length == 0) {
            return -1;
        }

        // run for loop for traversing
        for (int i = 0; i < arr.length; i++) {
            // if the target found at any index then return the index otherwise return -1
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        // this execute when the above line cant execute and target dont found
        return -1;
    }

    //	search the target and return the value
    static int LinearSearchReturnTarget(int arr[], int target) {
        if (arr.length == 0) {
            return -1;
        }

        // for each used to return the value instead of index (bcz index returning cant
        // perform by for each)
        for (int e : arr) {
            if (e == target) {
                return e;
            }
        }
        return -1;
    }

    //	search the target and return the boolean value True / False
    static boolean LinearSearchReturnBooleanValue(int arr[], int target) {
        if (arr.length == 0) {
            return false;
        }

        for (int e : arr) {
            if (e == target) {
                return true;
            }
        }
        return false;
    }


}

