package com.BinarySearch;

//Rotated Binary Search
//its the rotated array where the element continuos move
//Where the one element that is called pivot is the key to understand the whole concept
//its the element which move first and largest one in the sorted array
//Question : find the target element in the rotated array
//Input : [5,6,7,0,1,2,3,4] where the 7 is pivot target = 6 or 1

public class Problem06 {

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,1,2,3};
        int target = 6;
        System.out.print(search(arr,target));

    }

    static int search(int[] arr,int target) {
        int pivot = findPivot(arr);
        if (pivot == -1) {
            return binarySearchReturnIndex(arr,target,0,arr.length - 1);
        }
        if(arr[pivot] == target) {
            return pivot;
        }
        if(target >= arr[0]) {
            return binarySearchReturnIndex(arr,target,0,pivot - 1);
        }

        return binarySearchReturnIndex(arr,target,pivot + 1,arr.length - 1);
    }

    static int binarySearchReturnIndex(int[] arr,int target,int start,int end) {
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

    //this find the pivot element --> dont work for duplicate value
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if(arr[mid] <= arr[start]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }

    //Work for duplicate values
    static int findPivotWithDuplicate(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            //what if middle,start,end are equal then just skip the duplicate
            if(arr[mid] == arr[start] && arr[mid] == arr[end]) {
                //skip the duplicates
                //what if these duplicate are in start or in end are the pivot?
                //check if they were the pivot or not
                if(arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;
                if(arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            //left side is sorted then pivot lies in right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            }
            //else the left side pivot lies
            else {
                end = mid - 1;
            }
        }
        return -1;
    }

}


