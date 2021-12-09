import java.util.ArrayDeque;
import java.util.Deque;

public class LC121 {
    public int maxProfit(int[] prices) {
        Deque<Integer> stack = new ArrayDeque<>();
        int res = 0;
        stack.push(prices[0]);
        for(int i=1; i< prices.length; i++) {
            while( !stack.isEmpty() && prices[i] < stack.peek()) {
                stack.pop();
            }
            if(stack.isEmpty()) {
                stack.push(prices[i]);
            } else {
                stack.push(prices[i]);
                res = Math.max(res, prices[i] - stack.getLast());
            }

        }
        return res;

    }
}
