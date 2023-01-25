package Min_Cost_Climbing_Stairs_746;

import java.util.Arrays;

public class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length + 1];
        Arrays.fill(dp, -1);
        return minCostClimbingStairs(cost.length, cost, dp);
    }

    public int minCostClimbingStairs(int i, int[] cost, int[] dp) {
        if (dp[i] != -1)
            return dp[i];
        int left = 0;
        int right = 0;
        if (i >= 1)
            left = cost[i - 1] + minCostClimbingStairs(i - 1, cost, dp);
        if (i >= 2)
            right = cost[i - 2] + minCostClimbingStairs(i - 2, cost, dp);
        return dp[i] = Math.min(left, right);
    }
}
