public class LC169 {
    public int majorityElement(int[] nums) {
        int candicate = 0;
        int count = 0;
        for(int i = 0; i< nums.length; ++i) {
            if(count == 0) {
                candicate = nums[i];
                count++;
            } else {
                if(candicate == nums[i]){
                    count++;
                } else {
                    count--;
                }
            }
        }
        return candicate;

    }
}
