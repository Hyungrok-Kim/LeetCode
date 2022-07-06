import junit.framework.TestCase;
import org.junit.Test;
import per.khr.java.BFSDFS.PathSum;
import per.khr.java.vo.TreeNode;

import static org.assertj.core.api.Assertions.assertThat;

public class PathSumTest extends TestCase {

    @Test
    public void testHasPathSum() {
        TreeNode tree = new TreeNode(1, new TreeNode(2), new TreeNode(3));

        PathSum ps = new PathSum();

        assertThat(ps.hasPathSum(tree, 5)).isEqualTo(false);
    }
}