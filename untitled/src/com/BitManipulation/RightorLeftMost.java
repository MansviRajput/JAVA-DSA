package com.BitManipulation;

public class RightorLeftMost {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(rightmost(n));

        System.out.println(leftmost(n));

    }

    static int rightmost(int n){
        return n & (-n);
    }

    static int leftmost(int n){
        return Integer.highestOneBit(n); //buit in method for highest and left mst bit in number
    }

}
