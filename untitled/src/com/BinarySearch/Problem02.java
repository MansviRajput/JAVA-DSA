package com.BinarySearch;

import java.util.Arrays;

public class Problem02 {

    public static void main(String[] args) {
        int[] arr = {5,7,7,7,7,8,8,10,12,12};
        int target = 7;
        System.out.print(Arrays.toString(SearchRange(arr, target)));

    }

    static int[] SearchRange(int[] arr,int target) {

        int[] ans = {-1,-1};
        ans[0] = Search(arr,target,true);
        if(arr[0] != -1) {
            ans[1] = Search(arr,target,false);
        }

        return ans;

    }

    static int Search(int[] arr,int target,boolean FindStartindex) {
        int ans = -1;
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
                ans = mid;
                if(FindStartindex) {
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }


}
