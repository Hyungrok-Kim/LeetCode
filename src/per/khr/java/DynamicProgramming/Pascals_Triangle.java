package per.khr.java.DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 성능과 관련된 문제 && 이전 배열의 값을 활용 -> DP
 */
public class Pascals_Triangle {
    public List<List<Integer>> generate(int numRows) {
        if (numRows == 0) return new ArrayList<>();

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> startSetting = Arrays.asList(1);

        result.add(startSetting);

        for (int i = 1, iLimit = numRows; i < iLimit; ++i) {
            List<Integer> iArr = new ArrayList<>();

            for (int j = 0, jLimit = i + 1; j < jLimit; ++j) {
                if (j == 0)
                    iArr.add(result.get(i - 1).get(0));
                else if (j == jLimit - 1)
                    iArr.add(result.get(i - 1).get(j - 1));
                else
                    iArr.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
            }

            result.add(iArr);
        }

        return result;
    }
}
