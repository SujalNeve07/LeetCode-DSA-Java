class Solution {
    public int lastRemaining(int n) {
    
        return solve(n,true);
        
    }

    public int solve(int n, boolean left)
    {
        if(n==1)
        {
            return 1;
        }

        if(left || n%2==1)
        {
            return 2*solve(n/2,!left);
        }

        else
        {
            return 2*solve(n/2,!left)-1;
        }
    }
}