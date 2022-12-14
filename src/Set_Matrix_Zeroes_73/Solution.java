package Set_Matrix_Zeroes_73;

public class Solution {

    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        boolean[] isZeroCol = new boolean[n];
        boolean[] isZeroRow = new boolean[m];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                if (matrix[i][j] == 0) {
                    isZeroCol[i] = true;
                    isZeroRow[j] = true;
                }

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                if (isZeroCol[i] || isZeroRow[j])
                    matrix[i][j] = 0;
    }
}