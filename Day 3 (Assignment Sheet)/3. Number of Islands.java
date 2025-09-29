
// t.c = 3 ms Beats 84.37%

class Solution {
    public int numIslands(char[][] grid) {
        
        int count = 0;

        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {

                if(grid[i][j] == '1') {
                    count++;

                    clear(grid, i, j);
                }
            }
        }
        return count;
    }

    // clear the one's
    public void clear(char[][] grid, int row, int col) {

        if(row < 0 || col < 0 || row >= grid.length || col >= grid[0].length || grid[row][col] == '0') return;

        grid[row][col] = '0';

        clear(grid, row, col+1);
        clear(grid, row, col-1);
        clear(grid, row+1, col);
        clear(grid, row-1, col);
    }
}
