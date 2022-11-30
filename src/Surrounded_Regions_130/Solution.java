package Surrounded_Regions_130;

public class Solution {

    boolean[][] visited;
    char[][] board;
    int m, n;

    char X = 'X', O = 'O', N = 'N';

    public void solve(char[][] board) {
        m = board.length;
        n = board[0].length;
        this.board = board;

        visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            visit(i, 0);
            visit(i, n - 1);
        }
        for (int j = 0; j < n; j++) {
            visit(0, j);
            visit(m - 1, j);
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == O)
                    board[i][j] = X;
                else if (board[i][j] == N)
                    board[i][j] = O;
            }
        }
    }

    private void visit(int i, int j) {
        if (board[i][j] == O && !visited[i][j])
            mark(i, j);
    }

    private void mark(int i, int j) { // not blocked = 'N'
        if (isOutOfBounds(i, j) || visited[i][j])
            return;

        visited[i][j] = true;

        if (board[i][j] == X)
            return;

        if (board[i][j] == O)
            board[i][j] = N;

        mark(i - 1, j);
        mark(i + 1, j);
        mark(i, j - 1);
        mark(i, j + 1);
    }

    private boolean isOutOfBounds(int i, int j) {
        return i < 0 || i >= m || j < 0 || j >= n;
    }
}
