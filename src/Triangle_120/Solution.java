package Triangle_120;

import java.util.List;

public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int height = triangle.size();
        int[][] dp = new int[height][height];

        for (int i = 0; i < height; i++)
            dp[height - 1][i] = triangle.get(height - 1).get(i);

        for (int i = height - 2; i >= 0; i--)
            for (int j = i; j >= 0; j--) {
                int d = dp[i + 1][j];
                int dr = dp[i + 1][j + 1];
                dp[i][j] = triangle.get(i).get(j) + Math.min(d, dr);
            }
        return dp[0][0];
    }

    public int minimumTotalHelper(int i, int j, int height, List<List<Integer>> triangle, int[][] dp) {
        if (i == height - 1)
            return triangle.get(i).get(j);
        if (dp[i][j] != -1)
            return dp[i][j];
        int d = minimumTotalHelper(i + 1, j, height, triangle, dp);
        int dr = minimumTotalHelper(i + 1, j + 1, height, triangle, dp);
        return dp[i][j] = triangle.get(i).get(j) + Math.min(d, dr);
    }
}
