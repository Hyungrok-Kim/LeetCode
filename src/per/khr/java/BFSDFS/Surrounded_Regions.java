package per.khr.java.BFSDFS;

import java.util.ArrayList;

/**
 * [
 * ["X", "X", "X", "X"],
 * ["X", "O", "O", "X"],
 * ["X", "X", "O", "X"],
 * ["X", "O", "X", "X"],
 * ]
 */
public class Surrounded_Regions {

    public ArrayList<Integer[]> dfs(int mLen, int nLen, char[][] board, ArrayList<Integer[]> zeroContainer, int i, int j) {
        return null;
    }

    public void solve(char[][] board) {
        int mLen = board[0].length, nLen = board.length;

        if (board[0].length != 1 || board[0].length != 2) {

            ArrayList<Integer[]> zeroContainer = new ArrayList<>();

            for (int i = 0, bLen = board.length; i < bLen; ++i) {
                for (int j = 0, cLen = board[i].length; j < cLen; ++j) {
                    if (board[i][j] == 'O') {
                        zeroContainer.add(new Integer[] {i, j});

                        // 오른쪽과 아래를 살피자
                        // i + 1, j + 1
                    }
                }
            }
        }
    }
}
