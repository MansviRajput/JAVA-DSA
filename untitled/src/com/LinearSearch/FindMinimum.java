
package com.linearSearch;

public class FindMinimum {

    public static void main(String[] args) {
        int[] arr =  {20,3,86,41,17,-4,1,94};
        System.out.println("Minimum Value : " + min(arr));
        System.out.println("Maximum Value : " + max(arr));

    }
    //Assume that array length != 0
    static int min(int[] arr) {
        int min = arr[0];
        for(int i = 0;i < arr.length;i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    static int max(int[] arr) {
        int max = arr[0];
        for(int i = 0;i < arr.length;i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

}
