package Pascal_Triangle_II_119;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public List<Integer> getRow(int rowIndex) {
        List<Integer> sol;
        List<Integer> prevRow;

        sol = Arrays.asList(1);
        prevRow = Arrays.asList(1);

        for (int i = 1; i <= rowIndex; i++) {
            sol = new ArrayList<>(i + 1);
            sol.add(0, 1);
            for (int j = 1; j < i; j++)
                sol.add(j, prevRow.get(j - 1) + prevRow.get(j));

            sol.add(i, 1);
            prevRow = sol;
        }

        return sol;
    }
}
