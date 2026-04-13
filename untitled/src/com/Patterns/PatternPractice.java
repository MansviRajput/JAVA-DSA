package com.Patterns;

// total -> 9

//        pattern
//        *
//        * *
//        * * *
//        * * * *
//        * * * * *

//        pattern1
//        *****
//        *****
//        *****
//        *****
//        *****

//        pattern2
//        * * * * *
//        * * * *
//        * * *
//        * *
//        *

//        pattern3
//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5





public class PatternPractice {
    public static void main(String[] args) {
//        pattern(5);
//        pattern1(5);
//        pattern2(5);
//        pattern3(5);
//        pattern4(5);
//        pattern5(5);
//        pattern6(5);
//        pattern7(5);
        pattern8(5);
    }

    static void pattern(int n){

        for(int row=1;row<=n;row++){

            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    static void pattern1(int n) {

        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= n; col++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    static void pattern2(int n) {

        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    static void pattern3(int n){

        for(int row=1;row<=n;row++){

            for(int col=1;col<=row;col++){
                System.out.print(col + " ");
            }

            System.out.println();
        }
    }

    static void pattern4(int n){

        for(int row=1;row<=2*n - 1;row++){

            if(row<=n) {
                for (int col = 1; col <= row; col++) {
                    System.out.print("* ");
                }

                System.out.println();
            }
            else{
                for(int col=1;col<=2*n - row;col++){
                    System.out.print("* ");
                }
                System.out.println();
            }

        }

    }

    static void pattern5(int n){

        for(int row=1;row<=2*n - 1;row++){

            int totalColsInRow = row > n ? 2 * n - row : row;

            int noOfSpaces = n - totalColsInRow;

            for(int s=1;s<=noOfSpaces;s++){
                System.out.print(" ");
            }

            for(int col = 1; col <= totalColsInRow; col++){
                System.out.print("* ");
            }
            System.out.println();

        }

    }

    static void pattern6(int n){

        for(int row=1;row<=n;row++){

            for(int space = 1;space <= n - row;space++){
                System.out.print("  ");
            }

            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for(int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

    }

    static void pattern7(int n){

        for(int row=1;row<=2*n - 1;row++){

            int totalcol = row > n ? 2 * n - row : row;

            for(int space = 1;space <= n - totalcol;space++){
                System.out.print("  ");
            }

            for (int col = totalcol; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for(int col = 2; col <= totalcol; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

    }

    static void pattern8(int n){

        int original = n;
        n = 2*n;
        for(int row=0;row<=n;row++){
            for(int col=0;col<=n;col++){
//                int atEveryIndex = Math.min(Math.min(row,col),Math.min(n-row,n-col));
//                System.out.print(atEveryIndex + " ");
                //letter run
//                int descAt = original - Math.min(Math.min(row,col),Math.min(n-row,n-col));
//                System.out.print(descAt + " ");

            }
            System.out.println();
        }
        }
}
