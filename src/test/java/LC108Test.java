import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LC108Test {

    @Test
    void sortedArrayToBST() {
        LC108 lc = new LC108();
        int[] input = {-10,-3,0,5,9};
        lc.sortedArrayToBST(input);
    }
}