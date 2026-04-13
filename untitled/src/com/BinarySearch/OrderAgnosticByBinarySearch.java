package com.BinarySearch;

//Order Agnostic Search used when the user dont know about whether teh array is sorted in ascending order or descending order

public class OrderAgnosticByBinarySearch {

    public static void main(String[] args) {
        int[] arr = {10,12,19,20,23,41,56,71,84,93,99};
        int[] arr1 = {99,92,86,75,71,63,52,43,15,12,0,-8};
        int target = 99;
        int target1 = 52;
        int ans  = AgnosticSearch(arr,target);
        System.out.println(ans);
        int ans1  = AgnosticSearch(arr1,target1);
        System.out.println(ans1);

    }

    static int AgnosticSearch(int[] arr,int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
//			int mid = (start + end) / 2;	//this may exceed the range of int so another efficient method is given below:
            int mid = start + (end-start) / 2;
            if(target == arr[mid]) {
                return mid;
            }
            if(isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                }
                else if(target > arr[mid]) {		//you can also use the else
                    start = mid + 1;
                }
            }
            else {
                if (target < arr[mid]) {
                    start = mid + 1;
                }
                else if(target > arr[mid]) {		//you can also use the else
                    end = mid - 1;
                }
            }

        }
        return -1;
    }
}
