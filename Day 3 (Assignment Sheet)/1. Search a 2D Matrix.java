
// Brute force O(N)

// t.c = 0ms  , beat -> 100%

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {

                if(matrix[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }
}


// Using Binary search O(logN)

// t.c = 0ms , beat -> 100%

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int row = matrix.length-1;
        int col = 0;

        while(row >= 0 && col < matrix[0].length) {

            if(matrix[row][col] == target) {
                return true;
            }

            else if(matrix[row][col] > target) {
                row--;
            }
            else {
                col++;
            }
        }
        return false;
    }
}
