class Solution {
    public int uniquePathsIII(int[][] grid) {
        int startCol = 0;
        int startRow = 0;
        int emptyCells = 0;

        // Find the starting point and count all the non obstacles
        for(int row = 0; row<grid.length;row++)
        {
            for(int col =0; col<grid[0].length;col++)
            {
                if(grid[row][col]==1)
                {
                    startRow = row;
                    startCol = col;
                }

                if(grid[row][col]!=-1)
                {
                    emptyCells++;
                }

            }
        }
        return backtrack(grid,startRow,startCol,emptyCells);
        
    }

    public int backtrack(int[][] grid, int row, int col, int remaining)
    {
        // Base case
        if(grid[row][col]==2)
        {
            if(remaining == 1)

            {
                return 1;
            }
            return 0;
        }

        // Mark cells as visited
        grid[row][col] = -1;
        remaining --;

        int count = 0;
        // UP
        if(row - 1 >=0 && grid[row-1][col]!=-1)
        {
            count += backtrack(grid, row - 1, col, remaining);
        }
        // DOWN
        if(row+1<grid.length && grid[row+1][col]!=-1)
        {
            count += backtrack(grid, row + 1, col, remaining);
        }

        //LEFT
        if(col-1 >= 0&& grid[row][col-1]!=-1)
        {
            count += backtrack(grid, row, col-1, remaining);
        }

        // RIGHT
        if(col+1 < grid[0].length && grid[row][col+1] != -1)
        {
            count += backtrack(grid, row, col+1, remaining);
        }
        // backtrack
        grid[row][col] = 0;
        return count;
    }
}