package per.khr.java.BFSDFS;

import per.khr.java.vo.TreeNode;

public class Serialize_and_Deserialize_Binary_Tree {
    private StringBuilder sb = new StringBuilder();
    private int nullCount = 0;

    private void bfs(TreeNode target) {
        if (target == null) {
            sb.append("null,");
            nullCount += 1;
        }
        else {
            sb.append(String.valueOf(target.val));
            nullCount = 0;
        }
    }
    public String serialize(TreeNode root) {
        if (root == null) return null;

        serialize(root.left);
        serialize(root.right);

        sb.delete(sb.length() - 1, sb.length());

        return sb.toString();
    }

    public TreeNode deserialize(String data) {
        return null;
    }
}
