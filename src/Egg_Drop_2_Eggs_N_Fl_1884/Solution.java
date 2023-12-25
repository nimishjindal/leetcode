package Egg_Drop_2_Eggs_N_Fl_1884;

public class Solution {
    public int twoEggDrop(int n) {
        for (int i = 1; i <= n; i++) {
            int sol = (i * (i + 1)) / 2;
            if (sol >= n)
                return i;
        }
        return 1;
    }
}