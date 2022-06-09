import org.junit.Test;
import per.khr.java.DynamicProgramming.ClimbingStairs;

import static org.assertj.core.api.Assertions.assertThat;

public class ClimbingStairsTest {

    @Test
    public void climbStairs() {
        ClimbingStairs cs = new ClimbingStairs();

        assertThat(cs.climbStairs(6)).isEqualTo(13);
        assertThat(cs.climbStairs(2)).isEqualTo(2);
        assertThat(cs.climbStairs(3)).isEqualTo(3);
    }
}