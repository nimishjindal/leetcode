package Intersection_of_Arrays_II_350;

import java.util.*;

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map1 = buildFreq(nums1);
        Map<Integer, Integer> map2 = buildFreq(nums2);

        Map<Integer, Integer> intersection = new HashMap<>();
        int size = 0;

        for (int it : map2.keySet()) {
            if (map1.containsKey(it)) {
                int freq = Math.min(map2.get(it), map1.get(it));
                size += freq;
                intersection.put(it, freq);
            }
        }

        int i = 0;
        int[] res = new int[size];
        for (Map.Entry<Integer, Integer> entry : intersection.entrySet()) {
            int num = entry.getKey();
            int freq = entry.getValue();
            while (freq-- > 0) res[i++] = num;
        }

        return res;
    }

    private Map<Integer, Integer> buildFreq(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int a : nums) {
            int f = map.getOrDefault(a, 0) + 1;
            map.put(a, f);
        }
        return map;
    }
}