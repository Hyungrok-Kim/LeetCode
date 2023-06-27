package per.khr.java.BruteForce;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class Single_NumberTest {

    @Test
    public void singleNumber() {
        Single_Number sn = new Single_Number();

        int[] param = new int[]{2, 2, 1};
        assertThat(sn.singleNumber(param)).isEqualTo(1);

        param = new int[]{4, 1, 2, 1, 2};
        assertThat(sn.singleNumber(param)).isEqualTo(4);

        param = new int[]{1};
        assertThat(sn.singleNumber(param)).isEqualTo(1);
    }

}