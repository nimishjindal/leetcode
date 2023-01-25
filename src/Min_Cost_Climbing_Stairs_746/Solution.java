package Min_Cost_Climbing_Stairs_746;

public class Solution {

    public int minCostClimbingStairs(int[] cost) {
        int curr, prev, prevprev;
        curr = prev = prevprev = 0;

        for (int i = 2; i <= cost.length; i++) {
            int left = cost[i - 1] + prev;
            int right = cost[i - 2] + prevprev;
            curr = Math.min(left, right);
            prevprev = prev;
            prev = curr;
        }
        return curr;
    }
}
