import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class LC20 {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        char[] str = s.toCharArray();
        Map<Character, Character> expectedMap = new HashMap<>();
        expectedMap.put(')','(');
        expectedMap.put(']','[');
        expectedMap.put('}','{');
        for(int i=0; i<str.length; ++i) {
            if(expectedMap.values().contains(str[i])) {
                stack.push(str[i]);
            } else {
                if(!expectedMap.get(str[i]).equals(stack.peek())) {
                    return false;
                }
                stack.pop();
            }
        }

        return stack.isEmpty();

    }
}
