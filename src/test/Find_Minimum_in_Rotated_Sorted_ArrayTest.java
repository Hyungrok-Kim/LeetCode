import junit.framework.TestCase;
import org.junit.Test;
import per.khr.java.BinarySearch.Find_Minimum_in_Rotated_Sorted_Array;

import static org.assertj.core.api.Assertions.assertThat;

public class Find_Minimum_in_Rotated_Sorted_ArrayTest extends TestCase {

    @Test
    public void testFindMin() {
        Find_Minimum_in_Rotated_Sorted_Array fmirs = new Find_Minimum_in_Rotated_Sorted_Array();

        assertThat(fmirs.findMin(new int[]{3, 4, 5, 1, 2})).isEqualTo(1);
    }
}