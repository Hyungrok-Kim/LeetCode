package per.khr.java.Else;

import per.khr.java.vo.TreeNode;

import java.util.TreeSet;

public class Minimum_Depth_of_Binary_Tree {
    TreeSet<Integer> ts = new TreeSet<>();

    public void getMinDepth(TreeNode target, int depth) {
        if (target.left == null && target.right == null) {
            ts.add(depth + 1);
            return;
        }

        if (target.left != null) getMinDepth(target.left, depth + 1);
        if (target.right != null) getMinDepth(target.right, depth + 1);
    }

//    public int minDepth(TreeNode root) {
//        if (root == null) return 0;
//        if (root.left == null && root.right == null) return 1;
//
//        if (root.left != null) getMinDepth(root.left, 1);
//        if (root.right != null) getMinDepth(root.right, 1);
//
//        return ts.pollFirst();
//    }

//    심플 답안
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        int left = 1 + minDepth(root.left);
        int right = 1 + minDepth(root.right);

        if (root.left == null) return right;
        if (root.right == null) return left;

        return Math.min(left, right);
    }
}
