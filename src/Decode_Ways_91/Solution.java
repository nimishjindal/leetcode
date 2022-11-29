package Decode_Ways_91;

public class Solution {
    int size;
    char[] str;

    public int numDecodings(String s) {
        str = s.toCharArray();
        size = s.length();

        return build(0, str[0] + "", false);
    }

    private int build(int i, String curr, boolean combined) {
        if (i >= size || !isValid(curr))
            return 0;
        if (i == size - 1)
            return 1;

        int count = build(i + 1, "" + str[i + 1], false);
        if (!combined)
            count += build(i + 1, str[i] + "" + str[i + 1], true);

        return count;
    }

    private boolean isValid(String val) {
        int num = Integer.parseInt(val);
        return num >= 1 && num <= 26;
    }
}
