package com.BitManipulation;

public class swapNumberUsingXor {
    public static void main(String[] args) {

        int a = 3;
        int b = 8;

        System.out.println("Before swap number");
        System.out.println("a = " + a + " b = " + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After swap number");
        System.out.println("a = " + a + " b = " + b);

    }

}
