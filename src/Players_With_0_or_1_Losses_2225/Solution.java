package Players_With_0_or_1_Losses_2225;

import java.util.*;

public class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        int[] losses = new int[100001];
        for (int i = 0; i < 100001; i++)
            losses[i] = -1;

        for (int[] match : matches) {
            int winner = match[0];
            int loser = match[1];

            if (losses[winner] == -1)
                losses[winner] = 0;

            if (losses[loser] == -1)
                losses[loser] = 1;
            else
                losses[loser]++;

        }

        List<Integer> noLoss = new ArrayList<>();
        List<Integer> oneLoss = new ArrayList<>();

        for (int player = 0; player < 100001; player++) {
            if (losses[player] == 0)
                noLoss.add(player);
            if (losses[player] == 1)
                oneLoss.add(player);
        }
        return Arrays.asList(noLoss, oneLoss);
    }
}
