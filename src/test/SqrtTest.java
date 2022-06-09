import org.junit.Test;
import per.khr.java.BinarySearch.Sqrt;

import static org.assertj.core.api.Assertions.assertThat;

public class SqrtTest {

    @Test
    public void mySqrt() {
        Sqrt s = new Sqrt();

//        assertThat(s.mySqrt(5)).isEqualTo(2);
//        assertThat(s.mySqrt(4)).isEqualTo(2);
        assertThat(s.mySqrt(8)).isEqualTo(2);
        assertThat(s.mySqrt(2147395600)).isEqualTo(46340);
    }
}