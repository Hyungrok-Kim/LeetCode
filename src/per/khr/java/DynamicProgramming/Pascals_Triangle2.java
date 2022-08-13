package per.khr.java.DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * getRow 메소드는 Parameter로 rowIndex를 받으면 해당 row의 List를 반환해주는 메소드다.
 */
public class Pascals_Triangle2 {
    List<List<Integer>> triangle = new ArrayList<>();

    public List<Integer> getRow(int rowIndex) {

        if (triangle.isEmpty()) {
            List<Integer> startingSetUp = Arrays.asList(1);
            triangle.add(startingSetUp);
        }

        if (rowIndex == 0) return triangle.get(0);

        if (triangle.get(rowIndex) != null) return triangle.get(rowIndex);
        else {
            for (int i = rowIndex - 1, iLimit = 0; i >= iLimit; --i) {
                List<Integer> result = new ArrayList<>();

                for (int j = 0, jLimit = rowIndex + 1; j < jLimit; ++j) {
                    // 이전 rowIndex의 List를 가져와서 result에 계산해서 넣은 후 triangle List에 넣어줘야 함.

                }

            }
        }

        return null;
    }
}
