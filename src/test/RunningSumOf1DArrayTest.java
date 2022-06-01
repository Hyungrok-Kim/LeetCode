import org.junit.Test;
import per.khr.java.DynamicProgramming.RunningSumOf1DArray;

import static org.assertj.core.api.Assertions.assertThat;

public class RunningSumOf1DArrayTest {

    @Test
    public void runningSum() {
        RunningSumOf1DArray rsoa = new RunningSumOf1DArray();

        assertThat(rsoa.runningSum(new int[]{1, 2, 3, 4})).isEqualTo(new int[]{1, 3, 6, 10});
        assertThat(rsoa.runningSum(new int[]{1, 1, 1, 1, 1})).isEqualTo(new int[]{1, 2, 3, 4, 5});
    }
}