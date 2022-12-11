package Spiral_Matrix_II_59;

public class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];

        int iMin = 0, iMax = n - 1;
        int jMin = 0, jMax = n - 1;
        int num = 1;
        while (num <= n * n) {
            for (int j = jMin; j <= jMax; j++) //➡️
                res[iMin][j] = num++;
            for (int i = iMin + 1; i <= iMax; i++) //⬇️
                res[i][jMax] = num++;
            for (int j = jMax - 1; j >= jMin; j--) //⬅️
                res[iMax][j] = num++;
            for (int i = iMax - 1; i >= iMin + 1; i--) //⬆️
                res[i][jMin] = num++;
            iMin++;
            iMax--;
            jMin++;
            jMax--;
        }

        return res;
    }
}
