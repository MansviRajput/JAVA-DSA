package Striver.DSA.BinarySearch;

public class kokoEatingBananas {
    public static void main(String[] args) {

    }

    private static int solution1(int[] nums,int h){
        int low = 1;
        int high = 0;

        for (int pile : nums) {
            high = Math.max(high, pile);
        }

        int answer = high;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            int requiredHours = totalHours(nums, mid);

            if (requiredHours <= h) {
                answer = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return answer;
    }

    private static int totalHours(int[] nums, int k) {
        int hours = 0;

        for (int pile : nums) {
            hours += (pile + k - 1) / k;
        }

        return hours;
    }
}
