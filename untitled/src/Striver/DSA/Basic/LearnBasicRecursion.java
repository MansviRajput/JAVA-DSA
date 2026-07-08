package Striver.DSA.Basic;

// number from 1 to n , number from n to 1 , sum of first n number , factorial of given n number , reverse a array
//  check if string is palindrome , fibonacci number using recursion and dynamic programming

import java.util.Arrays;

public class LearnBasicRecursion {
    public static void main(String[] args) {
//        printNto1(5);
//        print1toN(5);
//        System.out.println(sumOfFirstNNumbers(5));
//        System.out.println(factorial(5));

//        int[] nums = {1,2,1,1,5};
//        reverseArray(nums,5);
//        System.out.println(Arrays.toString(nums));

//        System.out.println(palindromeCheck("hannah"));
//        System.out.println(palindromeCheck("aabbaA"));

//        System.out.println(fibonacci(3));         //using recursion
//        System.out.println(fibonacci(4));

        System.out.println(fibonacci1(4));      //using dynamic programming


    }

    private static void printNto1(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printNto1(n-1);
    }

    private static void print1toN(int n){
        if(n==0){
            return;
        }
        print1toN(n-1);
        System.out.println(n);
    }

    private static int sumOfFirstNNumbers(int n){
        if(n==0){
            return 0;
        }
        return n+sumOfFirstNNumbers(n-1);
    }

    private static int factorial(int n){
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
    }

    private static void reverseArray(int[] nums,int n){
        int left = 0;
        int right = nums.length-1; //or we can use the n-1
        while(left<right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

    private static boolean palindromeCheck(String str){
        if(str.length()<2){
            return true;
        }
        int left = 0;
        int right = str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    private static int fibonacci(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }

    private static int fibonacci1(int n){
        if(n<2){
            return n;
        }
        int[] f = new int[n+1];
        f[0] = 0;
        f[1] = 1;
        for(int i=2;i<=n;i++){
            f[i] = f[i-1]+f[i-2];
        }
        return f[n];
    }
}
