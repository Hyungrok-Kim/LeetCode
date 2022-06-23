package per.khr.java.Stack;

import per.khr.java.vo.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Binary_Tree_Inorder_Traversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> treeStack = new Stack<>();
        List<Integer> resultList = new ArrayList<>();

        TreeNode target = root;

        while (target != null || !treeStack.empty()) {
            while(target != null) {
                treeStack.push(target);
                target = target.left;
            }

            TreeNode temp = treeStack.pop();
            resultList.add(temp.val);
            target = temp.right;
        }

        return resultList;
    }
}
