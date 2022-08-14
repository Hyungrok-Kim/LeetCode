package per.khr.java.DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * getRow 메소드는 Parameter로 rowIndex를 받으면 해당 row의 List를 반환해주는 메소드다.
 * 당연히 DP로 풀면 될 듯.
 */
public class Pascals_Triangle2 {
    List<List<Integer>> triangle = new ArrayList<>();

    /**
     * 2ms
     * faster than 58.83%
     * @param rowIndex
     * @return
     */
    public List<Integer> getRow(int rowIndex) {
        if (triangle.isEmpty()) {
            List<Integer> startingSetUp = Arrays.asList(1);
            triangle.add(startingSetUp);
        }

        if (rowIndex == 0) return triangle.get(0);

        if (triangle.size() == rowIndex + 1) return triangle.get(rowIndex);
        else {
            List<Integer> result = new ArrayList<>();
            List<Integer> preRow = getRow(rowIndex - 1);

            for (int j = 0, jLimit = rowIndex + 1; j < jLimit; ++j) {
                // 이전 rowIndex의 List를 가져와서 result에 계산해서 넣은 후 triangle List에 넣어줘야 함.

                if (j == 0 || j == jLimit - 1)
                    result.add(1);
                else
                    result.add(preRow.get(j - 1) + preRow.get(j));
            }

            triangle.add(result);
        }

        return triangle.get(rowIndex);
    }
}
