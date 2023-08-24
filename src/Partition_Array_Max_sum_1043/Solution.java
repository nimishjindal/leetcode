package Partition_Array_Max_sum_1043;

import java.util.Arrays;

public class Solution {

    public int maxSumAfterPartitioningHeavy(int[] arr, int k, int start, int[] dp) {
        int sum = 0, len = 0, max = 0;
        if (sum == arr.length)
            return 0;
        if (dp[start] != -1)
            return dp[start];

        for (int i = start; i < start + k && i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            int futureSum = maxSumAfterPartitioningHeavy(arr, k, i + 1, dp);
            int sumTillNow = max * ++len;
            sum = Math.max(sum, sumTillNow + futureSum);
        }
        return dp[start] = sum;
    }

    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n = arr.length;
        int[] dp = new int[n + 1];
        dp[n] = 0;

        for (int j = n - 1; j >= 0; j--) {
            int sum = 0, len = 0, max = 0;

            for (int i = j; i < j + k && i < arr.length; i++) {
                max = Math.max(max, arr[i]);
                int futureSum = dp[i+1];
                int sumTillNow = max * ++len;
                sum = Math.max(sum, sumTillNow + futureSum);
            }
            dp[j] = sum;
        }
        return dp[0];
    }
}
