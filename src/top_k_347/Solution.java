package top_k_347;

import java.util.*;

public class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            int freq = map.getOrDefault(i, 0);
            map.put(i, freq + 1);
        }
        ArrayList<Integer>[] sortedFreq = new ArrayList[nums.length + 1];

        map.forEach((num, freq) -> {
            ArrayList<Integer> temp = sortedFreq[freq] != null ? sortedFreq[freq] : new ArrayList<>();
            temp.add(num);
            sortedFreq[freq] = temp;
        });

        int[] sol = new int[k];
        int j = 0;
        for (int i = nums.length; i >= 0 && j < k; i--) {
            List<Integer> lst = sortedFreq[i];
            if (lst != null)
                for (int x = 0; x < lst.size() && j < k; x++)
                    sol[j++] = lst.get(x);
        }
        return sol;
    }
}
