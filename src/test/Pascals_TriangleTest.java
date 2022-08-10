import junit.framework.TestCase;
import org.junit.Test;
import per.khr.java.DynamicProgramming.Pascals_Triangle;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class Pascals_TriangleTest extends TestCase {

    @Test
    public void testGenerate() {
        Pascals_Triangle pt = new Pascals_Triangle();

        assertThat(pt.generate(5)).isEqualTo(Arrays.asList(
                Arrays.asList(1),
                Arrays.asList(1,1),
                Arrays.asList(1, 2, 1),
                Arrays.asList(1, 3, 3, 1),
                Arrays.asList(1, 4, 6, 4 , 1)
        ));
    }
}