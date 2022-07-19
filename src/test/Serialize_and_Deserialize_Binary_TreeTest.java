import junit.framework.TestCase;
import org.junit.Test;
import per.khr.java.BFSDFS.Serialize_and_Deserialize_Binary_Tree;
import per.khr.java.vo.TreeNode;

import static org.assertj.core.api.Assertions.assertThat;

public class Serialize_and_Deserialize_Binary_TreeTest extends TestCase {

    @Test
    public void testSerialize() {
        TreeNode param = new TreeNode(1, new TreeNode(2), new TreeNode(3, new TreeNode(4), new TreeNode(5)));
        Serialize_and_Deserialize_Binary_Tree sadbt = new Serialize_and_Deserialize_Binary_Tree();

        assertThat(sadbt.serialize(param)).isEqualTo("1,2,3,null,null,4,5");
    }

    public void testDeserialize() {
    }
}