import org.junit.Test;
import per.khr.java.Else.Add_Binary;

import static org.assertj.core.api.Assertions.assertThat;

public class Add_BinaryTest {

    @Test
    public void addBinary() {
        Add_Binary ab = new Add_Binary();

        assertThat(ab.addBinary("11", "1")).isEqualTo("100");
        assertThat(ab.addBinary("1010", "1011")).isEqualTo("10101");
        assertThat(ab.addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101", "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011")).isEqualTo("10101");
    }
}