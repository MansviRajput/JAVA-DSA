package com.LeetCode;

class leet73 {

    public static void main(String[] args) {
        int[][] matrix = { {1,1,1},{1,0,1},{1,1,1}};
        setZeroes(matrix);
        displayMatrix(matrix);

    }

    private static void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j] == 0){
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        for(int i = 0; i < m; i++){
            if(row[i] == true){
                for(int j = 0; j < n; j++){
                    matrix[i][j] = 0;
                }
            }
        }

        for(int j = 0; j < n; j++){
            if(col[j] == true){
                for(int i = 0; i < m; i++){
                    matrix[i][j] = 0;
                }
            }
        }

    }

    private static void displayMatrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
        }
    }
}