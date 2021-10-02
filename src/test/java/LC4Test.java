import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LC4Test {

    @Test
    void findMedianSortedArrays() {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        double expected = 2.5;
        LC4 lc4 = new LC4();
        Assertions.assertEquals(expected, lc4.findMedianSortedArrays(nums1, nums2));
    }
}