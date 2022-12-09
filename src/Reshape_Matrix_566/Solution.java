package Reshape_Matrix_566;

public class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n = mat.length, m = mat[0].length;
        if (m * n != r * c)
            return mat;
        int[][] res = new int[r][c];
        int x = 0, y = 0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++) {
                res[x][y] = mat[i][j];
                if (y + 1 < c) {
                    y++;
                } else {
                    y = 0;
                    x++;
                }
            }

        return res;
    }
}
