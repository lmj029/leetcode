import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class LC1Test {

    @org.junit.jupiter.api.Test
    void twoSum() {
        int[] input = {2,7,11,15};
        LC1 lc1 = new LC1();
        int[] expected = {0,1};
        Assertions.assertArrayEquals(expected, lc1.twoSum(input, 9));
    }
}