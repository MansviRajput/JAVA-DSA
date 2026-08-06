package Striver.DSA.BinarySearch;

public class paintersPartition {
    public static void main(String[] args) {
        int[] c = {1, 8, 11, 3};
        int a = 10;     //painters
        int b = 1;      //time to paint 1 unit of board

        System.out.println(solution(a,b,c));
    }

    private static int solution(int a, int b, int[] c) {
        int n = c.length;
        final int MOD = 10000003;

        long low=0,high=0;
        for(int num : c){
            low = Math.max(low,num);
            high+=num;
        }
        while(low<high){
            long mid=low+(high-low)/2;
            if(painterRequired(c,mid) <= a){
                high=mid;
            }else{
                low=mid+1;
            }
        }
        long maxLength = low;
        long time = (maxLength % MOD) * (b % MOD) % MOD;
        return (int) time;
    }

    private static int painterRequired(int[] c,long mid){
        int painter=1;
        int current=0;
        for(int num : c){
            if(current + num > mid){
                painter++;
                current=0;
            }
            current+=num;
        }
        return painter;
    }
}
