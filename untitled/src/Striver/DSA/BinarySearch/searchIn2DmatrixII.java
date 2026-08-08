package Striver.DSA.BinarySearch;

public class searchIn2DmatrixII {
    public static void main(String[] args) {
        int[][] mat = {{1, 4, 7, 11, 15},{2, 5, 8, 12, 19},{3, 6, 9, 16, 22},{10, 13, 14, 17, 24},{18, 21, 23, 26, 30}};
        int target = 5;
        System.out.println(solution(mat,target));
    }

    private static boolean solution(int[][] mat,int target){
        int rows= mat.length;;
        int cols=mat[0].length;

        int row=0;
        int col=cols-1;

        while(row<rows && col>=0){
            if(mat[row][col] > target){
                col--;
            }else if(mat[row][col] < target){
                row++;
            }else{
                return true;
            }
        }
        return false;
    }
}
