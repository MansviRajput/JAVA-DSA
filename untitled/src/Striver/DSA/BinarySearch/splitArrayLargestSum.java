package Striver.DSA.BinarySearch;

public class splitArrayLargestSum {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int k = 3;
        System.out.println(solution(nums,k));
    }

    private static boolean canSplit(int[] nums,int k,int maxSum){
        int parts=1;
        int currSum = 0;
        for(int num:nums){
            if(currSum+num<=maxSum){
                currSum+=num;
            }else{
                parts++;
                currSum=num;
            }
        }
        return parts<=k;
    }

    private static int solution(int[] nums, int k){
        int low = 0;
        int high = 0;
        for(int num : nums){
            low = Math.max(low,num);
            high += num;
        }

        while(low<high){
            int mid = low + (high-low)/2;
            if(canSplit(nums,k,mid)){
                high = mid;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
}
