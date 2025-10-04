
// In summary:
// - Time complexity: O(M * N * 4^L)
// - Space complexity: O(L)

class Solution {
    public boolean exist(char[][] board, String word) {
        
        int n = board.length;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < board[i].length; j++) {

                if(dfs(board, word, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean dfs(char[][] board, String word, int r , int c, int index) {

        if(index == word.length()) return true;

        if(r < 0 || c < 0 || r >= board.length || c >= board[0].length || board[r][c] != word.charAt(index)) {
            return false;
        }

        char temp = board[r][c];
        board[r][c] = '#';

        boolean found = dfs(board, word, r, c+1, index+1) ||
                        dfs(board, word, r, c-1, index+1) ||
                        dfs(board, word, r+1, c, index+1) ||
                        dfs(board, word, r-1, c, index+1);

        board[r][c] = temp;

        return found;
    }
}
