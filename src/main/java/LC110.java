public class LC110 {
//    public boolean isBalanced(TreeNode root) {
//        if(root == null) return true;
//
//        return Math.abs(getHeight(root.left) - getHeight(root.right)) < 2 && isBalanced(root.left) && isBalanced(root.right);
//
//    }
//
//    private int getHeight(TreeNode node) {
//        if(node == null) return 0;
//
//        return Math.max(getHeight(node.left), getHeight(node.right)) + 1;
//    }

    public boolean isBalanced(TreeNode root) {
        return height(root) >= 0;
    }

    private int height(TreeNode root) {
        if(root == null) return 0;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        if(leftHeight == -1 || rightHeight == -1 || Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }

        return Math.max(leftHeight, rightHeight) + 1;
    }

}
