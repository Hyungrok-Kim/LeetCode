package per.khr.java.DynamicProgramming;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class Pascals_Triangle2Test extends TestCase {

    @Test
    public void testGetRow() {
        Pascals_Triangle2 pt2 = new Pascals_Triangle2();

        assertThat(pt2.getRow(3)).isEqualTo(Arrays.asList(1, 3, 3, 1));
        assertThat(pt2.getRow(1)).isEqualTo(Arrays.asList(1, 1));
    }
}