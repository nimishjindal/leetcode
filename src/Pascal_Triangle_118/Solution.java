package Pascal_Triangle_118;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> sol = new ArrayList<>();
        sol.add(Arrays.asList(1));
        for (int i = 1; i < numRows; i++) {
            List<Integer> sub = new ArrayList<>(i + 1);
            sub.add(0, 1);
            for (int j = 1; j < i; j++) {
                List<Integer> prev = sol.get(i - 1);
                sub.add(j, prev.get(j - 1) + prev.get(j));
            }
            sub.add(i, 1);
            sol.add(sub);
        }
        return sol;
    }
}
