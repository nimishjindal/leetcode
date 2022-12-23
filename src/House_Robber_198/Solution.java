package House_Robber_198;

import java.util.Arrays;

public class Solution {
    private int[] dp;

    public int rob(int[] nums) {
        int n = nums.length;
        dp = new int[n];
        Arrays.fill(dp, -1);
        return rob(n - 1, nums);
    }

    private int rob(int pos, int[] nums) {
        if (pos == 0)
            return nums[0];
        if (pos < 0)
            return 0;
        if (dp[pos] != -1)
            return dp[pos];
        int take = nums[pos] + rob(pos - 2, nums);
        int notTake = rob(pos - 1, nums);
        return dp[pos] = Math.max(take, notTake);
    }
}
