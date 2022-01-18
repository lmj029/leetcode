import java.util.ArrayList;
import java.util.List;

public class LC257 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        if(root != null) dfs(root, "", ans);
        return new ArrayList<>(ans);
    }

    public void dfs(TreeNode node, String path, List<String> ans) {
        String newPath = path.isEmpty() ? String.valueOf(node.val) : path + "->" + node.val;

        if(node.left == null && node.right == null) {
            ans.add(newPath);
            return;
        }

        if(node.left != null) {
            dfs(node.left, newPath, ans);
        }

        if(node.right != null) {
            dfs(node.right, newPath, ans);
        }
    }


}
