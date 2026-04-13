package com.BitManipulation;

public class sqrtOperations {
    public static void main(String[] args) {
        byBuiltInMethod(144);
        System.out.println();
        System.out.printf("%.3f\n",byBinarySearch(196));
        System.out.println(byNewtonsRaphsonMethod(40));
        System.out.println(byNRbutInintSqrt(40));

    }

    static void byBuiltInMethod(int n){
        double sqrt = Math.sqrt(n);
        System.out.print(sqrt);
    }

    static double byBinarySearch(int n){
        double start = 0;
        double end = n;
        double mid = 0;
        while((end-start)>0.0001){
            mid = (end+start)/2;
            if(mid*mid > n){
                end = mid;
            }else{
                start = mid;
            }
        }
        return mid;
    }

    static double byNewtonsRaphsonMethod(int n){
        double x = n;
        double root;
        double error = 0.000001;

        while(true){
            root = 0.5 * (x+n / x);
            if(Math.abs(root-x) < error){
                break;
            }
            x = root;
        }
        return root;
    }

    static int byNRbutInintSqrt(int n) {
        int x = n;

        while (x * x > n) {
            x = (x + n / x) / 2;
        }
        return x;
    }
}
