class Solution {
    public int minDays(int[] bloomDay, int m, int k) {

         // Total flowers required
        if ((long) m * k > bloomDay.length) {
            return -1;
        }

        int low = 1;
        int high = 0;

        // Find maximum bloom day
        for (int day : bloomDay) {
            high = Math.max(high, day);
        }

        // Binary Search
        while (low < high) {

            int mid = low + (high - low) / 2;

            if (isPossible(bloomDay, m, k, mid)) {
                high = mid;       // Try smaller day
            } else {
                low = mid + 1;    // Need more days
            }
        }

        return low;
        
    }
     public boolean isPossible(int[] bloomDay, int m, int k, int day) {

        int flowers = 0;
        int bouquets = 0;

        for (int i = 0; i < bloomDay.length; i++) {

            if (bloomDay[i] <= day) {
                flowers++;

                // k consecutive flowers
                if (flowers == k) {
                    bouquets++;
                    flowers = 0;
                }

            } else {
                // Consecutive sequence breaks
                flowers = 0;
            }

            if(bouquets>=m)
            {
                return true;
            }
        }

        return false;
    }
}