package com.Recurssion;

//1.find the array is sorted or not.
//2.find an element in array with recurssion

import java.util.ArrayList;

public class arrayOpeartion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,8,3,2,3,13};
//        System.out.println(sorted(arr,0));
//        In Boolean
        System.out.println(findIndex(arr,0,9));
//        In Integer from start
        System.out.println(findIndexFromStart(arr,0,13));
//        In Integer from last
        System.out.println(findIndexFromlast(arr,5,8));
//        In ArrayList with all occurance index of 3 and the lsit declaration is global
        findIndexOfAllOccurences(arr,0,3);
        System.out.println(list);
//        In ArrayList with all occurance and the list in the argument
        ArrayList<Integer> list01 = new ArrayList<>();
        findIndexOfAllOccurencesWithArgument(arr,0,3,list01);
        System.out.println(list01);
//        In ArrayList with all occurance and the list in the function
        ArrayList<Integer> list02 = findIndexOfAllOccurencesWithoutArgument(arr, 0, 3);
        System.out.println(list02);
    }

//    1.
    static boolean sorted(int[] arr,int index){
        if(index == arr.length - 1){
            return true;
        }
        return arr[index] < arr[index+1] && sorted(arr,index+1);

    }

//    2.
    static boolean findIndex(int[] arr,int index,int target){
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || findIndex(arr,index+1,target);
    }

    static int findIndexFromStart(int[] arr,int index,int target){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return findIndexFromStart(arr,index+1,target);
    }

    static int findIndexFromlast(int[] arr,int index,int target){
        if(index == -1){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return findIndexFromlast(arr,index-1,target);
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void findIndexOfAllOccurences(int[] arr,int index,int target){
        if(index == arr.length){
            return;
        }
        if(arr[index] == target){
            list.add(index);
        }
        findIndexOfAllOccurences(arr,index+1,target);
    }

    static  ArrayList<Integer> findIndexOfAllOccurencesWithArgument(int[] arr,int index,int target,ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return findIndexOfAllOccurencesWithArgument(arr,index+1,target,list);
    }

    static ArrayList<Integer> findIndexOfAllOccurencesWithoutArgument(int[] arr,int index,int target){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> asFromBelowCalls = findIndexOfAllOccurencesWithoutArgument(arr, index + 1, target);
        list.addAll(asFromBelowCalls);
        return list;
    }


}
