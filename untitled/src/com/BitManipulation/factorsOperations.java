package com.BitManipulation;

import java.util.ArrayList;

public class factorsOperations {
    public static void main(String[] args) {
        byNormalWay(20);
        byOptimizedWay(20);
        ArrayList<Integer> integers = byArrayList(36);
        System.out.println(integers);
        printFactorsNormal(36,1);
        System.out.println();
        printFactorsOptimized(144,1);
    }

//    time complexity: O(n)
    static void byNormalWay(int n){
        System.out.print("Normal Way:");
        for(int i=1;i<n;i++){
            if(n%i == 0){
                System.out.print(i + " ");
            }
        }
    }

//    time complexity: O(sqrt(n))
    static void byOptimizedWay(int n){
        System.out.print("\nOptimized Way:");
        for(int i=1;i<=Math.sqrt(n);i++){       //i*i <= n can be also used
            if(n%i == 0){
                if(n/i == i){
                    System.out.print(i + " ");
                }else {
                    System.out.print(i + " " + n / i);
                }
            }
        }
    }

//    without sort, time complexity: O(sqrt(n))     space complexity: O(d) where d = no, of divisor
//    with sort, its cheap for less no of factors but not for large no, time: O(√n + d log d)  space: O(d)
    static ArrayList<Integer> byArrayList(int n){
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("\nUsing ArrayList:");
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                list.add(i);
                if(!(n/i==i)){
                    list.add(n/i);
                }
            }
        }
        return list;
    }

//    recurssion,
//    1.
    static void printFactorsNormal(int n, int i){
        if(i > n) return;

        if(n % i == 0){
            System.out.print(i + " ");
        }

        printFactorsNormal(n, i + 1);
    }

//    2.
    static void printFactorsOptimized(int n, int i){
        if(i * i > n) return;

        if(n % i == 0){
            System.out.print(i + " ");

            if(i != n/i)
                System.out.print(n/i + " ");
        }

        printFactorsOptimized(n, i + 1);
    }




}
