package Striver.DSA.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class unionTwoSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {3, 4, 6, 7, 9, 9};
        int[] nums2 = {1, 5, 7, 8, 8};

        System.out.println(Arrays.toString(solution(nums1,nums2)));

    }

    private static int[] solution(int[] nums1,int[] nums2){
        ArrayList<Integer> list=new ArrayList<>();

        int i=0;
        int j=0;
        while(i<nums1.length&&j<nums2.length){
            if(nums1[i]==nums2[j]){
                if(list.isEmpty() || list.get(list.size() - 1) != nums1[i]){
                    list.add(nums1[i]);
                }
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j]){
                if(list.isEmpty() || list.get(list.size() - 1) != nums1[i]){
                    list.add(nums1[i]);
                }
                i++;
            }
            else if(nums1[i]>nums2[j]){
                if(list.isEmpty() || list.get(list.size() - 1) != nums2[j]){
                    list.add(nums2[j]);
                }
                j++;
            }
        }

        while(i<nums1.length){
            if(list.isEmpty() || list.get(list.size() - 1) != nums1[i]){
                list.add(nums1[i]);
            }
            i++;
        }
        while(j<nums2.length){
            if(list.isEmpty() || list.get(list.size() - 1) != nums2[j]){
                list.add(nums2[j]);
            }
            j++;
        }

        int[] nums =  new int[list.size()];
        for(int k=0;k<list.size();k++){
            nums[k]=list.get(k);
        }

        return nums;
    }
}
