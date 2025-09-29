
// t.c = 0ms, beat -> 100%

// Optimization  O(M∗N)

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        int srow = 0, scol = 0, erow = matrix.length-1, ecol = matrix[0].length-1;

        List<Integer> list = new ArrayList<>();

        while(srow <= erow && scol <= ecol) {

            // left to right
            for(int i = scol; i <= ecol; i++) {
                list.add(matrix[srow][i]);
            }

            // right to down
            for(int i = srow+1; i <= erow; i++) {
                list.add(matrix[i][ecol]);
            }

            // down to right
            for(int i = ecol-1; i >= scol; i--) {
                if(srow == erow) break;
                list.add(matrix[erow][i]);
            }

            // down to up
            for(int i = erow-1; i > srow; i--) {
                if(scol == ecol) break;
                list.add(matrix[i][scol]);
            }
            srow++;
            scol++;
            erow--;
            ecol--;
        }
        return list;
    }
}
