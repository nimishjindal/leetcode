package Unique_Paths_62;

public class Solution {

    private int m, n;

    private int[][] visited;

    public int uniquePaths(int m, int n) {
        this.m = m;
        this.n = n;
        visited = new int[m][n];
        visited[m - 1][n - 1] = 1;
        return numPaths(0, 0);
    }

    private int numPaths(int i, int j) {
        if (i >= m || j >= n)
            return 0;
        if (visited[i][j] != 0)
            return visited[i][j];

        int down = numPaths(i + 1, j);
        if (down != 0)
            visited[i + 1][j] = down;

        int right = numPaths(i, j + 1);
        if (right != 0)
            visited[i][j + 1] = right;

        return down + right;
    }
}