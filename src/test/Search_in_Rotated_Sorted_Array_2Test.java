import junit.framework.TestCase;
import org.junit.Test;
import per.khr.java.BinarySearch.Search_in_Rotated_Sorted_Array_2;

import static org.assertj.core.api.Assertions.assertThat;

public class Search_in_Rotated_Sorted_Array_2Test extends TestCase {

    @Test
    public void testSearch() {
        Search_in_Rotated_Sorted_Array_2 sirsa2 = new Search_in_Rotated_Sorted_Array_2();

//        assertThat(sirsa2.search(new int[] {2,5,6,0,0,1,2}, 0)).isEqualTo(true);
//        assertThat(sirsa2.search(new int[] {2,5,6,0,0,1,2}, 3)).isEqualTo(false);

        assertThat(sirsa2.search3(new int[] {2,5,6,0,0,1,2}, 0)).isEqualTo(true);
        assertThat(sirsa2.search3(new int[] {2,5,6,0,0,1,2}, 3)).isEqualTo(false);
    }
}