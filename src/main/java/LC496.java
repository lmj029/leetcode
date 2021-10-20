import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class LC496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        Arrays.fill(res, -1);

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums1.length; i++) {
            map.put(nums1[i],i);
        }

        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<nums2.length; i++) {
            while (!stack.isEmpty() && nums2[i] > stack.peek()) {
                int top = stack.pop();
                if(map.containsKey(top)) {
                    res[map.get(top)] = nums2[i];
                }
            }
            stack.push(nums2[i]);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        LC496 lc = new LC496();
        lc.nextGreaterElement(nums1, nums2);


    }
}
