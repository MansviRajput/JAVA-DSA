package com.BitManipulation;

//find number oof digit in base b
//formula = log a onto the base of b = x
//where x is number of digits, a is the actual number, & b is the base that can be in binary/decimal
// log 35672 onto the base of 10 = 5

public class NumberOfDigitInBaseB {
    public static void main(String[] args) {
        int n = 6;
        int base = 2;

        int ans = (int) (Math.log(n) / Math.log(base)) + 1;

        System.out.println(ans);
    }
}

