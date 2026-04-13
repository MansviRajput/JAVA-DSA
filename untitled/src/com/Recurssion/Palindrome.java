package com.Recurssion;

public class Palindrome {

    public static void main(String[] args) {
//        boolean palindrome = isPalindrome(1654);
//        System.out.println("palindrome: " + palindrome);

//        boolean palindrome = palindrome(12231);
//        System.out.println(palindrome);

        int[] arr = {1, 2, 3, 2, 1};

        if (isPalindrome(arr))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

    }

    static boolean isPalindrome(int n){
        return n == revereseNumberWithArgumentVariable(n,0);
    }

    static int revereseNumberWithArgumentVariable(int n,int rev){
        if (n == 0){
            return rev;
        }
        return revereseNumberWithArgumentVariable(n/10,rev * 10 + n % 10);
    }

    static boolean palindrome(int n){
        int temp = n;
        int digit = 0;
        while(temp > 0){
            digit++;
            temp /= 10;
        }
        int start = 0;
        int end = digit - 1;
        while (start<end){
            int left = getDigit(n,start,digit);
            int right = getDigit(n,end,digit);

            if(left!=right){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    static int getDigit(int n,int pos,int totaldigit){
        int div = (int) Math.pow(10, totaldigit - pos - 1);
        return (n / div) % 10;
    }

    public static boolean isPalindrome(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            if (arr[start] != arr[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
