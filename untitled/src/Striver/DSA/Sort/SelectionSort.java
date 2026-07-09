package Striver.DSA.Sort;

// selection sort is about comparing two element from each o


import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {64, 25, 12, 22, 11};
        System.out.println(Arrays.toString(selectionSort(nums)));
    }

    private static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if(min != i){
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
        return arr;
    }
}
