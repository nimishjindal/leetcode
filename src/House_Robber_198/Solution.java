package House_Robber_198;

public class Solution {

    public int rob(int[] nums) {
        int n = nums.length;
        int prev = nums[0];
        int max = 0;
        int prevPrev = 0;
        for (int pos = 1; pos < n; pos++) {
            int take = nums[pos] + prevPrev;
            int notTake = prev;
            max = Math.max(take, notTake);
            prevPrev = prev;
            prev = max;
        }
        return prev;
    }
}
