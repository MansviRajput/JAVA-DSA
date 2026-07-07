package Striver.DSA.Basic;

//countDigit , reverse , palindrome , Greatest Common Divisor , Armstrong , Divisors , Prime Number

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class KnowBasicMath {
    public static void main(String[] args) {
//        int countedDigits = countDigit(456);
//        int countedDigits01 = countDigit01(789);
//        System.out.println(countedDigits);
//        System.out.println(countedDigits01);
//
//        int reverse = reverseNUmber(1234);
//        System.out.println(reverse);
//        System.out.println(reverseNumber01(1234));
//        System.out.println(reverseNumber02(1234));

//        System.out.println(palindrome(121));
//        System.out.println(palindrome01(65456));
//        System.out.println(palindrome02(98789));

//        System.out.println(GCD(4,6));
//        System.out.println(GCD01(12,18));

//        System.out.println(isArmsStrong(153));
//        System.out.println(isArmstrongRecursive(153));
//        System.out.println(isArmstrongString(153));

//        int[] num = divisors(6);
//        System.out.println(Arrays.toString(num));
//
//        System.out.println(primeNumber(13));

    }

    private static boolean primeNumber(int n){
        int count = 0;
        for (int i = 1; i*i <= n; i++){
            if (n % i == 0){
                count++;
                if(i != n/i){
                    count++;
                }
            }
        }
        return count == 2;
    }


    private static int[] divisors(int n){
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                list.add(i);

                if(i != n/i){
                    list.add(n/i);
                }
            }
        }

        Collections.sort(list);

        int[] nums = new int[list.size()];
        for(int i=0;i<list.size();i++){
            nums[i]=list.get(i);
        }
        return nums;
    }

    private static int powerSum(int num, int digits) {
        if (num == 0) return 0;

        int digit = num % 10;
        return (int) Math.pow(digit, digits) + powerSum(num / 10, digits);
    }

    private static boolean isArmstrongRecursive(int num) {
        int digits = String.valueOf(num).length();
        return powerSum(num, digits) == num;
    }

    private static boolean isArmstrongString(int num) {
        String str = String.valueOf(num);
        int digits = str.length();
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            int digit = str.charAt(i) - '0';
            sum += Math.pow(digit, digits);
        }

        return sum == num;
    }


    private static boolean isArmsStrong(int n){
        if(n == 0) return true;

        int count = 0;
        int original = n;
        int temp = n;
        while(temp > 0){
            temp/=10;
            count++;
        }

        temp = n;
        int sum = 0;

        while(temp>0){
            int lastDigit = temp%10;
            sum += (int) Math.pow(lastDigit,count);
            temp/=10;
        }
        return sum == original;
    }

    private static int GCD01(int a,int b){
        a = Math.abs(a);
        b = Math.abs(b);

        while(b!=0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private static int GCD(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        int gcd = 1;
        int min = Math.min(a, b);
        for(int i = 1; i <= min; i++){
            if(a % i == 0 && b % i == 0){
                gcd = i;
            }
        }
        return gcd;
    }

    private static boolean palindrome02(int number){
        if(number < 0 || (number % 10 == 0 && number != 0) ){
            return false;
        }
        int reverseHalf = 0;
        while(number > reverseHalf){
            reverseHalf = reverseHalf * 10 + number % 10;
            number = number / 10;
        }
        return number == reverseHalf || number == reverseHalf / 10;
    }

    private static boolean palindrome01(int number){
        if(number < 0){
            return false;
        }
        String str = String.valueOf(number);
        int left = 0;
        int right = str.length() - 1;
        while (left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    private static boolean palindrome(int number) {
        int original = number;
        int reverse = 0;
        while (number > 0) {
            reverse = reverse * 10 + number % 10;
            number = number / 10;
        }
        return original == reverse;
    }

    private static int reverseNumber01(int number) {
        boolean isNegative = number < 0;
        String str = String.valueOf(Math.abs(number));
        StringBuilder sb = new StringBuilder(str).reverse();

        int res = Integer.parseInt(sb.toString());
        return isNegative ? -res : res;
    }

    private static int reverseNumber02(int number) {
        String str = String.valueOf(Math.abs(number));
        String reverse = "";
        for(int i=str.length()-1;i>=0;i-- ){
            reverse += str.charAt(i);
        }
        return Integer.parseInt(reverse);
    }

    private static int reverseNUmber(int n){
        int rev = 0;
        while(n!=0){
            int lastDigit = n%10;
            rev = rev*10 + lastDigit;
            n = n/10;
        }
        return rev;
    }


    private static int countDigit(int n){
        if(n == 0){
            return 1;
        }
        int count = 0;

        if(n > 0){
            while(n > 0){
                n /= 10;
                count++;
            }
        }

        //for negative we have to make the n = Math.abs(n)

        return count;
    }

    private static int countDigit01(int n){
        if(n == 0){
            return 1;
        }
//        return (int)(Math.log10(Math.abs(n))+1);      //work for negative
        return (int)(Math.log10(n)+1);        //work for positive
    }
}
