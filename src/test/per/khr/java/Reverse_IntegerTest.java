package per.khr.java;

import org.junit.Test;
import per.khr.java.Else.Reverse_Integer;

import static org.assertj.core.api.Assertions.assertThat;

public class Reverse_IntegerTest {

    @Test
    public void reverse() {
        Reverse_Integer ri = new Reverse_Integer();
        assertThat(ri.reverse(123)).isEqualTo(321);
        assertThat(ri.reverse(-123)).isEqualTo(-321);
    }
}