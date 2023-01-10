package Jump_Game_II_45;

import java.util.Arrays;

public class Solution {
    int max = Integer.MAX_VALUE - 1;

    public int jump(int[] nums) {
        int length = nums.length;
        int[] dp = new int[length];
        dp[length - 1] = 0;
        for (int i = length - 2; i >= 0; i--) {
            int maxJumps = nums[i];
            int min = max;
            for (int j = maxJumps; j >= 1; j--) {
                int next = dp[i + j];
                min = Math.min(min, next);
                if (next == 0) break;
            }
            dp[i] = min == max ? max : min + 1;
        }
    }

    public int jump(int i, int[] nums, int[] dp) {
        if (i >= nums.length - 1)
            return 0;
        if (dp[i] != -1)
            return dp[i];
        int maxJumps = nums[i];
        int min = max;
        for (int j = maxJumps; j >= 1; j--) {
            int next = jump(i + j, nums, dp);
            min = Math.min(min, next);
            if (next == 0) break;
        }
        return dp[i] = min == max ? max : min + 1;
    }
}
