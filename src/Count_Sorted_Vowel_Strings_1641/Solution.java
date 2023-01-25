package Count_Sorted_Vowel_Strings_1641;

public class Solution {
    public int countVowelStrings(int n) {
        return countVowelStrings(0, n, '0');
    }

    public int countVowelStrings(int i, int n, char prev) {
        if (i == n)
            return 1;
        int ans = 0;
        for (char ch : "aeiou".toCharArray()) {
            if (i == 0 || prev <= ch)
                ans += countVowelStrings(i + 1, n, ch);
        }
        return ans;
    }
}
