package com.BitManipulation;

import java.util.Arrays;

public class PrimeNumberOperations {
    public static void main(String[] args) {
        boolean prime = isPrime(5);
        System.out.println(prime);
        sieveOfEratosthenes(20);

    }

    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c = 2;
        while(c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return true;
    }

//    much faster bcz it remove the multiple of number
    static void sieveOfEratosthenes(int n){
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime,true);

        isPrime[0] = isPrime[1] = false;

        for(int i = 2; i*i <= n; i++){
            if(isPrime[i]){
                for(int j = i*i; j <= n; j+=i){
                    isPrime[j] = false;
                }
            }
        }

        for(int i = 2; i <= n; i++){
            if(isPrime[i]){
                System.out.print(i + " ");
            }
        }
    }
}
