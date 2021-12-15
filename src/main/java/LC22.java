import java.util.ArrayList;
import java.util.List;

public class LC22 {
    public List<String> generateParenthesis(int n) {
        return internalSolutionOne(n);
    }

    private List<String> internalSolutionOne(int n) {
        List<String> ans  = new ArrayList<>();
        generate("", n, n, ans);
        return ans;
    }

    private void generate(String s, int left, int right, List<String> ans) {
        if(left == 0 && right == 0) {
            ans.add(s);
            return;
        }

        if(left == right) {
            generate(s+"(", left - 1, right, ans);
        } else if(left < right) {
            if(left>0) {
                generate(s+"(", left - 1, right, ans);
            }

            generate(s+")", left, right - 1, ans);
        }

    }


}
