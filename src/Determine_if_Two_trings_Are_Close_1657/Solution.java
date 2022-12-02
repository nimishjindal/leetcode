package Determine_if_Two_trings_Are_Close_1657;

import java.util.Arrays;

public class Solution {
    public boolean closeStrings(String word1, String word2) {
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        boolean[] chars1 = new boolean[26];
        boolean[] chars2 = new boolean[26];
        for (int i = 0; i < word1.length(); i++) {
            chars1[word1.charAt(i) - 'a'] = true;
            freq1[word1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < word2.length(); i++) {
            chars2[word2.charAt(i) - 'a'] = true;
            freq2[word2.charAt(i) - 'a']++;
        }
        Arrays.sort(freq1);
        Arrays.sort(freq2);

        return Arrays.equals(freq1, freq2) && Arrays.equals(chars1, chars2);
    }
}
