package com.BackTrack;

public class nQueenProblem {
    public static void main(String[] args) {
        int n=4;
        boolean[][] board=new boolean[n][n];
        System.out.println(queen(board,0));

    }

    static int queen(boolean[][] board,int row){
        if(row == board.length){
            display(board);
            System.out.println();
            return 1;
        }

        int count=0;

        //placing and checking for every row and col
        for(int col=0;col<board[0].length;col++){
            if(isSafe(board,row,col)){
                board[row][col]=true;
                count += queen(board,row+1);
                board[row][col]=false;
            }
        }
        return count;

    }
    static boolean isSafe(boolean[][] board,int row,int col){
        //for vertical checking
        for(int i=0;i<row;i++){
            if(board[i][col]){
                return false;
            }
        }

        //for left diagonal
        int minLeft = Math.min(row,col);
        for(int i=0;i<=minLeft;i++){
            if(board[row-i][col-i]){
                return false;
            }
        }

        //for right diagonal
        int minRight = Math.min(row, board.length - col - 1);
        for(int i=0;i<=minRight;i++){
            if(board[row-i][col+i]){
                return false;
            }
        }
        return true;
    }

    static void display(boolean[][] board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==true){
                    System.out.print("Q ");
                }else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
