package Partition_Equal_Subset_Sum_416;

import java.util.Arrays;

public class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int i : nums) sum += i;

        if (sum % 2 != 0)
            return false;

        int[][] dp = new int[nums.length][(sum / 2) + 1];

        for (int[] arr : dp)
            Arrays.fill(arr, -1);

        return canPartition(nums, nums.length - 1, sum / 2, dp);
    }

    public boolean canPartition(int[] nums, int i, int target, int[][] dp) {
        if (i == 0)
            return target == 0;
        if (target < 0)
            return false;
        if (dp[i][target] != -1)
            return dp[i][target] == 1;
        boolean take = canPartition(nums, i - 1, target - nums[i], dp);
        boolean noTake = canPartition(nums, i - 1, target, dp);

        boolean ans = take | noTake;
        dp[i][target] = ans ? 1 : 0;
        return ans;
    }
}
