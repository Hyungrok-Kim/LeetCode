package per.khr.java.BFSDFS;

import per.khr.java.vo.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 각각의 Tree depth마다 가장 오른쪽에 있는 값을 List에 담아야 한다.
 * 재귀로 풀어야겠고
 * 오른쪽을 확인 후 Null이면 왼쪽이겠지?
 */
public class Binary_Tree_Right_Side_View {
    private static ArrayList<Integer> result = new ArrayList<>();

    /**
     * dfs 방식으로 탐색하면 비효율적일듯..?
     * 그래서 bfs
     */
    public void bfs(TreeNode node) {
        result.add(node.val);

        if (node.right != null) bfs(node.right);
        else if (node.left != null) bfs(node.left);

        return;
    }

    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) return result;
        else result.add(root.val);

        // 기본적으로 다음 노드가 있을 때 보내야 해.
        if (root.right != null) bfs(root.right);
        else if (root.left != null) bfs(root.left);

        return result;
    }
}
