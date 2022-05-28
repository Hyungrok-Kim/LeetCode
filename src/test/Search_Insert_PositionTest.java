import org.junit.Test;
import per.khr.java.Else.Search_Insert_Position;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

public class Search_Insert_PositionTest {

    @Test
    public void searchInsert() {
        Search_Insert_Position sip = new Search_Insert_Position();

        assertThat(sip.searchInsert(new int[]{1,3,5,6}, 5)).isEqualTo(2);
        assertThat(sip.searchInsert(new int[]{1,3,5,6}, 2)).isEqualTo(1);
        assertThat(sip.searchInsert(new int[]{1,3,5,6}, 7)).isEqualTo(4);
        assertThat(sip.searchInsert(new int[]{1,3,5,6}, 0)).isEqualTo(4);
    }
}