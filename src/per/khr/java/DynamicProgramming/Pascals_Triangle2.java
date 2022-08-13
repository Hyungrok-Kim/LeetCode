package per.khr.java.DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pascals_Triangle2 {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> startingSetUp = Arrays.asList(1);

        result.add(startingSetUp);

        if (rowIndex == 0) return result.get(0);





        return null;
    }



}
