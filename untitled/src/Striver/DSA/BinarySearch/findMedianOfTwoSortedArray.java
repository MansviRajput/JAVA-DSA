package Striver.DSA.BinarySearch;

public class findMedianOfTwoSortedArray {
    public static void main(String[] args) {
        int[] num1 = {2, 4, 5};
        int[] num2 = {1, 6};
        System.out.println(solution1(num1,num2));
    }

    private static double solution1(int[] num1,int[] num2){
        int m = num1.length;
        int n = num2.length;

        if(m > n){
            return solution1(num2,num1);
        }

        int low=0,high=m;
        int totalLeft=(m+n+1)/2;

        while(low<=high){
            int x = low  + (high-low)/2;
            int y = totalLeft - x;

            //boundary case
            int num1Left = (x == 0) ? Integer.MIN_VALUE : num1[x-1];
            int num1Right = (x == m) ? Integer.MAX_VALUE : num1[x];
            int num2Left = (y == 0) ? Integer.MIN_VALUE : num2[y-1];
            int num2Right = (y == n) ? Integer.MAX_VALUE : num2[y];

            if(num1Left <= num2Right && num2Left <= num1Right){
                if((m+n)%2 == 0){
                    double maxLeft = Math.max(num1Left, num2Left);
                    double minRight = Math.min(num1Right, num2Right);
                    return (maxLeft + minRight) / 2.0;
                }else{
                    return Math.max(num1Left, num2Left);
                }
            }else if(num1Left > num2Right){     // x is greater
                high = x - 1;
            }else{                              // x is too low
                low = x + 1;
            }
        }
        return -1;
    }

    private static double solution(int[] num1, int[] num2) {

        int[] ans = new int[num1.length + num2.length];

        int i = 0, j = 0, k = 0;

        while (i < num1.length && j < num2.length) {
            if (num1[i] <= num2[j]) {
                ans[k++] = num1[i++];
            } else {
                ans[k++] = num2[j++];
            }
        }

        while (i < num1.length)
            ans[k++] = num1[i++];

        while (j < num2.length)
            ans[k++] = num2[j++];

        int n = ans.length;

        if (n % 2 == 0)
            return (ans[n/2 - 1] + ans[n/2]) / 2.0;

        return ans[n/2];
    }
}
