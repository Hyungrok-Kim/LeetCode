import junit.framework.TestCase;
import org.junit.Test;
import per.khr.java.Else.Merge_Sorted_Arrray;

public class Merge_Sorted_ArrrayTest extends TestCase {

    @Test
    public void testMerge() {
        Merge_Sorted_Arrray msa = new Merge_Sorted_Arrray();

        msa.merge(new int[]{1,2,3,0,0,0}, 3, new int[] {2,5,6}, 3);
    }
}