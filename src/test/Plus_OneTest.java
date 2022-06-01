import org.junit.Test;
import per.khr.java.Else.Plus_One;

import static org.assertj.core.api.Assertions.assertThat;

//import static org.junit.Assert.*;

public class Plus_OneTest {

    @Test
    public void plusOne() {
        Plus_One po = new Plus_One();

        assertThat(po.plusOne(new int[] {1,2,3})).isEqualTo(new int[] {1,2,4});
    }
}