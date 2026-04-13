package com.Patterns;

//print the pattern with recursion
//1.
//****
//***
//**
//*

//2.
//*
//**
//***
//****


public class patternInRecurssion {

    public static void main(String[] args) {
//        pattern(4,0);
        pattern01(1,0);

    }

    static void pattern(int row,int col){
        if(row == 0){
            return;
        }
        if(col < row){
            System.out.print("*");
            pattern(row,col+1);
        }
        else{
            System.out.println();
            pattern(row - 1, 0);
        }
    }


    static void pattern01(int row,int col){
        if(row == 5){
            return;
        }
        if(col < row){
            System.out.print("*");
            pattern01(row,col+1);
        }
        else{
            System.out.println();
            pattern01(row + 1, 0);
        }
    }

}
