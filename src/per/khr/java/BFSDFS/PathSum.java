package per.khr.java.BFSDFS;

import per.khr.java.vo.TreeNode;

public class PathSum {
    public boolean recursive(TreeNode target, int sum, int targetSum) {
        if (target.left == null && target.right == null) {
            if (sum == targetSum) return true;
            else return false;
        }

        if (target.left != null && target.right != null )
            return recursive(target.left, sum + target.left.val, targetSum) || recursive(target.right, sum + target.right.val, targetSum);

        if (target.left != null) return recursive(target.left, sum + target.left.val, targetSum);
        else if (target.right != null) return recursive(target.right, sum + target.right.val, targetSum);

        return false;
    }

    /**
     * 1ms
     * faster than 58.76%
     * @param root
     * @param targetSum
     * @return
     */
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;

        recursive(root, root.val, targetSum);

        return recursive(root, root.val, targetSum);
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
