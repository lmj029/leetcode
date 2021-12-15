import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LC22Test {

    @Test
    void generateParenthesis() {
        LC22 lc = new LC22();
        lc.generateParenthesis(3).stream().forEach(System.out::println);

    }
}