package Players_With_0_or_1_Losses_2225;

import java.util.*;

public class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        int[] losses = new int[100001];
        Set<Integer> players = new HashSet<>();

        for (int[] match : matches) {
            int winner = match[0];
            int loser = match[1];
            players.add(winner);
            players.add(loser);

            losses[loser]++;
        }

        List<Integer> noLoss = new ArrayList<>();
        List<Integer> oneLoss = new ArrayList<>();

        players
                .stream()
                .sorted()
                .forEach(player -> {
                    if (losses[player] == 0)
                        noLoss.add(player);
                    if (losses[player] == 1)
                        oneLoss.add(player);
                });
        return Arrays.asList(noLoss, oneLoss);
    }
}
