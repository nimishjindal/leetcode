package Get_Maximum_Generated_Arr_1646;

public class Solution {
    public int getMaximumGenerated(int n) {
        if (n <= 1)
            return n;

        int[] nums = new int[n + 1];
        int max = 0;

        nums[0] = 0;
        nums[1] = 1;
        for (int i = 1; i <= n / 2; i++) {
            nums[2 * i] = nums[i];
            max = Math.max(max, nums[2 * i]);

            if (2 * i + 1 <= n) {
                nums[2 * i + 1] = nums[i] + nums[i + 1];
                max = Math.max(max, nums[2 * i + 1]);
            }

        }
        return max;
    }
}
