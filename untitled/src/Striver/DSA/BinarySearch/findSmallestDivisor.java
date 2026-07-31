package Striver.DSA.BinarySearch;

public class findSmallestDivisor {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int limit = 8;
        System.out.println(solution1(nums,limit));
    }

    private static int solution1(int[] nums,int limit){
        int low = 1;
        int high = 0;
        for(int num:nums){
            high=Math.max(high,num);
        }
        int ans=high;
        while(low<=high){
            int mid=low+(high-low)/2;
            int sum = 0;
            for(int num:nums){
                sum += (num+mid-1)/mid;
            }
            if(sum <= limit){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }

    private static int solution(int[] nums,int limit){
        int max=0;
        for(int num:nums){
            max = Math.max(max,num);
        }
        for(int divisor=1;divisor<=max;divisor++){
            int sum = 0;
            for(int num:nums){
                sum+=(num+divisor-1)/divisor;
            }
            if(sum<=limit){
                return divisor;
            }
        }
        return -1;
    }
}
