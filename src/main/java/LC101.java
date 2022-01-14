public class LC101 {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return isSymmetricTree(root.left, root.right);

    }

    public boolean isSymmetricTree(TreeNode leftRoot, TreeNode rightRoot) {
        if(leftRoot == null && rightRoot == null) return true;

        if(leftRoot != null && rightRoot != null) {
            return (leftRoot.val == rightRoot.val) && isSymmetricTree(leftRoot.left, rightRoot.right) && isSymmetricTree(leftRoot.right, rightRoot.left);
        }

        return false;
    }
}
