public class LC235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return root;
        TreeNode ancestor = root;
        while(true) {
            if(p.val > ancestor.val && q.val > ancestor.val) {
                ancestor = ancestor.right;
            } else if(p.val < ancestor.val && q.val < ancestor.val) {
                ancestor = ancestor.left;
            } else {
                break;
            }
        }
        return ancestor;
    }
}
