import org.junit.Test;
import per.khr.java.Else.Implement_strStr;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

public class Implement_strStrTest {

    @Test
    public void strStr() {
        Implement_strStr is = new Implement_strStr();

        assertThat(is.strStr("hello", "ll")).isEqualTo(2);
    }
}