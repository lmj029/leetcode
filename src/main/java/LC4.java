import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LC4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }
        int left = 0;
        int right = nums1.length;
        double median_left = 0.0;
        double median_right = 0;

        while(left <= right) {
            int i = (left + right + 1) / 2;
            int j = (nums1.length + nums2.length + 1) / 2 - i;

            int nums1_left = i == 0 ? Integer.MIN_VALUE : nums1[i - 1];
            int nums1_right = i == nums1.length ? Integer.MAX_VALUE : nums1[i];
            int nums2_left = j == 0 ? Integer.MIN_VALUE : nums2[j-1];
            int nums2_right = j == nums2.length ? Integer.MAX_VALUE : nums2[j];

            if(nums1_left <= nums2_right) {
                median_left = Math.max(nums1_left, nums2_left);
                median_right = Math.min(nums1_right, nums2_right);
                left = i + 1;
            } else {
                right = i - 1;
            }
        }

        if((nums1.length + nums2.length) % 2 == 1) return median_left;

        return (median_left + median_right) / 2.0;
    }
}
