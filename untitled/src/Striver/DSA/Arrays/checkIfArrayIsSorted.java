package Striver.DSA.Arrays;

public class checkIfArrayIsSorted {
    public static void main(String[] args) {
//        int[] nums = {1, 2, 1, 4, 5};
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(checkIfArrayIsSorted(nums));
    }

    private static boolean checkIfArrayIsSorted(int[] arr){
        if(arr.length<2){
            return true;
        }
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
}
