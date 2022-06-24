package per.khr.java.Else;

import per.khr.java.vo.TreeNode;

import java.util.TreeSet;

public class Maximum_Depth_of_Binary_Tree {
    TreeSet<Integer> ts = new TreeSet<>();

    public void searchDepth(TreeNode target, int depth) {
        if (target.left == null && target.right == null) ts.add(depth);
        else {
            if (target.left != null) searchDepth(target.left, depth + 1);
            if (target.right != null) searchDepth(target.right, depth + 1);
        }
    }

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        searchDepth(root, 1);

        return ts.pollLast();
    }

//    한줄 답안
//    public static int maxDepth(TreeNode root) {
//        return (root == null) ? 0 : 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
//    }
}
