package Palindrome_Partitioning_131;

import java.util.*;

public class Solution {

    List<List<String>> ans = new ArrayList<>();
    Map<String, Boolean> palindromes = new HashMap<>();

    public List<List<String>> partition(String s) {
        int numSubsets = (int) Math.pow(2, s.length() - 1);
        for (int i = 0; i < numSubsets; i++) {
            int n = i, pos = 0, prev = 0;
            List<String> subsets = new ArrayList<>();
            boolean isPalan = true;
            while (n > 0 && isPalan) {
                boolean isSplit = (n & 1) == 1;
                if (isSplit) {
                    String substring = s.substring(prev, pos + 1); // substr = [start, end+1]
                    if (isPalindrome(substring))
                        subsets.add(substring);
                    else
                        isPalan = false;
                    prev = pos + 1;
                }
                pos++;
                n /= 2;
            }
            if (isPalan) {
                String str = s.substring(prev);
                if (isPalindrome(str)) {
                    subsets.add(str);
                    ans.add(subsets);
                }
            }
        }
        return ans;
    }

    private boolean isPalindrome(String s) {
        if (palindromes.containsKey(s))
            return palindromes.get(s);

        int start = 0, end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start++) != s.charAt(end--)) {
                palindromes.put(s, false);
                return false;
            }
        }
        palindromes.put(s, true);
        return true;
    }

    /*
    2^(n-1) combinations

    a_b_c_d
    abcd            000
    abc d           001
    ab cd           010
    ab c d          011
    a bcd           100
    a bc d          101
    a b cd          110
    a b c d         111
     */
}