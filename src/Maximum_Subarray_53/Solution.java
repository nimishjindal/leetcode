package Maximum_Subarray_53;

public class Solution {
    public int maxSubArray(int[] nums) {
        int size = nums.length;
        int maxSum = nums[0];
        int sumTillHere = 0;
        int maxTillhere = nums[0];

        for (int i=1;i<nums.length;i++){
            int a = nums[i];
            maxTillhere = Math.max(maxTillhere + a, a);
            maxSum = Math.max(maxTillhere, maxSum);
        }
        return maxSum;
    }
}