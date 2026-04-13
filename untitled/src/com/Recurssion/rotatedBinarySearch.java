package com.Recurssion;

//return the index of rotated binary search in array here that are lot of case let understand,
//{5,6,7,8,9,1,2,3} search -> 7,1,9
//s<=mid -> if(target>=arr[s] && target<=arr[mid]) e = mid -1;
//            else  -> s = mid + 1;
//if(target>=arr[mid] && target<=arr[end]) -> s = mid + 1;
//else -> e = mid - 1;

//for 7,
//s = 0 e = 7 mid = 3  arr[mid](8) != target(7)
//s<=mid(0<=3) -> if(target>=arr[s](7>5) && target<=arr[mid](7<8)) e = mid -1(2);   -> recurssion now s= 0 but e= 2 mid = 1
//arr[mid](6) != target(7)
//(0<=2) -> 7>5 && 7<=6 fails -> s = mid + 1 -> recurssion now s= 1 but e= 2 mid = 1
//arr[mid](6) != target(7)
//(1<=2) -> 7>6 && 7<=6 fails -> s = mid+1 -> recurssion now s= 2 but e= 2 mid = 2
//arr[mid](7) == target(7) return mid index no.




public class rotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3};
        int target01 = search(arr,0,7,0, arr.length-1);
        int target02 = search(arr,0,1,0, arr.length-1);
        int target03 = search(arr,0,9,0, arr.length-1);
        System.out.println(target01);
        System.out.println(target02);
        System.out.println(target03);
    }

    static int search(int[] arr,int index,int target,int s,int e){
        if(s>e){
            return -1;
        }
        int mid = s + (e-s)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[s] <= arr[mid]){
            if(target <= arr[mid] && target >= arr[s]){
                return search(arr,index,target,s,mid-1);
            }
            else{
                return search(arr,index,target,mid+1,e);
            }
        }
        if(target >= arr[mid] && target <= arr[e]){
            return search(arr,index,target,mid+1,e);
        }
        return search(arr,index,target,s,mid-1);
    }

}
