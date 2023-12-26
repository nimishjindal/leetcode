package Egg_Drop_2_Eggs_N_Fl_1884;

public class Solution {
    public int twoEggDropOG(int n) {
        for (int i = 1; i <= n; i++) {
            int sol = (i * (i + 1)) / 2;
            if (sol >= n)
                return i;
        }
        return 1;
    }

    public int twoEggDrop(int n) {
        return (int) Math.ceil((Math.sqrt(1+(8*n))-1)/2);
    }
}