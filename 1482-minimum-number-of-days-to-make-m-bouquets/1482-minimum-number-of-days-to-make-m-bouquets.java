class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        long required = (long) m*k;
        if(required>bloomDay.length)
        {
            return -1;
        }

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        for(int x: bloomDay)
        {
            low = Math.min(low,x);
            high = Math.max(high,x);
        }

        // Binary Search
        while(low<high)
        {
            int mid = low + (high-low)/2;
            if(canMake(bloomDay,m,k,mid))
            {
                high = mid;
            }
            else
            {
                low = mid+1;
            }
        }
        return low;
        
    }

    public boolean canMake(int[] bloomDay, int m, int k,int day)
    {
        int flowers = 0;
        int bouquets = 0;
        for(int x: bloomDay)
        {
            if(x<=day)
            {
                flowers++;
                if(flowers==k)
                {
                    bouquets++;
                    flowers = 0;
                }
            }
            else
            {
                flowers = 0;
            }
        }
        return bouquets >=m;
    }
}