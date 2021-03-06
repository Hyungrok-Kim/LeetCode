package per.khr.java.BFSDFS;

import per.khr.java.vo.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 각각의 Tree depth마다 가장 오른쪽에 있는 값을 List에 담아야 한다.
 * 재귀로 풀어야겠고 오른쪽을 확인 후 Null이면 왼쪽이겠지?
 */
public class Binary_Tree_Right_Side_View {
    /**
     * dfs 방식으로 탐색하게 되면 모든 노드를 탐색해서 가장 깊은 depth가 뭔 지 파악해야하기 때문에 비효율적일 듯 하다.
     * 그래서 bfs
     */
    public void bfs(TreeNode node, ArrayList<Integer> result, int depth) {
        if (depth > result.size()) result.add(node.val);

        if (node.right != null) bfs(node.right, result, depth + 1);
        if (node.left != null) bfs(node.left, result, depth + 1);

        return;
    }

    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();

        if (root == null) return result;
        else result.add(root.val);

        int depth = 1;

        // 기본적으로 다음 노드가 있을 때 보내야 해.
        if (root.right != null) bfs(root.right, result, depth + 1);
        if (root.left != null) bfs(root.left, result, depth + 1);

        return result;
    }
}
