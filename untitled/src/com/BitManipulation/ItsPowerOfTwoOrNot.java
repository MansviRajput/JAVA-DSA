package com.BitManipulation;

//find if the number is power of two or not

public class ItsPowerOfTwoOrNot {

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo01(8));
        System.out.println(isPowerOfTwo02(16));
    }

    static boolean isPowerOfTwo01(int n) {
        if(n <= 0){
            return false;
        }

        int count = 0;
        while(n > 0){
            count += (n & 1);
            if(count > 1){
                return false;
            }
            n = n >> 1;
        }
        return true;
    }

    static boolean isPowerOfTwo02(int n) {
        if(n <= 0){
            return false;
        }

        while(n > 0){
            return (n & (n - 1)) == 0;
        }
        return true;
    }

}
