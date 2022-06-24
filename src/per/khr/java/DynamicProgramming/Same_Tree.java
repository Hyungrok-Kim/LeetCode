package per.khr.java.DynamicProgramming;

import per.khr.java.vo.TreeNode;

public class Same_Tree {
    // 전위 순회(Root -> L -> R) 순으로 비교하면 되겠지?

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;

        if(p == null && q != null) return false;

        if(p != null && q == null) return false;

        if(p.val != q.val) return false;

        boolean leftResult = isSameTree(p.left, q.left);
        boolean rightResult = isSameTree(p.right, q.right);

        return leftResult && rightResult;
    }
}
