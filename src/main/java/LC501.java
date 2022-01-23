
import java.util.ArrayList;
import java.util.List;

public class LC501 {
    int base = 0;
    int count = 0;
    int maxCount = 0;
    List<Integer> ans  = new ArrayList<>();

    public int[] findMode(TreeNode root) {

        traverse(root);
        int[] mode = new int[ans.size()];
        for(int i=0; i<ans.size(); i++) {
            mode[i] = ans.get(i);
        }
        return mode;
    }

    public void traverse(TreeNode node) {
        if(node == null) return;
        traverse(node.left);
        if(node.val == base) {
            count++;
        } else {
            base = node.val;
            count = 1;
        }
        update(base);
        traverse(node.right);
    }

    public void update(int val) {
        if(count == maxCount) {
            ans.add(val);
        }

        if(count > maxCount) {
            maxCount = count;
            ans.clear();
            ans.add(val);
        }
    }
}
