package Striver.DSA.BinarySearch;

public class kthElementOf2SortedArray {
    public static void main(String[] args) {
        int[] a = {100, 112, 256, 349, 770};
        int[] b = {72, 86, 113, 119, 265, 445, 892};
        int k = 7;
//        System.out.println(solution2(a, b, k));
        System.out.println(kthElement(a,b,k));
    }

    //with binary search
    private static int kthElement(int[] arr1, int[] arr2,int k) {
        int m = arr1.length;
        int n = arr2.length;

        if(m > n){
            return kthElement(arr2,arr1,k);
        }

        int low=Math.max(0,k-n);
        int high=Math.min(k,m);

        while(low<=high){
            int x = low + (high-low)/2;
            int y = k-x;

            //boundary case
            int arr1Left = (x == 0) ? Integer.MIN_VALUE : arr1[x-1];
            int arr1Right = (x == m) ? Integer.MAX_VALUE : arr1[x];
            int arr2Left = (y == 0) ? Integer.MIN_VALUE : arr2[y-1];
            int arr2Right = (y == n) ? Integer.MAX_VALUE : arr2[y];

            if(arr1Left <= arr2Right && arr2Left <= arr1Right){
                return Math.max(arr1Left, arr2Left);
            }else if(arr1Left > arr2Right){
                high = x - 1;
            }else{
                low = x + 1;
            }
        }
        return -1;
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