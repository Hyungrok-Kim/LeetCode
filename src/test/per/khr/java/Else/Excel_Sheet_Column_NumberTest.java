package per.khr.java.Else;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Excel_Sheet_Column_NumberTest {

    @Test
    void titleToNumber() {
        Excel_Sheet_Column_Number escn = new Excel_Sheet_Column_Number();

        assertThat(escn.titleToNumber("A")).isEqualTo(1);
        assertThat(escn.titleToNumber("AB")).isEqualTo(28);
        assertThat(escn.titleToNumber("ZY")).isEqualTo(701);
    }
}