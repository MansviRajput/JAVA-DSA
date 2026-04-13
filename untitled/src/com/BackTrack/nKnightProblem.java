package com.BackTrack;

public class nKnightProblem {
    public static void main(String[] args) {
        int n = 3;
        int k = 2;
        boolean[][] board = new boolean[n][n];
        solve(board,0,0,k);
    }

    static void solve(boolean[][] board, int row, int col, int knightLeft){
        if(knightLeft == 0){
            dispaly(board);
            System.out.println();
            return;
        }
        if(row == board.length){
            return;
        }
        if(col == board.length){
            solve(board,row+1,0,knightLeft);
            return;
        }

        if(isSafe(board,row,col)){
            board[row][col] = true;
            solve(board,row,col+1,knightLeft-1);
            board[row][col] = false;
        }
        solve(board,row,col+1,knightLeft);
    }

    static boolean isSafe(boolean[][] board, int row, int col){
        int[][] moves = {
                {-1,-2},{-1,2},
                {1,-2},{1,2},
                {2,1},{-2,-1},
                {-2,1},{2,-1}
        };
        int n = board.length;
        for(int[] move:moves){
            int newRow = row + move[0];
            int newCol = col + move[1];
            if(newRow >= 0 && newRow < n && newCol >= 0 && newCol < n){
                if(board[newRow][newCol]){
                    return false;
                }
            }
        }
        return true;
    }

    static void dispaly(boolean[][] board){
        for(boolean[] row:board){
            for(boolean cell:row){
                System.out.print(cell?"K":".");
            }
            System.out.println();
        }
    }
}
