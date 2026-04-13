package com.BinarySearch;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {10,12,19,20,23,41,56,71,84,93,99};
        int target = 99;
        System.out.print(BinarySearchReturnIndex(arr,target));

    }

    //Return the index
    static int BinarySearchReturnIndex(int[] arr,int target) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
//			int mid = (start + end) / 2;	//this may exceed the range of int so another efficient method is given below:
            int mid = start + (end-start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            }
            else if(target > arr[mid]) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

}
