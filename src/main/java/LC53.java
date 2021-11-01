public class LC53 {
    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for(int i=1; i<nums.length; ++i) {
            dp[i] = Math.max(nums[i], nums[i] + dp[i-1]);
        }

        int res = Integer.MIN_VALUE;
        for(int i=0; i<dp.length; ++i) {
            if(dp[i] > res) res = dp[i];
        }

        return res;

    }
}
