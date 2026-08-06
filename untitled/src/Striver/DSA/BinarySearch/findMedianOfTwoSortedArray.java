package Striver.DSA.BinarySearch;

public class findMedianOfTwoSortedArray {
    public static void main(String[] args) {
        int[] num1 = {2, 4, 6};
        int[] num2 = {1, 3, 5};
        System.out.println(solution(num1,num2));
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
