package Rotate_Image_48;

public class Solution {
    public void rotate(int[][] matrix) {
        int m = matrix.length - 1;
        int start = 0;
        int end = m;
        while (start < end) {
            for (int i = 0; i <= m; i++) {
                int temp = matrix[start][i];
                matrix[start][i] = matrix[end][i];
                matrix[end][i] = temp;
            }
            start++;
            end--;
        }
        for (int i = 0; i <= m; i++)
            for (int j = 0; j <= i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
    }
}
