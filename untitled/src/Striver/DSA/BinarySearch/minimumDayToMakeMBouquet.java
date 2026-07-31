package Striver.DSA.BinarySearch;

class minimumDayToMakeMBouquet {

    public static void main(String[] args) {
        int roses = 8;
        int[] nums = {7, 7, 7, 7, 13, 11, 12, 7};
        int bouquet = 2;
        int flowerInBouquet = 3;
        System.out.println(roseGarden(roses,nums,flowerInBouquet,bouquet));
    }

    private static int roseGarden(int n, int[] nums, int k, int m) {

        // Not enough roses
        if ((long) m * k > n) {
            return -1;
        }

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        // Find minimum and maximum bloom day
        for (int day : nums) {
            low = Math.min(low, day);
            high = Math.max(high, day);
        }

        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canMake(nums, m, k, mid)) {
                ans = mid;
                high = mid - 1; // Try to find a smaller day
            } else {
                low = mid + 1; // Need more days
            }
        }

        return ans;
    }

    private static boolean canMake(int[] nums, int m, int k, int day) {

        int flowers = 0;
        int bouquets = 0;

        for (int bloomDay : nums) {

            if (bloomDay <= day) {
                flowers++;
            } else {
                bouquets += flowers / k;
                flowers = 0;
            }
        }

        // Count the last consecutive group
        bouquets += flowers / k;

        return bouquets >= m;
    }
}