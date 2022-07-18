package per.khr.java.BFSDFS;

/**
 * 붙어있는 섬의 갯수가 몇 개인지 찾는문제.
 * 당연히 DFS로 풀면 될 듯.
 */
public class Number_of_Islands {
    private final static int[][] needVisits = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    private void visitMarked(int x, int y, char[][] grid) {
        grid[x][y] = '*';

        for (int[] needVisit : needVisits) {
            if (0 < x + needVisit[0] && x + needVisit[0] < grid.length && 0 < y + needVisit[1] && y + needVisit[1] < grid[x].length)
                visitMarked(x + needVisit[0], y + needVisit[1], grid);
        }
    }

    public int numIslands(char[][] grid) {
        int landCount = 0;

        for (int i = 0, iLimit = grid.length; i < iLimit; ++i) {
            for (int j = 0, jLimit = grid[i].length; j < jLimit; ++j) {
                if (grid[i][j] == '1') {
                    landCount += 1;
                    visitMarked(i, j, grid);
                }
            }
        }

        return landCount;
    }
}
