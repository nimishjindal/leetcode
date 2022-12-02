package top_k_347;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            int freq = map.getOrDefault(i, 0);
            map.put(i, freq + 1);
        }
        List<Integer> l = map
                .keySet().stream()
                .sorted((key1, key2) -> map.get(key2) - map.get(key1))
                .limit(k)
                .collect(Collectors.toList());
        int[] res = new int[k];
        for (int i = 0; i < k; i++)
            res[i] = l.get(i);
        return res;
    }
}
