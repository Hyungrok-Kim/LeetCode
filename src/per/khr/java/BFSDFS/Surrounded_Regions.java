package per.khr.java.BFSDFS;

/**
 * [
 * ["X", "X", "X", "X"],
 * ["X", "O", "O", "X"],
 * ["X", "X", "O", "X"],
 * ["X", "O", "X", "X"],
 * ]
 */
public class Surrounded_Regions {
    private static final int[][] checks = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    /**
     * 2ms
     * faster than 86.44%
     * @param board
     */
    public void solve(char[][] board) {
        if (board.length == 0) return;

        int xLen = board.length, yLen = board[0].length;

        for (int i = 0; i < yLen; ++i) {
            if (board[i][0] == 'O') dfs(0, i, board, xLen, yLen);
            if (board[i][xLen - 1] == 'O') dfs(xLen - 1, i, board, xLen, yLen);
        }

        for (int j = 0; j < xLen; ++j) {
            if (board[0][j] == 'O') dfs(j, 0, board, xLen, yLen);
            if (board[yLen - 1][j] == 'O') dfs(j, yLen - 1, board, xLen, yLen);
        }

        for (int i = 0; i < yLen; ++i) {
            for (int j = 0; j < xLen; ++j) {
                if (board[i][j] == '*') board[i][j] = 'O';
                else if (board[i][j] == 'O') board[i][j] = 'X';
            }
        }
    }

    public void dfs(int x, int y, char[][] board, int xLen, int yLen) {
        board[y][x] = '*';

        for (int[] check : checks) {
            if (0 <= x + check[1] && x + check[1] < xLen &&
                    0 <= y + check[0] && y + check[0] < yLen
                    && board[y + check[0]][x + check[1]] == 'O') {
                dfs(x + check[1], y + check[0], board, xLen, yLen);
            }
        }
    }
}
