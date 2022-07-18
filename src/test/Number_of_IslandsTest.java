import junit.framework.TestCase;
import org.junit.Test;
import per.khr.java.BFSDFS.Number_of_Islands;

import static org.assertj.core.api.Assertions.assertThat;

public class Number_of_IslandsTest extends TestCase {

    @Test
    public void testNumIslands() {
        Number_of_Islands noi = new Number_of_Islands();

        assertThat(noi.numIslands(new char[][] {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'},
        })).isEqualTo(1);


        assertThat(noi.numIslands(new char[][] {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'},
        })).isEqualTo(1);
    }
}