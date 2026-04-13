package com.LinearSearch;


//You are given m x n integer grid accounts where accounts[i][j] is the amount of money
//the ith customer has in the jth bank return the wealth that the richest customer has

//we had 2D array of customer and their bank account we have to find the maximum of them
//Example Input: accounts = [[1,5],[7,3],[3,5]] Output: 10

public class Problem02 {

    public static void main(String[] args) {
        int[][] accounts = {{1,5},{7,3},{3,5}};
        System.out.print("The Maximum value of customer : " + maximumWealth(accounts));


    }

    static int maximumWealth(int[][] accounts) {
        //customer - row
        //account - col
        int max = Integer.MIN_VALUE;
        for(int[] customer:accounts) {
            //when you start new col,take a sum of that row
            int sum = 0;
            for(int account:customer) {
                sum += account;

            }

            //now we have the sum of one customer overall account calculation
            //check to compare with other customer use the intialise identifier
            if(sum > max) {
                max = sum;
            }
        }
        return max;
    }


}
