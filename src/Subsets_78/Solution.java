package Subsets_78;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        double totalSubsets = Math.pow(2, nums.length);
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < totalSubsets; i++) {
            List<Integer> set = new ArrayList<>();
            int t = i;
            int pos = 0;
            while (t > 0) {
                if ((t & 1) == 1)
                    set.add(nums[pos]);
                pos++;
                t /= 2;
            }
            ans.add(set);
        }
        return ans;
    }
}
