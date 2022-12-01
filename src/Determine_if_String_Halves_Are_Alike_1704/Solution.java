package Determine_if_String_Halves_Are_Alike_1704;

import java.util.HashSet;

public class Solution {

    public boolean halvesAreAlike(String s) {
        int size = s.length();
        int right = size / 2;
        int left = right - 1;

        HashSet<Character> vowel = new HashSet<>();

        for (char v : "AEIOUaeiou".toCharArray())
            vowel.add(v);

        int countL = 0, countR = 0;

        for (int i = 0; i <= left; i++) {
            if (vowel.contains(s.charAt(i)))
                countL++;
            if (vowel.contains(s.charAt(right + i)))
                countR++;
        }
        return countL == countR;
    }
}
