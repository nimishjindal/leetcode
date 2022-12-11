package Three_Sum_15;

import java.util.*;

public class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        Integer prev = null;
        for (int i = 0; i < nums.length; i++) {
            if (prev == null || prev != nums[i])
                set.addAll(twoSum(nums, i, -1 * nums[i]));
            prev = nums[i];
        }
        return new ArrayList<>(set);
    }

    private Set<List<Integer>> twoSum(int[] nums, int start, int target) {
        int end = nums.length - 1;
        int a = nums[start++];
        Set<List<Integer>> set = new HashSet<>();
        while (start < end) {
            int b = nums[start];
            int c = nums[end];
            int sum = b + c;
            if (sum == target) {
                start++;
                end--;
                set.add(Arrays.asList(a, b, c));
            } else if (sum < target)
                start++;
            else
                end--;
            if (b == c)
                break;
        }
        return set;
    }
}
