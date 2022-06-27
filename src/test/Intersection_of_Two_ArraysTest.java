import junit.framework.TestCase;
import org.junit.Test;
import per.khr.java.BinarySearch.Intersection_of_Two_Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class Intersection_of_Two_ArraysTest extends TestCase {

    @Test
    public void testIntersection() {
        Intersection_of_Two_Arrays iota = new Intersection_of_Two_Arrays();

        assertThat(iota.intersection(new int[]{4, 9, 5}, new int[]{9,4,9,8,4})).isEqualTo(new int[]{4,9});
    }
}