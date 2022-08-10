import org.junit.Test;
import per.khr.java.DynamicProgramming.Maximum_Subarray;

import static org.assertj.core.api.Assertions.assertThat;

public class Maximum_SubarrayTest {

    @Test
    public void maxSubArray() {
        Maximum_Subarray ms = new Maximum_Subarray();

        assertThat(ms.maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4})).isEqualTo(6);
    }
}