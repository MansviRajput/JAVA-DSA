package Striver.DSA.BinarySearch;

public class findSquareRootOfNumber {
    public static void main(String[] args) {
        int n = 28;
        System.out.println(solution2(n));
    }

    private static int solution2(int n){
        if(n<2){
            return n;
        }
        int start=1,end=n;
        int ans=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            if((long)mid*mid<=n){
                ans=mid;
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return ans;
    }

    private static int solution1(int n){
        int i = 0;
        while ((long)(i + 1) * (i + 1) <= n) {
            i++;
        }
        return i;
    }

    private static int solution(int n){
        int x = (int)Math.floor(Math.sqrt(n));
        return x;
    }
}
