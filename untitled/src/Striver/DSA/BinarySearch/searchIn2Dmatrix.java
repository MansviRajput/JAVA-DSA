package Striver.DSA.BinarySearch;

public class searchIn2Dmatrix {

    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3, 4},{5, 6, 7, 8},{9, 10, 11, 12}};
        int target = 8;
        System.out.println(searchMatrix(mat,target));
    }


    private static boolean searchMatrix(int[][] mat, int target) {
        int rows = mat.length;
        int cols = mat[0].length;

        int start=0;
        int end = rows*cols-1;

        while(start<=end){
            int mid = start+(end-start)/2;
            int row = mid/cols;
            int col = mid%cols;
            if(mat[row][col] == target){
                return true;
            }else if(mat[row][col] < target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return false;
    }
}
