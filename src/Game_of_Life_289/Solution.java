package Game_of_Life_289;

public class Solution {

    boolean[][] sol;
    int[][] board;
    int m, n;

    public void gameOfLife(int[][] board) {
        m = board.length;
        n = board[0].length;
        this.board = board;
        sol = new boolean[m][n];

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (board[i][j] == 0)
                    handleDead(i, j);
                else
                    handleLive(i, j);

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                board[i][j] = sol[i][j] ? 1 : 0;
    }

    private void handleLive(int i, int j) {
        int sum = neighbourSum(i, j);
        sol[i][j] = (2 == sum) || (sum == 3);
    }

    private void handleDead(int i, int j) {
        sol[i][j] = neighbourSum(i, j) == 3;
    }

    int neighbourSum(int i, int j) {
        int l = get(i, j - 1);
        int r = get(i, j + 1);
        int u = get(i - 1, j);
        int d = get(i + 1, j);

        int ul = get(i - 1, j - 1);
        int dl = get(i + 1, j - 1);
        int ur = get(i - 1, j + 1);
        int dr = get(i + 1, j + 1);

        return l + r + u + d + ul + dl + ur + dr;
    }

    private int get(int i, int j) {
        return (i < 0 || i >= m || j < 0 || j >= n) ? 0 : board[i][j];
    }
}