package per.khr.java.BFSDFS;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * 낮은 수에서 높은 수로만 갈 수 있는데 가장 많이 가야 한다.
 */
public class Longest_Increasing_Path_in_a_Matrix {
    private static final int[][] moves = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    private static final PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

    public void dfs(int i, int j, int[][] matrix, int moveCount) {
        int target = matrix[i][j];
        matrix[i][j] = 0;

        for (int[] move : moves) {
            int newI = i + move[0];
            int newJ = j + move[1];

            if (0 <= newI && newI < matrix.length &&
                    0 <= newJ && newJ < matrix[0].length &&
                    target < matrix[newI][newJ] &&
                    matrix[newI][newJ] != 0
            ) {
                dfs(newI, newJ, matrix, moveCount + 1);
            } else {
                pq.add(moveCount);
                return ;
            }
        }
    }

    public int longestIncreasingPath(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) return 0;

        for (int i = 0, iLimit = matrix.length; i < iLimit; ++i) {
            for (int j = 0, jLimit = matrix[0].length; j < jLimit; ++j) {
                dfs(i, j, matrix, 1);
            }
        }

        return pq.poll();
    }
}
