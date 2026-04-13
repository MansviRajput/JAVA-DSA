package com.Recurssion;

public class numberOperation {
    public static void main(String[] args) {
//        noInDescOrder(5);
//        noInAscOrder(5);
//        noInAscAndDescOrder(5);
//        int factorial = factorialOfNumber(5);
//        System.out.println("Factorial of 5 is " + factorial);
//        int sumOfNumbers = sumOfNumbers(6);
//        System.out.println("Sum of 6 is " + sumOfNumbers);
//        passingNumbersInWrong(5);   //stack overflow condition
//        passingNumbersInRight(5);   //right way to pass number
//        revereseNumberNormal(65422);
//        System.out.println(rev);
//        int reveresedNumber = revereseNumberWithArgumentVariable(5624, 0);
//        System.out.println("Reversed number is " + reveresedNumber);
//        int withoutArgs = reverseNumberWithoutArgumentVariable(6953);
//        System.out.println("Reversed number is " + withoutArgs);
//        int countZeroInNumber = countZeroInNumber(5);
//        System.out.println("countZeroInNumber: " + countZeroInNumber);
//        int sumOfDigit = sumOfDigit(54321);
//        System.out.println("sum of digit is " + sumOfDigit);
//        int productOfDigit = productOfDigit(54321);
//        System.out.println("product of digit is " + productOfDigit);
    }

    static void noInDescOrder(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        noInDescOrder(n-1);
    }

    static void noInAscOrder(int n){
        if(n == 0){
            return;
        }
        noInAscOrder(n-1);
        System.out.println(n);
    }

    static void noInAscAndDescOrder(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);      //desc
        noInAscAndDescOrder(n-1);
        System.out.println(n);      //asc
    }

    static int factorialOfNumber(int n){
        if(n == 0){
            return 1;
        }
        return n * factorialOfNumber(n-1);
    }

    static int sumOfNumbers(int n){
        if(n <= 1){
            return 1;
        }
        return n + sumOfNumbers(n-1);
    }

    static void passingNumbersInWrong(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        passingNumbersInWrong(n--);
    }

    static void passingNumbersInRight(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        passingNumbersInRight(--n);
    }

    static int rev = 0;
    static void revereseNumberNormal(int n){
        if(n == 0){
            return;
        }
        int remainder = n % 10;
        rev = rev * 10 + remainder;
        revereseNumberNormal(n/10);
    }

    static int revereseNumberWithArgumentVariable(int n,int rev){
        if (n == 0){
            return rev;
        }
        return revereseNumberWithArgumentVariable(n/10,rev * 10 + n % 10);
    }

    static int reverseNumberWithoutArgumentVariable(int n){
        int digit = (int) (Math.log10(n)+1);
        return helperfunc(n,digit);
    }

    static int helperfunc(int n,int digit){
        if(n % 10 == n){
            return n;
        }
        int remainder = n % 10;
        return remainder * (int) Math.pow(10, digit-1) + helperfunc(n/10,digit-1);
    }

    static int countZeroInNumber(int n){
        if(n == 0){
            return 1;
        }
        return helperForCountZero(n,0);
    }

    static int helperForCountZero(int n,int count){
        if(n == 0){
            return count;
        }
        int remainder = n % 10;
        if(remainder == 0){
            return helperForCountZero(n/10,count+1);
        }
        return helperForCountZero(n/10,count);
    }

    static int sumOfDigit(int n){
        if(n == 0){
            return 0;
        }
        return (n%10) + sumOfDigit(n/10);
    }

    static int productOfDigit(int n){
        if(n == 0){
            return 1;
        }
        return (n%10) * productOfDigit(n/10);
    }
}
