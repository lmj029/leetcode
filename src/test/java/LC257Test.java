import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LC257Test {

    @Test
    void binaryTreePaths() {
        LC257 lc = new LC257();
        TreeNode root = new TreeNode(1);
        TreeNode child1 = new TreeNode(2);
        TreeNode child2 = new TreeNode(3);
        root.left = child1;
        root.right = child2;

        TreeNode child3 = new TreeNode(5);
        child1.right = child3;
        List<String> ans = lc.binaryTreePaths(root);
        ans.forEach(System.out::println);
    }
}