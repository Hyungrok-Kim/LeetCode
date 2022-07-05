import junit.framework.TestCase;
import org.junit.Test;
import per.khr.java.BinarySearch.Find_Peak_Element;

import static org.assertj.core.api.Assertions.assertThat;

public class Find_Peak_ElementTest extends TestCase {

    @Test
    public void testFindPeakElement() {
        Find_Peak_Element fpe = new Find_Peak_Element();

        assertThat(fpe.findPeakElement(new int[]{1, 2, 3, 1})).isEqualTo(2);
        assertThat(fpe.findPeakElement(new int[]{2,1})).isEqualTo(0);
    }
}