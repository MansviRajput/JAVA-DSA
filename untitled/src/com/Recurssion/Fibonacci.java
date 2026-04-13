package com.Recurssion;

import java.util.Scanner;

//fibonacci -> 0 1 1 2 3 5 8 13 21

public class Fibonacci {

    public static void main(String[] args) {
        int fibonacci = fibonacci(7);
        System.out.println(fibonacci);
    }

    static int fibonacci(int n){
        if(n < 2){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }


}
