package com.BitManipulation;

//find xor from 0 to particular number
//n = 7 -> 0^1^2^3^4^5^6^7
//formula if a % 4 = 0,1,2,3 repeatation
//a % 4 == 0 xor = a
//a % 4 == 1 xor = 1
//a % 4 == 2 xor = a+1
//a % 4 == 3 xor = 0

public class xorOperation {
    public static void main(String[] args) {
        int number = xorOfNumber(6);
        System.out.println("Xor of particular number: " + number);
        int range = xorInRange(3,7);
        System.out.println("Xor in range: " + range);
    }

    static int xorOfNumber(int a){
        if(a % 4 == 0){
            return a;
        }
        if(a % 4 == 1){
            return 1;
        }
        if(a % 4 == 2){
            return a+1;
        }
        return 0;
    }


    static int xorInRange(int a,int b){
        int ans;
        ans = xorOfNumber(b) ^ xorOfNumber(a-1);
        return ans;
    }
}
