import junit.framework.TestCase;
import org.junit.Test;
import per.khr.java.BinarySearch.Search_a_2D_Matrix;

import static org.assertj.core.api.Assertions.assertThat;

public class Search_a_2D_MatrixTest extends TestCase {

    @Test
    public void testSearchMatrix() {
        Search_a_2D_Matrix sa2M = new Search_a_2D_Matrix();

        assertThat(sa2M.searchMatrix(new int[][]{
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        }, 3)).isEqualTo(true);

        assertThat(sa2M.searchMatrix(new int[][]{
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        }, 13)).isEqualTo(false);
    }
}