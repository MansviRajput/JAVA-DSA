package com.LeetCode;

class leet201 {
    public static void main(String[] args) {
        int sol = rangeBitwiseAnd(1,2147483647);
        System.out.println(sol);

    }

    private static int rangeBitwiseAnd(int left, int right) {
        if(left==right){
            return right;
        }
       while(right>left){
           right = right & (right-1);
       }
       return right;
    }
}