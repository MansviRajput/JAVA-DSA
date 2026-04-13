package com.BinarySearch;

//Greatest number that is smaller and equal to target
//big number <= target
//in this example you can see that we want to search the 15 which is not in array
//so we want the flooring of 15 = number that is nearestly smaller = 14

public class FlooringByBinarySearch {

    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 1;
        int ans = FloringByBinarySearch(arr,target);
        System.out.print(ans);

    }


    static int FloringByBinarySearch(int[] arr,int target) {
        //here if the target is not in array than return -1 automatically
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
        return end;
    }
}
