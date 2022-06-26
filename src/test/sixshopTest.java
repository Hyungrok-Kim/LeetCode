import junit.framework.TestCase;
import org.junit.Test;
import per.khr.java.Else.sixshop;

import static org.assertj.core.api.Assertions.assertThat;

public class sixshopTest extends TestCase {

    @Test
    public void testMaxSubArray() {
        sixshop ss = new sixshop();

        assertThat(ss.test1(new int[]{10,1,10,1,1,4,3,10}, 6)).isEqualTo(29);
    }

    @Test
    public void testTest2() {
        sixshop ss = new sixshop();

        assertThat(ss.test2(3, new String[] {
                "alex111 100", "cheries2 200", "coco 150", "luna 100", "alex111 120", "coco 300", "cheries2 110"
        })).isEqualTo(4);
    }
}