
package com.BinarySearch;

//this is finding the target in the mountain array
//it is similar to use the finding the peak of array + order agnostic


public class Problem05 {

    public static void main(String[] args) {
        int[] arr = {12,13,18,20,24,15,11,9};
        int target = 20;
        System.out.print(search(arr,target));

    }

    static int search(int[] arr,int target) {
        int peak = peakIndex(arr);
        int firstTry = AgnosticSearch(arr,target,0,peak);
        if(firstTry != -1) {
            return firstTry;
        }

        return AgnosticSearch(arr,target,peak+1,arr.length - 1);

    }

    static int peakIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start < end) {
            int mid = start + (end-start) / 2;
            if(arr[mid] > arr[mid+1]) {
                //You are in des order or array so need to search for the left part thats why we create new end
                end = mid;
            }
            else {
                start = mid + 1;
            }
        }
        return start;
    }

    static int AgnosticSearch(int[] arr,int target,int start,int end) {

        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
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
