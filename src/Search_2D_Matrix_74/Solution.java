package Search_2D_Matrix_74;

public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = findRow(matrix, target, 0, matrix.length - 1);
        if (row == -1)
            return false;
        return findCol(matrix[row], target, 0, matrix[0].length - 1);
    }

    private boolean findCol(int[] matrix, int target, int start, int end) {
        if (start > end)
            return false;
        if (matrix[start] == target)
            return true;
        if (matrix[end] == target)
            return true;
        int mid = start + (end - start) / 2;
        if (matrix[mid] == target)
            return true;
        return (matrix[mid] < target)
                ? findCol(matrix, target, mid + 1, end)
                : findCol(matrix, target, start, mid - 1);
    }

    private int findRow(int[][] matrix, int target, int start, int end) {
        if (start > end)
            return -1;
        if (inRange(matrix[start], target))
            return start;
        if (inRange(matrix[end], target))
            return end;
        int mid = start + (end - start) / 2;
        if (inRange(matrix[mid], target))
            return mid;
        return (target < matrix[mid][0])
                ? findRow(matrix, target, start, mid - 1)
                : findRow(matrix, target, mid + 1, end);
    }

    private boolean inRange(int[] row, int target) {
        return row[0] <= target && target <= row[row.length - 1];
    }
}
