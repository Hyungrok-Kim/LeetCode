import junit.framework.TestCase;
import org.junit.Test;
import per.khr.java.BinarySearch.Find_Minimum_in_Rotated_Sorted_Array_2;

import static org.assertj.core.api.Assertions.assertThat;

public class Find_Minimum_in_Rotated_Sorted_Array_2Test extends TestCase {

    @Test
    public void testFindMin() {
        Find_Minimum_in_Rotated_Sorted_Array_2 fmirsa = new Find_Minimum_in_Rotated_Sorted_Array_2();

        assertThat(fmirsa.findMin(new int[] {10,1,10,10,10})).isEqualTo(1);
        assertThat(fmirsa.findMin(new int[] {2,2,2,0,1})).isEqualTo(0);
    }
}