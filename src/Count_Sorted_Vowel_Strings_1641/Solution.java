package Count_Sorted_Vowel_Strings_1641;

import java.util.Arrays;

public class Solution {
    public int countVowelStrings(int n) {
        int[] prev = new int[5];
        Arrays.fill(prev, 1);
        int sum = 5;
        for (int i = 1; i < n; i++) {
            int[] dp = new int[5];
            dp[0] = sum;
            for (int j = 1; j < 5; j++) {
                dp[j] = dp[j - 1] - prev[j - 1];
                sum += dp[j];
            }
            prev = dp;
        }
        return sum;
    }
}
