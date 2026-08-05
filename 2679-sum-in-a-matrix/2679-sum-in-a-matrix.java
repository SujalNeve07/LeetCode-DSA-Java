class Solution {
    public int matrixSum(int[][] nums) {
        int m = nums.length;
        int n = nums[0].length;
        for(int i=0; i<m;i++)
        {
            Arrays.sort(nums[i]);
        }
        int ans = 0;
        for(int j=n-1; j>=0;j--)
        {
            int max = 0;
            for(int i=0; i<m; i++)
            {
               max = Math.max(max,nums[i][j]);
            }
            ans += max;
        }
        return ans;
        
    }
}