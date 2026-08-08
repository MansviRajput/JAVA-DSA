package Striver.DSA.BinarySearch;

import java.util.Arrays;

public class findPeakElementII {
    public static void main(String[] args) {
        int[][] matrix = {{10, 20, 15},{21, 30, 14},{7, 16, 32}};
        int[][] matrix1 = {{10, 7},{11,17}};
        System.out.println(Arrays.toString(solution(matrix)));
        System.out.println(Arrays.toString(solution1(matrix1)));
    }

    private static int[] solution(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;

        for(int i=0;i< matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                int up = (i > 0) ? matrix[i-1][j] : Integer.MIN_VALUE;
                int down = (i < m-1) ? matrix[i+1][j] : Integer.MIN_VALUE;
                int left = (j > 0) ? matrix[i][j-1] : Integer.MIN_VALUE;
                int right = (j < n-1) ? matrix[i][j+1] : Integer.MIN_VALUE;

                if(matrix[i][j] > up &&
                matrix[i][j] > down &&
                matrix[i][j] > left &&
                matrix[i][j] > right){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }


    private static int[] solution1(int[][] matrix){
        int n = matrix.length;
        int m = matrix[0].length;

        int low=0;
        int high=m-1;

        while(low<=high){
            int mid = low + (high-low)/2;
            int maxRow = findMaxRowInColumn(matrix,mid);
            int val = matrix[maxRow][mid];

            int left = (mid > 0) ? matrix[maxRow][mid-1] : Integer.MIN_VALUE;
            int right = (mid < m-1) ? matrix[maxRow][mid+1] : Integer.MIN_VALUE;

            if(val > left && val > right){
                return new int[]{maxRow,mid};
            }else if(right > val){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return new int[]{-1,-1};
    }

    private static int findMaxRowInColumn(int[][] matrix,int mid){
        int maxRow=0;
        for(int i=1;i<matrix.length;i++){
            if(matrix[i][mid] > matrix[maxRow][mid]){
                maxRow = i;
            }
        }
        return maxRow;
    }
}
