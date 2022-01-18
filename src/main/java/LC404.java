import java.util.ArrayList;
import java.util.List;

public class LC404 {
    public int sumOfLeftLeaves(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        traverse(root.left, "left", ans);
        traverse(root.right, "right", ans);
        return ans.stream().reduce(0, Integer::sum);
    }

    private void traverse(TreeNode node, String op, List<Integer> ans) {
        if(node == null) return;

        if(node.left == null && node.right == null && "left".equals(op)) {
            ans.add(node.val);
        }

        traverse(node.left, "left", ans);
        traverse(node.right, "right", ans);

    }


}
