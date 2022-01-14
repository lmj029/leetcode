public class LC111 {
    public int minDepth(TreeNode root) {
        return height(root);
    }

    public int height(TreeNode root) {
        if(root == null) return 0;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        if(leftHeight == 0 || rightHeight == 0) {
            return Math.abs(rightHeight - leftHeight) + 1;
        }



        return Math.min(leftHeight, rightHeight) + 1;
    }
}
