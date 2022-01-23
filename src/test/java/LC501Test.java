import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class LC501Test {

    @Test
    void findMode() {
        TreeNode c1 = new TreeNode(1);
        TreeNode c2 = new TreeNode(2);
        TreeNode c3 = new TreeNode(2);
        c1.right = c2;
        c2.left = c3;
        LC501 lc = new LC501();
        int[] ans = lc.findMode(c1);
        Assertions.assertArrayEquals(new int[]{2}, ans);
    }

    @Test
    void shouldReturn1And2WhenTheyAllAppearOnce() {
        TreeNode c1 = new TreeNode(1);
        c1.right = new TreeNode(2);
        LC501 lc = new LC501();
        int[] ans = lc.findMode(c1);
        Assertions.assertArrayEquals(new int[]{1, 2}, ans);

    }
}