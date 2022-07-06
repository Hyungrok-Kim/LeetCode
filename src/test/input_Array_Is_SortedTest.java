import junit.framework.TestCase;
import org.junit.Test;
import per.khr.java.BinarySearch.input_Array_Is_Sorted;

import static org.assertj.core.api.Assertions.assertThat;

public class input_Array_Is_SortedTest extends TestCase {

    @Test
    public void testTwoSum() {
        input_Array_Is_Sorted iais = new input_Array_Is_Sorted();

        assertThat(iais.twoSum(new int[]{2, 7, 11, 15}, 9)).isEqualTo(new int[]{1, 2});
        assertThat(iais.twoSum(new int[]{2, 3, 4}, 6)).isEqualTo(new int[]{1, 3});
        assertThat(iais.twoSum(new int[]{-1, 0}, -1)).isEqualTo(new int[]{1, 2});
    }
}