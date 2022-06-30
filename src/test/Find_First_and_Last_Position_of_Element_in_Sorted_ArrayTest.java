import junit.framework.TestCase;
import org.junit.Test;
import per.khr.java.BinarySearch.Find_First_and_Last_Position_of_Element_in_Sorted_Array;

import static org.assertj.core.api.Assertions.assertThat;


public class Find_First_and_Last_Position_of_Element_in_Sorted_ArrayTest extends TestCase {

    @Test
    public void testSearchRange() {
        Find_First_and_Last_Position_of_Element_in_Sorted_Array ffalpoeisa = new Find_First_and_Last_Position_of_Element_in_Sorted_Array();

        assertThat(ffalpoeisa.searchRange(new int[]{1}, 1)).isEqualTo(new int[]{0, 0});
        assertThat(ffalpoeisa.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8)).isEqualTo(new int[]{3, 4});
        assertThat(ffalpoeisa.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6)).isEqualTo(new int[]{-1, -1});
        assertThat(ffalpoeisa.searchRange(new int[]{}, 0)).isEqualTo(new int[]{-1, -1});
    }
}