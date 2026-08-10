class Solution {
    public int shipWithinDays(int[] weights, int days) {

        long low = 0;
        long high = 0;
        for(int weight:weights)
        {
            low = Math.max(low,(long)weight);
            high += weight;
        }
        long ans = high;
        while(low<=high)
        {
            long mid = low+(high-low)/2;
            if(canShip(weights,days,mid))
            {
                ans = mid;
                high = mid-1;
            }
            else
            {
                low = mid+1;
            }
        }
 return (int) ans;
    }


    static boolean canShip(int[] weights, int days, long capacity)
    {
        long currentWeight = 0;
        int requiredDays = 1;
        for(int weight:weights)
        {
            if(currentWeight+weight>capacity)
            {
                requiredDays++;
                currentWeight = weight;
            }
            else
            {
                currentWeight += weight;
            }
            if(requiredDays > days)
            {
                return false;
            }
        }
        return true;
    }
}