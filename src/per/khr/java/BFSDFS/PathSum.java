package per.khr.java.BFSDFS;

import per.khr.java.vo.TreeNode;

import java.util.HashSet;
import java.util.Iterator;

public class PathSum {
    HashSet<Integer> hs = new HashSet<>();

    public void recursive(TreeNode target, int sum) {
        if (target.left == null && target.right == null) {
            hs.add(sum);
            return;
        }

        if (target.left != null) recursive(target.left, sum + target.left.val);
        if (target.right != null) recursive(target.right, sum + target.right.val);
    }

    /**
     * 4ms
     * faster than 5.65%
     */
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;

        recursive(root, root.val);

        Iterator i = hs.iterator();

        while (i.hasNext()) {
            if ((int) i.next() == targetSum) return true;
        }

        return false;
    }

    /**
     * 1ms
     * faster than 58.76%
     * @param root
     * @param targetSum
     * @return
     */
    public boolean hasPathSum2(TreeNode root, int targetSum) {
        if (root == null) return false;

        if (root.left == null && root.right == null && targetSum - root.val == 0) return true;

        return hasPathSum2(root.left, targetSum - root.val) || hasPathSum2(root.right, targetSum - root.val);
    }
}
