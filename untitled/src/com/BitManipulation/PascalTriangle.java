package com.BitManipulation;

public class PascalTriangle {

    public static void main(String[] args) {
//        printTriangle(5);
//        nthRow(3);
//        int element = findElement(5, 2);
//        System.out.println(element);
//        System.out.println(sumOfRow(3));
    }

    static int sumOfRow(int n){
//        return  1 << n;
       return (int)Math.pow(n,2);       //or we can use the power function bcz the row sum = 2^n
    }

    static int findElement(int n,int r){
        if(r > n){
            return 0;
        }

        int res = 1;

        for(int i = 0;i < r;i++){
            res = res * (n - i) / (i + 1);
        }
        return res;
    }

    static void nthRow(int n){
        //using the formula of nCr = n! / (r! * (n-r)!)
        int value = 1;
        for(int r = 0; r <= n;r++){
            System.out.print(value+" ");
            value = value * (n - r) / (r + 1);
        }
    }

    static void printTriangle(int n){

        int[][] arr = new int[n][n];

        for(int i = 0; i < n; i++){

            // Print spaces for alignment
            for(int s = 0; s < n - i - 1; s++){
                System.out.print(" ");
            }

            for(int j = 0; j <= i; j++){

                if(j == 0 || j == i){
                    arr[i][j] = 1;
                }
                else{
                    arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
                }

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
