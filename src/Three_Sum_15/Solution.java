package Three_Sum_15;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();
        Integer prev = null;
        for (int i = 0; i < nums.length; i++) {
            if (prev == null || prev != nums[i])
                ans.addAll(twoSum(nums, i, -1 * nums[i]));
            prev = nums[i];
        }
        return new ArrayList<>(ans);
    }

    private Set<List<Integer>> twoSum(int[] nums, int start, int target) {
        Set<Integer> set = new HashSet<>();
        int a = nums[start];
        Set<List<Integer>> ans = new HashSet<>();
        for (int i = start + 1; i < nums.length; i++) {
            int cur = nums[i];
            int req = target - cur;
            if (set.contains(req))
                ans.add(Stream
                        .of(a, cur, req)
                        .sorted()
                        .collect(Collectors.toList())
                );
            set.add(cur);
        }
        return ans;
    }
}
