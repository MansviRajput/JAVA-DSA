package Striver.DSA.BinarySearch;

public class findRowWithMaximum1s {
    public static void main(String[] args) {
        int[][] mat = {{0, 0, 1},{0, 0, 1},{0, 1, 1}};
        System.out.println(solution(mat));
        System.out.println(solution1(mat));
        System.out.println(solution2(mat));
    }

    private static int solution2(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;

        int row=0;
        int col=cols-1;

        int rowIdx=-1;

        while(row<rows && col>=0){
            if(matrix[row][col] == 1){
                rowIdx=row;
                col--;
            }else{
                row++;
            }
        }
        return rowIdx;
    }

    //binary search
    private static int solution1(int[][] matrix){
        int maxCount=0;
        int idx=-1;
        int cols = matrix[0].length;
        for(int i=0;i<matrix.length;i++){
            int firstCount = lowerBound(matrix[i],1);
            int totalCount = cols - firstCount;
            if(totalCount > maxCount){
                maxCount = totalCount;
                idx = i;
            }
        }
        return idx;
    }

    private static int lowerBound(int[] row,int target){
        int low=0;
        int high= row.length-1;
        int ans = row.length;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(row[mid] == target){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }

    //brute force
    private static int solution(int[][] matrix){

        int max = 0;
        int idx = 0;
        for(int i=0;i< matrix.length;i++){
            int count=0;
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == 1){
                    count++;
                }
            }
            if(count > max){
                idx = i;
                max = count;
            }
        }
        return idx;
    }
}
