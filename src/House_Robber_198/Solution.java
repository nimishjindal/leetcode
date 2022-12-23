package House_Robber_198;

public class Solution {

    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = nums[0];
        for (int pos = 1; pos < n; pos++) {
            int take = nums[pos];
            if (pos - 2 >= 0)
                take += dp[pos - 2];
            int notTake = dp[pos - 1];
            dp[pos] = Math.max(take, notTake);
        }
        return dp[n - 1];
    }
}
