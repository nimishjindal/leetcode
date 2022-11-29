package Longest_Consecutive_Sequence_128;

import java.util.HashSet;

public class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }
        int max = 0;
        for (int num : nums) {
            int tmp = num - 1;
            int count = 1;
            while (set.contains(tmp)) {
                count++;
                set.remove(tmp);
                tmp--;
            }
            tmp = num + 1;
            while (set.contains(tmp)) {
                count++;
                set.remove(tmp);
                tmp++;
            }
            max = Math.max(max, count);
        }
        return max;
    }
}