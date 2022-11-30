package Unique_Number_Occurrences_1207;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    Map<Integer, Integer> freq = new HashMap<>();
    Set<Integer> set = new HashSet<>();

    public boolean uniqueOccurrences(int[] arr) {
        for (int a : arr) {
            int f = freq.getOrDefault(a, 0);
            freq.put(a, f + 1);
        }

        for(Integer key: freq.keySet()){
            int f = freq.get(key);
            if (set.contains(f))
                return false;
            set.add(f);
        }
        return true;
    }
}
