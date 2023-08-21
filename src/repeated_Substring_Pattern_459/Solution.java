package repeated_Substring_Pattern_459;

public class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String newS = s+s;
        newS = newS.substring(1,newS.length()-1);

        return newS.contains(s);
    }
}
