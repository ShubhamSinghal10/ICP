

class Solution {
    public int uniquePaths(int m, int n) {
        
        int[][] grid = new int[m][n];
        for(int i = 0; i < m; i++) {
            Arrays.fill(grid[i],-1);
        }

        return(path(grid, 0, 0));
    }

    public int path(int[][] grid, int row, int col) {

        if(row == grid.length-1 && col == grid[0].length-1) {
            return 1;
        }
        if(row >= grid.length || col >= grid[0].length) return 0;

        if(grid[row][col] != -1) {
            return grid[row][col];
        }

        int down = path(grid, row+1, col);

        int right = path(grid, row, col+1);

        grid[row][col] = down+right;

        return grid[row][col];
    }
}
