import org.junit.Test;
import per.khr.java.BruteForce.Remove_Duplicates_From_Sorted_Array;

import static org.assertj.core.api.Assertions.assertThat;

public class Remove_Duplicates_From_Sorted_ArrayTest {
    @Test
    public void removeDuplicates() {
        Remove_Duplicates_From_Sorted_Array rdfsa = new Remove_Duplicates_From_Sorted_Array();
        int[] nums = {1,1,2};

        assertThat(rdfsa.removeDuplicates(nums)).isEqualTo(2);

        int[] nums2 = {0,0,1,1,1,2,2,3,3,4};
        assertThat(rdfsa.removeDuplicates(nums2)).isEqualTo(5);
    }
}