package Set_Matrix_Zeroes_73;

public class Solution {
    private int m, n;
    private boolean[][] visited;

    public void setZeroes(int[][] matrix) {
        m = matrix.length;
        n = matrix[0].length;
        this.visited = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    fillRow(i);
                    break;
                }
            }
        }
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                if (matrix[i][j] == 0) {
                    fillCol(j);
                    break;
                }
            }
        }

        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                if (this.visited[i][j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    private void fillCol(int j) {
        for (int i = 0; i < m; i++) {
            visited[i][j] = true;
        }
    }

    private void fillRow(int i) {
        for (int j = 0; j < n; j++) {
            visited[i][j] = true;
        }
    }
}