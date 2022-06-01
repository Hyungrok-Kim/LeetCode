import org.junit.Test;
import per.khr.java.Else.Add_Binary;

import static org.assertj.core.api.Assertions.assertThat;

public class Add_BinaryTest {

    @Test
    public void addBinary() {
        Add_Binary ab = new Add_Binary();

        assertThat(ab.addBinary("11", "1")).isEqualTo("100");
        assertThat(ab.addBinary("1010", "1011")).isEqualTo("10101");
    }
}