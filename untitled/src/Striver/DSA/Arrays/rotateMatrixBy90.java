package Striver.DSA.Arrays;

import java.util.Arrays;

public class rotateMatrixBy90 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
//        solution(matrix);
        System.out.println(Arrays.deepToString(solution1(matrix)));
    }


    private static void solution(int[][] matrix) {
        int n = matrix.length;

        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int k = 0; k < n; k++){
            int left=0,right=n-1;
            while(left<right){
                int temp = matrix[k][left];
                matrix[k][left] = matrix[k][right];
                matrix[k][right] = temp;
                left++;
                right--;
            }
        }
    }

    private static int[][] solution1(int[][] matrix){
        int n = matrix.length;

        int[][] transpose = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                transpose[j][n-i-1] = matrix[i][j];
            }
        }
        return transpose;
    }
}
