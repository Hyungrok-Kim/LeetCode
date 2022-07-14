import junit.framework.TestCase;
import org.junit.Test;
import per.khr.java.BFSDFS.Binary_Tree_Right_Side_View;
import per.khr.java.vo.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class Binary_Tree_Right_Side_ViewTest extends TestCase {

    @Test
    public void testRightSideView() {
        Binary_Tree_Right_Side_View btrsv = new Binary_Tree_Right_Side_View();
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4), null), new TreeNode(3));

        assertThat(btrsv.rightSideView(root)).isEqualTo(new ArrayList<>(Arrays.asList("1, 3, 4")));

    }
}