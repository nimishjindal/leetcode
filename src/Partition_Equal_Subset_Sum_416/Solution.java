package Partition_Equal_Subset_Sum_416;

class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int i : nums) sum += i;

        if (sum % 2 != 0)
            return false;

        int target = sum / 2;
        boolean[][] dp = new boolean[nums.length][sum + 1];

        for (int i = 0; i < nums.length; i++)
            dp[i][0] = true;
        dp[0][nums[0]] = true;

        for (int i = 1; i < nums.length; i++) {
            for (int t = 1; t <= target; t++) {
                boolean take = t >= nums[i] && dp[i - 1][t - nums[i]];
                boolean noTake = dp[i - 1][t];
                dp[i][t] = take | noTake;
            }
        }

        return dp[nums.length - 1][target];
    }
}
