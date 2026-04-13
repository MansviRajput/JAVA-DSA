package com.BinarySearch;

//Mountain Array / Bitonic Array --> which first increase and later it decrease //852
//find the peak of mountain array doesnot contain duplicate element either it return index or the value

public class Problem04 {

    public static void main(String[] args) {
        int[] arr = {2,3,5,8,9,10,12,11,7,6,4,1};
        int ans = search(arr);
        System.out.print(ans);

    }

    static int search(int[] arr) {
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
        return arr[start];
    }
}
