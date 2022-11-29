package Decode_Ways_91;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    int size;
    char[] str;

    Map<Integer, Integer> dp;

    public int numDecodings(String s) {
        str = s.toCharArray();
        size = s.length();
        dp = new HashMap<>();
        dp.put(size, 1);

        return build(0);
    }

    private int build(int i) {
        if (dp.containsKey(i))
            return dp.get(i);
        if (str[i] == '0')
            return 0;

        int count = build(i + 1);
        if (i + 1 < size && isValid(str[i], str[i + 1]))
            count += build(i + 2);
        dp.put(i, count);
        return count;
    }

    private boolean isValid(char a, char b) {
        return (a == '1') || (a == '2' && '0' <= b && b <= '6');
    }
}
