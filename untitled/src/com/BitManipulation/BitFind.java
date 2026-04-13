package com.BitManipulation;

public class BitFind {
    public static void main(String[] args) {
        int n = 105;
        int i = 3;
        System.out.println(bit(n,i));

    }

    static int bit(int n,int i) {
        if ((n & (1 << (i - 1))) != 0)
            return 1;
        else
            return 0;

    }
}
