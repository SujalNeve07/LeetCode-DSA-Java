class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minWindow = Integer.MAX_VALUE;
        int currSum = 0;

        int low = 0;
        int high = 0;
        while(high<nums.length)
        {
            // Find the current sum and increase the window size

            currSum += nums[high];
            high++;
            
            // Trying to reduce window size
            while(currSum >= target)
            {
                int currWindow = high-low;

                // update the minimum length window
                minWindow = Math.min(minWindow,currWindow);

                // If sum is greater we will try to reduce the sum and remove the elements from the beginning

                currSum -= nums[low];
                low++;
            }
        }

         
        return minWindow  == Integer.MAX_VALUE ? 0 : minWindow;
    }
}