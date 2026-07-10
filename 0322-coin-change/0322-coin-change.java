class Solution {
    public int coinChange(int[] coins, int amount) {

        if(amount<1)
        {
            return 0;
        }

        // create a dp array of size amount+1
        int[] minCoinsdp = new int[amount+1];

        for(int i=1; i<=amount;i++)
        {
            minCoinsdp[i] = Integer.MAX_VALUE;

            for(int coin:coins)
            {
                if(coin<=i && minCoinsdp[i-coin] != Integer.MAX_VALUE)
                {
                    minCoinsdp[i] = Math.min(minCoinsdp[i],1+minCoinsdp[i-coin]);
                }
            }
        }

        return minCoinsdp[amount] > amount ? -1 : minCoinsdp[amount];

        
    }
}