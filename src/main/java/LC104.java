public class LC104 {
    int depth = 0;

    public int maxDepth(TreeNode root) {
        traverseTree(root, 1);
        return depth;
    }

    public void traverseTree(TreeNode root, int level) {
        if(root == null) return;

        depth = Math.max(depth, level);
        traverseTree(root.left, level + 1);
        traverseTree(root.right, level + 1);
    }
}
