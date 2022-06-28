import junit.framework.TestCase;
import org.junit.Test;
import per.khr.java.BinarySearch.Search_in_Rotated_Sorted_Array;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class Search_in_Rotated_Sorted_ArrayTest extends TestCase {

    @Test
    public void testSearch() {
        Search_in_Rotated_Sorted_Array sirsa = new Search_in_Rotated_Sorted_Array();

//        assertThat(sirsa.search(new int[] {1,3}, 0)).isEqualTo(-1);
        assertThat(sirsa.search(new int[] {3,1}, 0)).isEqualTo(-1);
        assertThat(sirsa.search(new int[] {1,3}, 2)).isEqualTo(-1);
        assertThat(sirsa.search(new int[] {4,5,6,7,0,1,2}, 0)).isEqualTo(4);
        assertThat(sirsa.search(new int[] {1}, 0)).isEqualTo(-1);
        assertThat(sirsa.search(new int[] {4,5,6,7,0,1,2}, 3)).isEqualTo(-1);
    }
}