package com.BitManipulation;

public class BitCounting {
    public static void main(String[] args) {
        int algorithm = bitCountByAlgorithrm(16);
        int bitwiseAND = bitCountByBitwiseAND(6);
        int function = bitCountByBuiltInFunction(7);

        System.out.println(function);
        System.out.println(bitwiseAND);
        System.out.println(algorithm);

    }

    static int bitCountByBuiltInFunction(int n){
        return Integer.bitCount(n);
    }

    static int bitCountByBitwiseAND(int n){
        int count = 0;
        while(n > 0){
            count += n & 1;
            n = n >> 1;
        }
        return count;
    }

//    Brian Kernighan’s Algorithm -> Removes one set bit each iteration.
    static int bitCountByAlgorithrm(int n){
        int count = 0;
        while(n > 0){
            n = n & (n-1);
            count++;
        }
        return count;
    }
}
