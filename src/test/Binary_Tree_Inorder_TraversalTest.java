import junit.framework.TestCase;
import per.khr.java.Else.Binary_Tree_Inorder_Traversal;
import per.khr.java.vo.TreeNode;

public class Binary_Tree_Inorder_TraversalTest extends TestCase {

    public void testInorderTraversal() {
        Binary_Tree_Inorder_Traversal brit = new Binary_Tree_Inorder_Traversal();

        TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));

        brit.inorderTraversal(root);
    }
}