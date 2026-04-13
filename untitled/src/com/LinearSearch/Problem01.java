package com.LinearSearch;

public class Problem01 {
    public static void main(String[] args) {
        int[] nums = {12,657,75,963254,1584,86,2,634};

        System.out.println("Even Number Count in Array : " + FindNumbers(nums));
        System.out.println("Digit count : " + digit(0));
        System.out.println("Digit count : " + digits(2157658));
        System.out.println("Even Number : " + even(44));
    }

    static int FindNumbers(int[] nums) {
        int count = 0;
        for(int n:nums) {
            if(even(n)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int n) {
        int NumberOfDigits = digit(n);
        return NumberOfDigits % 2 == 0;
    }

    static int digit(int n) {

        if(n<0) {
            n *= -1;
        }

        if(n==0) {
            return 1;
        }

        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    static int digits(int n) {			//Optimize technique more than digit method faster and time complexity less

        if(n<0) {
            n *= -1;
        }

        return (int)(Math.log10(n)) + 1;
    }
}



