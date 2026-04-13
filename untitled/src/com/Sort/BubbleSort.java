package com.Sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {-2,8,0,-9,5,2,1};
        System.out.println(Arrays.toString(bubble(arr)));
    }

    static int[] bubble(int[] arr){

        for(int i = 0;i < arr.length - 1;i++){

            boolean sorted = true;

            for(int j = 1;j < arr.length - i;j++){
                if(arr[j-1] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    sorted = false;
                }
            }

            if(sorted){
                break;
            }
        }
        return arr;
    }
}
