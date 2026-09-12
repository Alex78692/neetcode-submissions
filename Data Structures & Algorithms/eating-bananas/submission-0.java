class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int low = 1;
        int high = 0;
        
        // Find maximum pile
        for (int pile : piles) {
            high = Math.max(high, pile);
        }
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            long totalHours = 0;
            
            for (int pile : piles) {
                // ceil(pile / mid)
                totalHours += (pile + mid - 1) / mid;
            }
            
            if (totalHours <= h) {
                high = mid - 1;  // try smaller speed
            } else {
                low = mid + 1;   // need more speed
            }
        }
        
        return low;
    }
}
