package PartitionMiniSumDiff_2035;

public class Solution {
    public int minimumDifference(int[] nums) {
        int sum = 0;
        for (int i : nums) sum += i;

        boolean[][] dp = new boolean[nums.length][sum + 1];

        for (int i = 0; i < nums.length; i++)
            dp[i][0] = true;
        if (nums[0] >= 0) dp[0][nums[0]] = true;

        for (int i = 1; i < nums.length; i++) {
            for (int t = 1; t <= sum; t++) {
                boolean take = t >= nums[i] && dp[i - 1][t - nums[i]];
                boolean noTake = dp[i - 1][t];
                dp[i][t] = take | noTake;
            }
        }

        int minSum = Integer.MAX_VALUE;
        for (int i = 0; i < sum; i++) {
            if (dp[nums.length - 1][i]) {
                int s2 = sum - i;
                minSum = Math.min(minSum, Math.abs(s2 - i));
            }
        }
        return minSum;
    }
}
