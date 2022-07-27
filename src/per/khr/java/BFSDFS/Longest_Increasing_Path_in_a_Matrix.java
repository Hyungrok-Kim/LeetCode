package per.khr.java.BFSDFS;

import java.util.TreeSet;

/**
 * 낮은 수에서 높은 수로만 갈 수 있는데 가장 많이 가야 한다.
 * 이렇게 풀면 모든 경우의 수를 다 보기 때문에 시간복잡도를 통과할 수 없음..
 */
public class Longest_Increasing_Path_in_a_Matrix {
    private final int[][] moves = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public void dfs(int i, int j, int[][] matrix, int moveCount, TreeSet<Integer> ts) {
        int target = matrix[i][j];
//        matrix[i][j] = 0;

        for (int[] move : moves) {
            int newI = i + move[0];
            int newJ = j + move[1];

            if (0 <= newI && newI < matrix.length &&
                    0 <= newJ && newJ < matrix[0].length &&
                    target < matrix[newI][newJ] &&
                    matrix[newI][newJ] != 0
            ) {
                dfs(newI, newJ, matrix, moveCount + 1, ts);
            } else {
                ts.add(moveCount);
            }
        }
    }

    public int longestIncreasingPath(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) return 0;

        TreeSet<Integer> ts = new TreeSet<>();

        for (int i = 0, iLimit = matrix.length; i < iLimit; ++i) {
            for (int j = 0, jLimit = matrix[0].length; j < jLimit; ++j) {
                dfs(i, j, matrix, 1, ts);
            }
        }

        return ts.pollLast();
    }
}
