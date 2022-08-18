package per.khr.java.BruteForce;

import per.khr.java.vo.TreeNode;

public class Symmetric_Tree {
    public boolean recursive(TreeNode q, TreeNode p) {
        if (q == null && p != null) return false;
        if (q != null && p == null) return false;
        if (q == null && p == null) return true;

        if (q.val != p.val) return false;

        return recursive(q.left, p.right) && recursive(q.right, p.left);
    }

    public boolean isSymmetric(TreeNode root) {
        TreeNode q = root.left;
        TreeNode p = root.right;

        return recursive(q, p);
    }
}
