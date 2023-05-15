package per.khr.java.Else;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Container_With_Most_WaterTest {

    @Test
    public void maxArea() {
        Container_With_Most_Water cwmw = new Container_With_Most_Water();
        assertThat(cwmw.maxArea(new int[] {1, 8, 6, 2, 5, 4, 8, 3, 7})).isEqualTo(49);
        assertThat(cwmw.maxArea(new int[] {1, 1})).isEqualTo(1);
    }
}