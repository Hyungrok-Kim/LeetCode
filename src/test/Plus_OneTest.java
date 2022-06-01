import org.junit.Test;
import per.khr.java.BruteForce.Plus_One;

import static org.assertj.core.api.Assertions.assertThat;

public class Plus_OneTest {

    @Test
    public void plusOne() {
        Plus_One po = new Plus_One();

        assertThat(po.plusOne(new int[] {1,2,3})).isEqualTo(new int[] {1,2,4});
        assertThat(po.plusOne(new int[] {4,3,2,1})).isEqualTo(new int[] {4,3,2,2});
        assertThat(po.plusOne(new int[] {9})).isEqualTo(new int[] {1,0});
    }
}