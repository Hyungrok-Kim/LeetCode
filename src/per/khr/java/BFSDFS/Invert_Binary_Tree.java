package per.khr.java.BFSDFS;

import per.khr.java.vo.TreeNode;

public class Invert_Binary_Tree {
    private void dfs(TreeNode targetNode) {
        if (targetNode == null) return ;

        TreeNode temp = new TreeNode();

        temp = targetNode.left;
        targetNode.left = targetNode.right;
        targetNode.right = temp;

        dfs(targetNode.left);
        dfs(targetNode.right);
    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;

        dfs(root);

        return root;
    }
}
