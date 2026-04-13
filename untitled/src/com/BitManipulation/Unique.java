package com.BitManipulation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Unique {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 5, 1, 2};              //only positive pair
        int[] arr1 = {5, 2, -5, 4, -1, -2, -4};         //pair of +ve and -ve
        int[] arr2 = {-5, -2, -5, -4, -1, -2, -4};      //only negative pair
        int[] arr3 = {-5, -2, 3, -5 , 3, 7};            //pair of +ve and -ve and exactly one unique in both
        int[] arr4 = {-5, -2, -5, 1, 3, 3, 5, 1, -1, -2, -4, 8};    //pair of +ve and -ve and more than one unique in both
        int[] arr5 = { 6, 9, 3, 3, 3, 6, 6};                        //if the repeatation happen in odd time and might find unique number
        System.out.println(FindUniqueOnlyInPositivePair(arr));
        FindUniqueInOnePositiveAndOneNegativePair(arr1);
        System.out.println(FindUniqueonlyInNegativeNumber(arr2));
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(FindUniqueInPairOfPositiveAndPairOfNegative(arr3,list));
        ArrayList<Integer> list1 = FindUniqueMoreThanOneInPairOfPositiveAndPairOfNegative(arr4);
        System.out.println(list1);
        System.out.println(FindUniqueForRepeatedInOddNumberFormate(arr5));
    }

    static int FindUniqueForRepeatedInOddNumberFormate(int[] arr) {
        int result = 0;
        for(int i = 0;i < 32;i++){
            int sum = 0;
            for(int num:arr){
                if(((num >> i) & 1) == 1){
                    sum++;
                }
            }
            if(sum % 3 != 0){
                result |= 1 << i;
            }
        }
        return result;

    }

    static ArrayList<Integer> FindUniqueMoreThanOneInPairOfPositiveAndPairOfNegative(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(int key : map.keySet()){
            if(map.get(key) == 1){
                list.add(key);
            }
        }
        return list;
    }


    static ArrayList<Integer> FindUniqueInPairOfPositiveAndPairOfNegative(int[] arr,ArrayList<Integer> list){
        int pos = 0, neg = 0;

        for(int num : arr){
            if(num >= 0)
                pos ^= num;
            else
                neg ^= num;
        }

        list.add(pos);
        list.add(neg);

        return list;
    }

    static int FindUniqueOnlyInPositivePair(int[] arr) {
        //using the xor properties
        int unique = 0;

        for (int num : arr) {
            unique ^= num;
        }
        System.out.println("Unique number in collection of +ve pair: ");
        return unique;
    }

    static int FindUniqueonlyInNegativeNumber(int[] arr) {
        //using the xor properties
        int unique = 0;
        for (int num : arr) {
            unique ^= Math.abs(num);
        }
        System.out.println("Unique number in collection of -ve pair (-5,-5): ");
        return (-unique);
    }

    static void FindUniqueInOnePositiveAndOneNegativePair(int[] arr) {

        Set<Integer> set = new HashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        System.out.println("Unique number in collection of +ve and -ve pair(5,-5) : ");

        for (int num : arr) {
            if (!set.contains(-num)) {
                System.out.println(num);
            }
        }
    }
}
