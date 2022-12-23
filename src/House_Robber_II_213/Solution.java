package House_Robber_II_213;

public class Solution {

    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return nums[0];
        return Math.max(
                robHelper(nums, 0, n - 1),
                robHelper(nums, 1, n)
        );
    }

    public int robHelper(int[] nums, int start, int end) {
        int prev = nums[start];
        int max = 0;
        int prevPrev = 0;
        for (int pos = start + 1; pos < end; pos++) {
            int take = nums[pos] + prevPrev;
            int notTake = prev;
            max = Math.max(take, notTake);
            prevPrev = prev;
            prev = max;
        }
        return prev;
    }
}
