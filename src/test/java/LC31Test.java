import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LC31Test {

    @Test
    void nextPermutation() {
        LC31 lc = new LC31();
        int[] nums = new int[] {1,3,2};
        lc.nextPermutation(nums);
    }
}