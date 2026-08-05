package Striver.DSA.BinarySearch;

public class ShipPackagesWithinDDays {

    public int shipWithinDays(int[] weights, int days) {
        // Lower bound: capacity must be at least the heaviest single package
        int low = 0;
        // Upper bound: capacity could be sum of all packages (1 day scenario)
        int high = 0;

        for (int weight : weights) {
            low = Math.max(low, weight);   // largest single weight
            high += weight;                // total sum
        }

        // Binary search for minimum valid capacity
        while (low < high) {
            int mid = low + (high - low) / 2; // avoid overflow

            if (isFeasible(weights, mid, days)) {
                // mid works, try smaller capacity
                high = mid;
            } else {
                // mid too small, need bigger capacity
                low = mid + 1;
            }
        }

        return low; // low == high here, this is the answer
    }

    // Helper function: check if given capacity can ship all packages within `days`
    private boolean isFeasible(int[] weights, int capacity, int days) {
        int requiredDays = 1;
        int currentLoad = 0;

        for (int weight : weights) {
            if (currentLoad + weight > capacity) {
                // Start a new day
                requiredDays++;
                currentLoad = 0;

                // Edge case: single package heavier than capacity itself
                if (weight > capacity) {
                    return false;
                }
            }
            currentLoad += weight;
        }

        return requiredDays <= days;
    }

    // Driver code to test
    public static void main(String[] args) {
        ShipPackagesWithinDDays solution = new ShipPackagesWithinDDays();

        int[] weights = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int days = 5;

        int result = solution.shipWithinDays(weights, days);
        System.out.println("Minimum ship capacity: " + result); // Output: 15
    }
}