import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LC121Test {

    @Test
    void maxProfit() {
        int[] input = {7,1,5,3,6,4};
        LC121 lc = new LC121();
        Assertions.assertEquals(lc.maxProfit(input), 5);
    }
}