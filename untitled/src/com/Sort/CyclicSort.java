package com.Sort;

import java.util.Arrays;

// use only when the range are given specify from 1 to n m.i.m.p

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        int[] arr1 = {8,7,6,5,4,3,2,1};
        sortByFor(arr);
        sortByWhile(arr1);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));


    }

    static void sortByFor(int[] arr){

        for(int i = 0;i < arr.length; ){
            int val = arr[i] - 1;
            if(arr[i] != arr[val]){
                swap(arr,i,val);
            }
            else {
                i++;
            }
        }
    }

    static void sortByWhile(int[] arr){
        int i  = 0;
        while(i < arr.length){
            int index = arr[i] - 1;
            if(arr[i] != arr[index]){
                swap(arr,i,index);
            }else {
                i++;
            }
        }
    }

    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
