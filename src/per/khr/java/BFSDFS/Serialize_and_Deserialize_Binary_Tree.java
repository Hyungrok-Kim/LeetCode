package per.khr.java.BFSDFS;

import per.khr.java.vo.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * BFS를 구현하는 문제?
 * BFS는 어떻게 구현하느냐..
 * visited Array와 needVisit Stack을 이용해서 구현하면 될 듯..?
 */
public class Serialize_and_Deserialize_Binary_Tree {
    public String serialize(TreeNode root) {
        if (root == null) return null;

        ArrayList<String> visited = new ArrayList<>();
        Queue<TreeNode> needVisit = new LinkedList<>();

        needVisit.offer(root);

        while (!needVisit.isEmpty()) {
            TreeNode target = needVisit.poll();

            if (target == null) visited.add("null");
            else {
                visited.add(String.valueOf(target.val));

                if (target.left == null) needVisit.offer(null);
                else needVisit.offer(target.left);

                if (target.right == null) needVisit.offer(null);
                else needVisit.offer(target.right);
            }
        }

        for (int i = visited.size() - 1; i >= 0; --i) {
            if (visited.get(i).equals("null")) visited.remove(i);
            else break;
        }

        return String.join(",", visited);
    }

    public TreeNode deserialize(String data) {
        if (data.isBlank()) return null;

        String[] nodeArr = data.split(",");
        Queue<String> needVisit = new LinkedList<>();
        Queue<TreeNode> targetList = new LinkedList<>();

        for (String node : nodeArr) {
            needVisit.offer(node);
        }

        TreeNode target = null;

        TreeNode root = new TreeNode(Integer.parseInt(needVisit.poll()));
        targetList.offer(root);
        while (!needVisit.isEmpty()) {
            target = targetList.poll();

            String left = needVisit.poll();

            if (!left.equals("null")) {
                target.left = new TreeNode(Integer.parseInt(left));
                targetList.offer(target.left);
            }

            String right = needVisit.poll();

            if (!right.equals("null")) {
                target.right = new TreeNode(Integer.parseInt(right));
                targetList.offer(target.right);
            }
        }

        return target;
    }
}
