import Surrounded_Regions_130.Solution;

public class Sample {
    public static void main(String[] args) {
        Solution s = new Solution();
        char[][] board = {
                {'O','O','O','O','X','X'},
                {'O','O','O','O','O','O'},
                {'O','X','O','X','O','O'},
                {'O','X','O','O','X','O'},
                {'O','X','O','X','O','O'},
                {'O','X','O','O','O','O'}
        };
        s.solve(board);
    }
}
