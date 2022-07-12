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
    private static final int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public void solve(char[][] board) {
        if (board.length == 0)
            return;

        int rows = board.length, cols = board[0].length;

        for (int i = 0; i < rows; i++) {
            if (board[i][0] == 'O')
                markNotSurrounded(i, 0, board);
            if (board[i][cols - 1] == 'O')
                markNotSurrounded(i, cols - 1, board);
        }

        for (int j = 0; j < cols; j++) {
            if (board[0][j] == 'O')
                markNotSurrounded(0, j, board);
            if (board[rows - 1][j] == 'O')
                markNotSurrounded(rows - 1, j, board);
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (board[i][j] == '*') // Restores '*' to 'O'
                    board[i][j] = 'O';
                else if (board[i][j] == 'O') // Captures 'O' surrounded by 'X'
                    board[i][j] = 'X';
            }
        }
    }

    // Mark 'O' not surrounded by 'X' as '*'
    private void markNotSurrounded(int x, int y, char[][] board) {
        board[x][y] = '*';
        for (int[] dir : directions) {
            int nx = x + dir[0], ny = y + dir[1];
            if (nx >= 0 && nx < board.length
                    && ny >= 0 && ny < board[0].length
                    && board[nx][ny] == 'O') {
                markNotSurrounded(nx, ny, board);
            }
        }
    }
}
