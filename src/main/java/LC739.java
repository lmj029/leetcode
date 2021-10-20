import java.util.Arrays;
import java.util.Stack;

public class LC739 {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] newSource = new int[temperatures.length + 1];
        newSource[0] = Integer.MAX_VALUE;
        for(int i=0; i<temperatures.length; i++) {
            newSource[i+1] = temperatures[i];
        }

        Stack<Integer> stack = new Stack<>();
        int[] res = new int[temperatures.length];

        stack.push(0);
        for(int i = 1; i< newSource.length; i++) {
            while(newSource[i] > newSource[stack.peek()] ) {
                int top = stack.pop();
                res[top - 1] = i - top;
            }
            stack.push(i);
        }
        return res;
    }
}
