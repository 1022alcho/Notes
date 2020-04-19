class NumberOfIslands {
    private  int y;
    private  int x;
    
    public static void main(String[] args) {
        System.out.println(numIslands(
    }
    
    [["1","1","1","1","0"],["1","1","0","1","0"],["1","1","0","0","0"],["0","0","0","0","0"]]
    
    public  int numIslands(char[][] grid) {
        y = grid.length;
        if(y == 0) return 0;
        x = grid[0].length;
        int count = 0;
        for(int i = 0; i < y; i++)
        {
            for(int j = 0; j < x; j++)
            {
                if(grid[i][j] != '0')
                {
                    dfs(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }
    
    private void dfs(char[][] grid, int r, int c)
    {
        if(r < 0 || c < 0 || r >= y || c >= x || grid[r][c] == '0') return;
        else
        {
            grid[r][c] = '0';
            dfs(grid, r+1,c);
            dfs(grid, r-1,c);
            dfs(grid, r, c+1);
            dfs(grid, r, c-1);
        }
    }
    
}