package Striver.DSA.Arrays;

public class findNthRootOfNumber {
    public static void main(String[] args) {
        int n = 4;
        int m = 81;
        System.out.println(solution1(n,m));
    }

    private static int solution1(int n,int m){
        int low=1;
        int high=m;
        while(low<=high){
            int mid=low+(high-low)/2;

            long value = power(mid,n,m);

            if(value == m){
                return mid;
            }else if(value < m){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return -1;
    }

    private static long power(int base,int exp,int limit){
        long ans=1;
        for(int i=0;i<exp;i++){
            ans*=base;
            if(ans > limit){
                return ans;
            }
        }
        return ans;
    }

    private static int solution(int n,int m){
        int low = 1;
        int high = m;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(Math.pow(mid,n) > m){
                high = mid - 1;
            }else if(Math.pow(mid,n) < m){
                low = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
