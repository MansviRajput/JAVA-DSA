package com.LeetCode;


//258. Add Digits
//Example 1:
//Input: num = 38
//Output: 2

//Explanation: The process is
//38 --> 3 + 8 --> 11
//11 --> 1 + 1 --> 2
//Since 2 has only one digit, return it.

class leet258 {

    public static void main(String[] args) {
        int sum = addDigits(38);
        System.out.println(sum);
    }


    private static int addDigits(int num) {
        int sum=0;
        while(num>=10)
        {
            sum=0;
            while(num>0)
            {
                int temp= num%10;
                sum+=temp;
                num/=10;
            }
            num=sum;
        }
        return num;
    }
}