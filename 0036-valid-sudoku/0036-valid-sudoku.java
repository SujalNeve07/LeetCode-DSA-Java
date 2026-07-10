class Solution {
    public static boolean checkRow(char[] row)
  {
    boolean[] found = new boolean[10];
    for(int i=0;i<9;i++)
    {
      char c = row[i];
      if(c=='.')
      {
        continue;
      }

      int digit = c-'0';
      if(found[digit])
      {
        return false;
      }

      found[digit] = true;
    }
    return true;
  }
  
  public static boolean checkCol(char[][] board, int j)
  {
    boolean[] found = new boolean[10];

    for(int i=0; i<9; i++)
    {
      char c = board[i][j];
      if(c=='.')
      {
        continue;
      }

      int digit = c-'0';
      if(found[digit])
      {
        return false;
      }

      found[digit] = true;
    }
    return true;
  }

  public static boolean checkBox(char[][] board,int boxNum)

  {
   int i= 3*(boxNum/3);
   int j= 3*(boxNum%3);
    boolean[] found = new boolean[10];
    for(int a=i; a<(i+3);a++)
    {

      for(int b=j;b<(j+3);b++)
      {

        char c = board[a][b];
      if(c=='.')
      {
        continue;
      }

      int digit = c-'0';
      if(found[digit])
      {
        return false;
      }

      found[digit] = true;
    }
    }
    return true;
  }
    public boolean isValidSudoku(char[][] board) {

        // check rows
    for(int i=0; i<9;i++)
    {
      if( !checkRow(board[i]))
      {
        return false;
      }
    }

    // check colums
    for(int j=0; j<9;j++)
    {
      if( !checkCol(board,j))
      {
        return false;
      }
    }

    // Check boxes
    for(int boxNum=0; boxNum<9;boxNum++)
    {
      if( !checkBox(board,boxNum))
      {
        return false;
      }

    }

    return true;
        
    }
}