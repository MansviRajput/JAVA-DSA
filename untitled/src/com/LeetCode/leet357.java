package com.LeetCode;
//number with unique digit
//Example:
//if n = 2 -> then 0 to 99 without repeating digit count = 91 exclude 11,22,33,44,55,66,77,88,99
//if n = 1 -> then 0 to 9 count = 10
//if n = 0 -> then 0 count = 1
//...
//but after 10 digit
//let suppose you choose 10 different number then do you have any choice from 0 to 9 ---> noo so ans afterr 10 is the same as 10

public class leet357 {
    public static void main(String[] args) {
        int result = NumberWithUniqueDigit(11);
        System.out.println(result);

    }
    public static int NumberWithUniqueDigit(int n){
        if(n==0){
            return 1;
        }
        int ans = 10;
        int uniqueChoice = 9;
        int uniqueAvailable = 9;
        for(int i=2;i<=n;i++){
            uniqueChoice = uniqueChoice * uniqueAvailable;
            ans = ans + uniqueChoice;
            uniqueAvailable--;
        }
        return ans;
    }
}
