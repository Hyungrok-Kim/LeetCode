package per.khr.java.Else;

import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class Combination_SumTest {

    @Test
    public void combinationSum() {
        Combination_Sum cs = new Combination_Sum();

        assertThat(cs.combinationSum(new int[] {2, 3, 6, 7}, 7)).contains(Arrays.asList(2,2,3));
    }
}