package Striver.DSA.BinarySearch;

public class MinimizeMaxDistance {

    public static void main(String[] args) {
        MinimizeMaxDistance solution = new MinimizeMaxDistance();

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int k = 10;

        double result = solution.minimiseMaxDistance(arr, k);
        System.out.printf("Minimum possible max distance: %.5f%n", result);
        // Output: 0.50000
    }

    public double minimiseMaxDistance(int[] arr, int k) {
        int n = arr.length;

        // Step 1: high ni initial value = sauthi motu gap (biggest gap)
        double low = 0, high = 0;
        for (int i = 0; i < n - 1; i++) {
            high = Math.max(high, arr[i + 1] - arr[i]);
        }

        // Step 2: Binary search on doubles, 1e-6 precision sudhi
        while (high - low > 1e-6) {
            double mid = low + (high - low) / 2;

            if (stationsRequired(arr, mid) <= k) {
                // mid feasible chhe, nanu dist try karo
                high = mid;
            } else {
                // vadhare stations joie, dist vadharo
                low = mid;
            }
        }

        return high; // (or low, banne lagbhag same j hase)
    }

    // Helper: apeela maxDist sathe ketla stations joise
    private int stationsRequired(int[] arr, double maxDist) {
        int totalStations = 0;
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            double gap = arr[i + 1] - arr[i];

            int segments = (int) Math.ceil(gap / maxDist);
            // gap ne maxDist karta nana tukda ma todva ketla tukda joie

            totalStations += (segments - 1);
            // tukda karva mate (tukda - 1) jetla nava stations joie
        }

        return totalStations;
    }


}