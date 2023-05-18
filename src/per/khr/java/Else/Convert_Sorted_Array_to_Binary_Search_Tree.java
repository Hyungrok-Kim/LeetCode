package per.khr.java.Else;

import per.khr.java.vo.TreeNode;

public class Convert_Sorted_Array_to_Binary_Search_Tree {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 1)
            return new TreeNode(nums[0]);
        return makeTree(nums, 0, nums.length - 1);
    }

    private TreeNode makeTree(int[] nums, int left, int right){
        if(left > right){
            return null;
        }

        if(left == right){
            return new TreeNode(nums[left]);
        }
        int mid = left + (right - left) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = makeTree(nums, left, mid - 1);
        root.right = makeTree(nums, mid + 1, right);
        return root;
    }
}
