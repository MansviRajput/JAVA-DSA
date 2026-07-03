package Striver.DSA;

import java.util.Arrays;

class reverseArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverse(int[] arr) {
        int left = 0;
        int right = arr.length-1;
        while(left < right){
            swap(arr,left,right);
            left++;
            right--;
        }
    }

    private static void swap(int[] arr,int f,int s){
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
    }
}

