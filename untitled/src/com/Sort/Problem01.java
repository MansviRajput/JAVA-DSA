package com.Sort;

//268. Missing Number

//Given an array nums containing n distinct numbers in the range [0, n],
// return the only number in the range that is missing from the array.

//Index:        0   1   2   3   4       -> index = value
//Value:        0   1   2   3   4
//MissingCase:  0   1   2   4   5       -> missing 3  // range 4 (0,1,2,3,4)
//MissingCase:  0   1   3   2           -> n is not there // range 4 (0,1,2,3,4)

import java.util.Arrays;

public class Problem01 {

    public static void main(String[] args) {
        int[] arr = {1,0,2,4};
        int[] arr1 = {0,1,2,4,5};
        int[] arr2 = {0,1,3,2};
        int[] arr3 = {9,6,4,2,3,5,7,0,1};

        System.out.println("First Case: " + missingNumber(arr));
        System.out.println("Second Case: " + missingNumber(arr1));
        System.out.println("Third Case: " + missingNumber(arr2));
        System.out.println("Third Case: " + missingNumber(arr3));
    }

    static int missingNumber(int[] arr) {
        int i = 0;
        while(i < arr.length){
            //for sorting the number
            int index = arr[i];
            if(arr[i] < arr.length && arr[index] != arr[i]){
                swap(arr,i,index);
            }else {
                i++;
            }
        }

        //Searching purpose of missing number
        for(int j = 0; j < arr.length;j++){
            if(arr[j] != j){
                return j;
            }
        }

        //in the case of 0 to n but n is not in the array it return after all process
        return arr.length;
    }


    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}

// Another Solution -> only used for when only one element is not present in array


//class Solution {
//    public static int missingNumber(int[] arr) {
//        int n = arr.length;
//        int expectedSum = n * (n + 1) / 2;
//
//        int actualSum = 0;
//        for (int num : arr) {
//            actualSum += num;
//        }
//
//        return expectedSum - actualSum;
//    }
//}

