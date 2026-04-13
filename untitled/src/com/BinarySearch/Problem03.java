
package com.BinarySearch;

//Finding the element in infinity sorted array by binary search
//might throw exception if end pointer point to out of bound or array which cant perform the binary search better way


public class Problem03 {

    public static void main(String[] args) {
        int[] arr = {3,5,7,9,10,90,100,130,140,160,170};
        int target = 10;
        System.out.println(ans(arr,target));

        int[] arr1 = {3,7,15,19,21,28,37,49,56,58,62,66,67,81,86,88,90,92,99,101};
        int target1 = 88;
//		System.out.println(ans(arr1,target1));	//Index 29 out of bounds for length 20
        System.out.print(ans1(arr1,target1));

    }

    static int ans(int[] arr,int target) {
        int start = 0;
        int end = 1;

        while(target > arr[end]) {
            int temp = end + 1;
            end = end + ( end - start + 1 ) * 2;
            start = temp;
        }
        return binarySearch(arr,target,start,end);
    }

    static int ans1(int[] arr,int target) {
        int start = 0;
        int end = 1;

        //Index out of bounds for length of actual array which is less,in that case we need to modify our code
        while (end < arr.length && target > arr[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;

            if (end >= arr.length) {
                end = arr.length - 1; // clamp to valid index
            }

            start = newStart;
        }

        return binarySearch(arr,target,start,end);
    }


    static int binarySearch(int[] arr,int target,int start,int end) {
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
        return -1;
    }
}
