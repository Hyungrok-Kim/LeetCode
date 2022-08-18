import junit.framework.TestCase;
import org.junit.Test;
import per.khr.java.Hash.Two_Sum;

import static org.assertj.core.api.Assertions.assertThat;

public class Two_SumTest extends TestCase {

    @Test
    public void testTwoSum() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        assertThat(new Two_Sum().twoSum(nums, target)).isEqualTo(new int[]{0, 1});
    }
}