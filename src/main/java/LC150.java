import java.util.*;
import java.util.function.BiFunction;

public class LC150 {
    public Map<String, BiFunction<Integer, Integer, Integer>> operators = new HashMap<String, BiFunction<Integer, Integer, Integer>>(){
        {
            put("+", Integer::sum);
            put("-", (a, b) -> {
                return a - b;
            });
            put("*", (a, b) -> {
                return a * b;
            });
            put("/", (a, b) -> {
                return a / b;
            });
        }
    };



    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();

        for (String token : tokens) {
            if (operators.containsKey(token)) {
                int second = stack.pop();
                int first = stack.pop();
                stack.push(operators.get(token).apply(first, second));
            } else {
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }
}
