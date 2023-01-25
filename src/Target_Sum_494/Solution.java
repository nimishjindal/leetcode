package Target_Sum_494;

public class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return findTargetSumWays(nums, nums.length - 1, target);
    }

    public int findTargetSumWays(int[] nums, int i, int target) {
        if (i < 0)
            return target == 0 ? 1 : 0;
        int left = findTargetSumWays(nums, i - 1, target + nums[i]);
        int right = findTargetSumWays(nums, i - 1, target - nums[i]);
        return left + right;
    }
}
