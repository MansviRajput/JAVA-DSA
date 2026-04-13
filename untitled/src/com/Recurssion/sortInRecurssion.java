package com.Recurssion;

//1.Bubble Sort -> Recurssion  -> if c>c+1 then swap r is going to be the element - 1 (4-1)
// it define that how many time each row ele swap

import java.util.Arrays;

public class sortInRecurssion {
    public static void main(String[] args) {
//        int[] arr = {4,3,2,1};
//        bubbleSort(arr,3,0);
//        System.out.println(Arrays.toString(arr));
//
//        int[] arr01 = {4,3,2,8,1};
//        selectionSort(arr01, arr01.length, 0,0);
//        System.out.println(Arrays.toString(arr01));

//        int[] arr02 = {5,4,3,2,1};
//        int[] merged = mergeSort(arr02);
//        System.out.println(Arrays.toString(merged));

//        int[] arr03 = {5,4,3,2,1,9};
//        int[] mergedInPlace = mergeSort(arr03);
//        System.out.println(Arrays.toString(mergedInPlace));

        int[] arr04 = {9,2,7,5,4,6};
        quickSort(arr04, 0, arr04.length-1);
        System.out.println(Arrays.toString(arr04));



    }

    static void bubbleSort(int[] arr,int r,int c){
        if(r == 0){
            return;
        }
        if(c < r){
            if(arr[c] > arr[c+1]){
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            bubbleSort(arr,r,c+1);
        }
        bubbleSort(arr,r-1,0);
    }

    static void selectionSort(int[] arr,int r,int c,int max){
        if(r == 0){
            return;
        }
        if(c < r){
            if(arr[c] > arr[max]){
                selectionSort(arr,r,c+1,c);
            }else{
                selectionSort(arr,r,c+1,max);
            }
        }
        else{
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;
            selectionSort(arr,r-1,0,0);
        }
    }

    static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length/2;

        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }

    static int[] merge(int[] first,int[] second){

        int[] mix = new int[first.length+second.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<first.length&&j<second.length){
            if(first[i]<second[j]){
                mix[k]=first[i];
                i++;
            }else{
                mix[k]=second[j];
                j++;
            }
            k++;
        }
        while(i<first.length){
            mix[k]=first[i];
            i++;
            k++;
        }

        while(j<second.length){
            mix[k]=second[j];
            j++;
            k++;
        }
        return mix;
    }

    static void mergeSortInPlace(int[] arr,int s,int e){
        if(e-s == 1){
            return;
        }
        int mid = s+(e-s)/2;
        mergeSortInPlace(arr,s,mid);
        mergeSortInPlace(arr,mid,e);

        mergeInPlace(arr,s,mid,e);
    }

    static void mergeInPlace(int[] arr,int s,int mid,int e){
        int[] mix = new int[e-s];
        int i=s;
        int j=mid;
        int k=0;
        while(i<mid&&j<e){
            if(arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;
            }else{
                mix[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<mid){
            mix[k]=arr[i];
            i++;
            k++;
        }
        while(j<e){
            mix[k]=arr[j];
            j++;
            k++;
        }
        for(int p=0;p< arr.length;p++){
            arr[s+p]=mix[p];
        }
    }


    static void quickSort(int[] num,int low,int high){
        if(low>high) return;
        int s = low;
        int e = high;
        int mid = s + (e-s)/2;
        int pivot = num[mid];
        while(s<=e){
            while(num[s]<pivot){
                s++;
            }
            while(num[e]>pivot){
                e--;
            }
            if(s<=e){
                int temp = num[s];
                num[s] = num[e];
                num[e] = temp;
                s++;
                e--;
            }
        }
        quickSort(num,low,e);
        quickSort(num,s,high);
    }



}
