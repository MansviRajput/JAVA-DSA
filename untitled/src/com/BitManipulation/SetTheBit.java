package com.BitManipulation;

public class SetTheBit {
    public static void main(String[] args) {
        int n = 6;
        int i = 2;
        System.out.println(setbit(n,i));
        System.out.println(resetbit(n,i));

    }

    static int setbit(int n,int i){
        return n | (1 << (i-1));
    }

    static int resetbit(int n,int i){
        return (n & ~(1 << (i - 1)));
    }

}
