import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LC150Test {

    @Test
    void evalRPN() {
        LC150 lc = new LC150();
        String[] tokens = {"4","13","5","/","+"};
        int expected = 6;
        Assertions.assertEquals(expected, lc.evalRPN(tokens));
    }
}