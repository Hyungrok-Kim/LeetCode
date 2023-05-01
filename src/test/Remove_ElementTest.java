import org.junit.Test;
import per.khr.java.BruteForce.Remove_Element;

import static org.assertj.core.api.Assertions.assertThat;

public class Remove_ElementTest {

    @Test
    public void removeElement() {
        Remove_Element re = new Remove_Element();

        int[] nums = {3, 2, 2, 3};
        int val = 3;
        assertThat(re.removeElement(nums, val)).isEqualTo(2);
//
        nums = new int[] {0,1,2,2,3,0,4,2};
        val = 2;
        assertThat(re.removeElement(nums, val)).isEqualTo(5);

        nums = new int[] {0,1,2,2,3,0,4,2,2};
        val = 2;
        assertThat(re.removeElement(nums, val)).isEqualTo(5);

        nums = new int[] {3,3};
        val = 3;
        assertThat(re.removeElement(nums, val)).isEqualTo(0);

        nums = new int[] {4,5};
        val = 5;
        assertThat(re.removeElement(nums, val)).isEqualTo(1);
    }
}