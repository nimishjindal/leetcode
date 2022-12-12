package search_2D_Matrix_240;

public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int i = 0, j = n - 1;
        while (i < m && j >= 0) {
            int cur = matrix[i][j];
            if (cur == target)
                return true;
            if (cur > target)
                j--;
            else
                i++;
        }
        return false;
    }
}
