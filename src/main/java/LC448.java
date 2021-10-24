import java.util.ArrayList;
import java.util.List;

public class LC448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for(int num : nums) {
            int x = (num - 1) % nums.length;
            nums[x] += nums.length;
        }
        List<Integer> res = new ArrayList<>();
        for(int i=0; i< nums.length; ++i) {
            if(nums[i] <= nums.length) {
                res.add(i+1);
            }
        }
        return res;
    }
}
