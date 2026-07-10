class Solution {
    private int n;
    public boolean checkValidGrid(int[][] grid) {
        if(grid[0][0]!=0)
        {
            return false;
        }
        n = grid.length;
        return helper(grid,0,0,1);
        
        
    }

    private int[][] dir = {{2,1},{2,-1},{-2,1},{-2,-1},{1,2},{1,-2},{-1,2},{-1,-2}};

    public boolean helper(int[][] grid,int i, int j, int move)
    {
        for(int[] d: dir)
        {
            int newI = i+d[0];
            int newJ = j+d[1];

            if(newI>=0 && newJ >=0 && newI<n && newJ<n && grid[newI][newJ]==move )
            {
                return helper(grid,newI,newJ,move+1);
            }
        }

        return move== n*n;
    }
}