package com.LeetCode;

public class leet509 {
    public static void main(String[] args) {
        int solution = fibonacci(4);
        System.out.println(solution);
    }

    private static int fibonacci(int n) {
        if(n<=1) return n;
        int f[] = new int[n+1];
        f[0] = 0;
        f[1] = 1;
        for(int i=2;i<=n;i++){
            f[i] = f[i-1]+f[i-2];
        }
        return f[n];
    }
}
