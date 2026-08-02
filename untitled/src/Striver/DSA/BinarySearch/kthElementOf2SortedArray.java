package Striver.DSA.BinarySearch;

public class kthElementOf2SortedArray {
    public static void main(String[] args) {
        int[] a = {2, 3, 6, 7, 9};
        int[] b = {1, 4, 8, 10};
        int k = 5;
        System.out.println(solution2(a, b, k));
    }

    // with merge
    private static int solution(int[] a, int[] b, int k) {
        int[] nums = new int[a.length + b.length];
        int i = 0, j = 0, idx = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                nums[idx] = a[i];
                i++;
            } else {
                nums[idx] = b[j];
                j++;
            }
            idx++;
        }
        while (i < a.length) {
            nums[idx] = a[i];
            i++;
            idx++;
        }
        while (j < b.length) {
            nums[idx] = b[j];
            j++;
            idx++;
        }
        return nums[k - 1];
    }

    // without merge
    private static int solution2(int[] a, int[] b, int k) {
        int i = 0, j = 0;
        int n = a.length;
        int m = b.length;
        int count = 0;

        while (i < n && j < m) {

            if (a[i] <= b[j]) {
                count++;
                if (count == k)
                    return a[i];
                i++;
            } else {
                count++;
                if (count == k)
                    return b[j];
                j++;
            }
        }

        while (i < n) {
            count++;
            if (count == k)
                return a[i];
            i++;
        }

        while (j < m) {
            count++;
            if (count == k)
                return b[j];
            j++;
        }
        return -1;
    }
}