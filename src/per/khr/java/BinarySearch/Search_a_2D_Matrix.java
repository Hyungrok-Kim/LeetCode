package per.khr.java.BinarySearch;

/**
 * 한 블록씩 검사하면서
 * target이 해당 블록의 가장 큰 값보다 작아서 범위에 속한다면
 * 이분 탐색으로 찾아주자.
 */
public class Search_a_2D_Matrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int[] block : matrix) {
            if (block[block.length - 1] >= target) {
                int startIdx = 0, endIdx = block.length - 1, targetIdx = 0;

                while (startIdx <= endIdx) {
                    targetIdx = startIdx + (endIdx - startIdx) / 2;

                    if (block[targetIdx] == target) {
                        return true;
                    } else if (block[targetIdx] > target) {
                        endIdx = targetIdx - 1;
                    } else if (block[targetIdx] < target) {
                        startIdx = targetIdx + 1;
                    }
                }
            }
        }

        return false;
    }
}
