package com.BinarySearch;

//Smallesst number that is greater and equal to target
//small number >= target
//in this example you can see that we want to search the 15 which is not in array
//so we want the celling of 15 = number that is nearestly greater = 16

public class CellingByBinarySearch {

    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 19;
        int ans = search(arr,target);
        System.out.print(ans);

    }

    static int search(int[] arr,int target) {
        if (target > arr.length - 1) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
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
        return start;
    }



}
